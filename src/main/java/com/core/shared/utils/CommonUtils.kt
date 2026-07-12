package com.core.shared.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Build
import android.os.CountDownTimer
import android.provider.Settings
import android.view.WindowManager
import android.webkit.MimeTypeMap
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import coil.load
import com.bumptech.glide.Glide
import com.core.shared.BuildConfig
import com.core.shared.R
import com.core.shared.error.SmartZoneError
import com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import java.io.File
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.Timer
import java.util.TimerTask

object CommonUtils {

    // operation read Android ID from device.
    @Suppress("HardwareIds")
    fun getAndroidId(context: Context): String {
        return when {
            BuildConfig.DEBUG -> "xxx"
            else -> Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
        }
    }

    fun getDeviceInformation(): String {
        return """
            VERSION.RELEASE : ${Build.VERSION.RELEASE}
            VERSION.INCREMENTAL : ${Build.VERSION.INCREMENTAL}
            VERSION.SDK.NUMBER : ${Build.VERSION.SDK_INT}
            BOARD : ${Build.BOARD}
            BOOTLOADER : ${Build.BOOTLOADER}
            BRAND : ${Build.BRAND}
            DISPLAY : ${Build.DISPLAY}
            FINGERPRINT : ${Build.FINGERPRINT}
            HARDWARE : ${Build.HARDWARE}
            HOST : ${Build.HOST}
            ID : ${Build.ID}
            MANUFACTURER : ${Build.MANUFACTURER}
            MODEL : ${Build.MODEL}
            PRODUCT : ${Build.PRODUCT}
            TAGS : ${Build.TAGS}
            TYPE : ${Build.TYPE}
            """.trimIndent()
    }

    val isProbablyRunningOnEmulator: Boolean by lazy {
        // Android SDK emulator
        return@lazy ((Build.FINGERPRINT.startsWith("google/sdk_gphone_")
                && Build.FINGERPRINT.endsWith(":user/release-keys")
                && Build.MANUFACTURER == "Google" && Build.PRODUCT.startsWith("sdk_gphone_") && Build.BRAND == "google"
                && Build.MODEL.startsWith("sdk_gphone_"))
                //
                || Build.FINGERPRINT.startsWith("generic")
                || Build.FINGERPRINT.startsWith("unknown")
                || Build.MODEL.contains("google_sdk")
                || Build.MODEL.contains("Emulator")
                || Build.MODEL.contains("Android SDK built for x86")
                //bluestacks
                || Build.MANUFACTURER.contains("Genymotion")
                || Build.HOST.startsWith("Build") //MSI App Player
                || Build.HOST.contains("nease.net") //MUMU Player on mac
                || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")
                || Build.PRODUCT.lowercase(Locale.getDefault()).contains("nox")
                || Build.BOARD.lowercase(Locale.getDefault()).contains("nox")
                || Build.BOOTLOADER.lowercase(Locale.getDefault()).contains("nox")
                || Build.SERIAL.lowercase(Locale.getDefault()).contains("nox")
                || Build.HARDWARE.contains("ranchu")
                || Build.MODEL.lowercase(Locale.getDefault()).contains("droid4x")
                || Build.HARDWARE.equals("vbox86")
                || Build.PRODUCT.contains("sdk_x86")
                || Build.PRODUCT.contains("vbox86p")
                || Build.PRODUCT.contains("simulator")
                || Build.PRODUCT.contains("sdk_gphone64_arm64")
                || Build.HARDWARE.contains("goldfish")
                || Build.PRODUCT == "google_sdk")
    }


    fun setLayoutParams(dialog: Dialog) {
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.copyFrom(dialog.window?.attributes)
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT
        dialog.window?.attributes = layoutParams
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }


    fun ImageView.load(context: Context, image: Any) {
        this.load(image) {
            crossfade(true)
            placeholder(circularProgressDrawable(context))
        }
    }

    fun ImageView.loadGif(context: Context, image: Int) {
        Glide.with(context)
            .asGif()
            .load(image) // <-- resource from drawable
            .into(this)
    }

    private fun circularProgressDrawable(context: Context) =
        CircularProgressDrawable(context).apply {
            strokeWidth = 5f
            centerRadius = 100f
            setColorSchemeColors(ContextCompat.getColor(context, R.color.blue_login_button))
            start()
        }

    fun <T> getLocalizedValue(enValue: T, localeValue: T) = when ((Locale.getDefault().language)) {
        "en" -> enValue
        else -> localeValue
    }


    fun bitmapFromVector(activity: Activity, @DrawableRes vectorResId: Int): BitmapDescriptor {
        val vector = ContextCompat.getDrawable(activity, vectorResId)
        vector!!.setBounds(0, 0, vector.intrinsicWidth, vector.intrinsicHeight)
        val bitmap = Bitmap.createBitmap(
            vector.intrinsicWidth, vector.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        vector.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }


    fun startApplicationSetting(activity: Activity) {
        val intent = Intent()
        intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
        val uri = Uri.fromParts("package", activity.packageName, null)
        intent.data = uri
        activity.startActivity(intent)
    }

    fun openTheLocationSetting(activity: Activity) {
        val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
        activity.startActivity(intent)
    }


    fun getCurrentTime() = getSimpleDateFormat("HH:mm")


    fun getCurrentDate() = getSimpleDateFormat("yyyy-MM-dd")


    @SuppressLint("SimpleDateFormat")
    private fun getSimpleDateFormat(pattern: String): String {
        val currentDate = Date()
        val dateFormat = SimpleDateFormat(pattern, Locale.ENGLISH)
        return dateFormat.format(currentDate)
    }


    @SuppressLint("SimpleDateFormat")
    fun decodeDateString(dateString: String, inputPattern: String, outputPattern: String): String {
        var date: String? = null
        try {
            val inputFormat = SimpleDateFormat(inputPattern, Locale.ENGLISH)
            val outputFormat = SimpleDateFormat(outputPattern, Locale.ENGLISH)
            val parseDate = inputFormat.parse(dateString)
            date = parseDate?.let { outputFormat.format(it) }
        } catch (e: ParseException) {
            SmartZoneError.E(exception = e, logMessage = "Date can not be parsing")
        }
        return (date ?: "")
    }


    @SuppressLint("SimpleDateFormat")
    fun isDatePassed(
        serverDate: String,
        deadLineDate: String,
        inputPattern: String? = null
    ): Boolean {
        var firstDate = Date()
        var secondDate = Date()
        val pattern = inputPattern ?: "yyyy-MM-dd HH:mm:ss"
        val simpleFormat = SimpleDateFormat(pattern, Locale.ENGLISH)
        try {
            firstDate = simpleFormat.parse(serverDate) as Date
            secondDate = simpleFormat.parse(deadLineDate) as Date
        } catch (e: ParseException) {
            SmartZoneError.E(exception = e, logMessage = "Date can not be parsing")
        }
        return firstDate > secondDate
    }


    fun getTime(milliseconds: Long): String {
        val sec = (milliseconds / 1000) % 60
        val min = (milliseconds / (1000 * 60) % 60)
        val hr = (milliseconds / (1000 * 60 * 60) % 24)
        val stringBuilder = StringBuilder()
        if (hr <= 9) {
            stringBuilder.append("0$hr : ")
        } else {
            stringBuilder.append("$hr : ")
        }
        if (min <= 9) {
            stringBuilder.append("0$min : ")
        } else {
            stringBuilder.append("$min : ")
        }
        if (sec <= 9) {
            stringBuilder.append("0$sec")
        } else {
            stringBuilder.append(sec)
        }
        return stringBuilder.toString()
    }

    fun getDatePlusTwentyFourHour(pattern: String): String {
        val currentTime = Calendar.getInstance()
        currentTime.add(Calendar.HOUR_OF_DAY, 24)
        val updatedDate = currentTime.time
        val dateFormat = SimpleDateFormat(pattern, Locale.ENGLISH)
        return dateFormat.format(updatedDate)
    }


    fun openFileWithActionView(activity: Activity, fileUri: Uri) {
        val extension = fileUri.toString().substringAfterLast('.', "")
        val mimeType = getMimeTypeFromExtension(extension)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(fileUri, mimeType)
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        try {
            activity.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            SmartZoneError.E(exception = e, logMessage = "Open file with action view error")
        }
    }

    private fun getMimeTypeFromExtension(extension: String): String {
        return when (extension.lowercase(Locale.getDefault())) {
            "jpg", "jpeg", "png" -> "image/*"
            "pdf" -> "application/pdf"
            "docx", "doc" -> "application/*"
            else -> "*/*"
        }
    }

    fun handleTimerCallBack(delay: Long, period: Long, action: () -> Unit) {
        val timer = Timer()
        val scrollTask = object : TimerTask() {
            override fun run() {
                action.invoke()
            }
        }
        timer.schedule(scrollTask, delay, period)
    }

    fun sendPhoneNumberToDial(context: Context, mobileNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel: $mobileNumber")
        context.startActivity(intent)
    }


    fun countDownTimer(
        delay: Long, countDownTimer: Long,
        onTick: (Long, Long) -> Unit,
        onFinished: () -> Unit
    ): CountDownTimer? = object : CountDownTimer(delay, countDownTimer) {
        override fun onTick(millisUntilFinished: Long) {
            onTick(delay, millisUntilFinished)
        }

        override fun onFinish() = onFinished()

    }.start()


    fun parseDrawableToString(context: Context, @DrawableRes drawable: Int): String {
        val androidRes = "android.resource://"
        val uri = Uri.parse(androidRes + context.packageName + "/" + drawable)
        return uri.toString()
    }

    fun showPermissionErrorPopup(
        activity: Activity, title: Int, message: Int, onBtnClick: () -> Unit = {}
    ) {
        SmartZoneDialogBuilder(activity)
            .setTitle(title)
            .setMessage(message)
            .setIcon(R.drawable.ic_vector_security)
            .setTopButton(R.string.allow) { onBtnClick() }
            .setCancelable(false)
            .show()
    }

    fun getMimeType(file: File): String? {
        val extension = MimeTypeMap.getFileExtensionFromUrl(file.name)
        return if (!extension.isNullOrEmpty()) {
            MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension.lowercase())
        } else {
            "application/octet-stream"
        }
    }

    private fun getExtension(uri: String?): String? {
        if (uri == null) return null
        val dot = uri.lastIndexOf(".")
        return if (dot >= 0) uri.substring(dot) else ""

    }
}