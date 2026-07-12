package com.core.shared.device_config_manager

import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.os.Build
import android.provider.Settings
import androidx.annotation.RequiresApi
import com.core.shared.utils.CommonUtils
import com.core.shared.utils.RootChecker
import com.core.shared.utils.RootUtil
import com.scottyab.rootbeer.RootBeer
import org.koin.core.component.KoinComponent

class DeviceConfigStateManager(
    private val context: Context
) : DeviceConfigStateHelper,
    KoinComponent {


    override fun getDeviceConfigState(onDeviceConfigState: (DeviceConfigState) -> Unit) {
        when {
            isProxyEnabled() -> onDeviceConfigState(DeviceConfigState.IS_PROXY_ENABLED)

            CommonUtils.isProbablyRunningOnEmulator -> onDeviceConfigState(DeviceConfigState.IS_EMULATOR)

            isRooted() -> onDeviceConfigState(DeviceConfigState.IS_ROOTED)

            isTaiChi() -> onDeviceConfigState(DeviceConfigState.IS_NOT_VALID)

            isDeveloperOptionEnabled() -> onDeviceConfigState(DeviceConfigState.IS_DEVELOPER_OPTION_ENABLED)
        }
    }

    private fun isRooted(): Boolean {
        return isRootedDevBeer() || RootChecker.isDeviceRootedNative() || RootUtil.isDeviceRooted()
    }

    private fun isRootedDevBeer(): Boolean {
        val rootBeer = RootBeer(context)
        return when {
            rootBeer.isRooted -> {
                true
            }

            rootBeer.isRootedWithBusyBoxCheck -> {
                true
            }

            else -> {
                false
            }
        }
    }

    private fun isProxyEnabled(): Boolean {
        val proxyHost = System.getProperty("http.proxyHost")
        val proxyPort = System.getProperty("http.proxyPort")?.toIntOrNull() ?: -1
        if (!proxyHost.isNullOrEmpty() && proxyPort != -1) {
            return true // Proxy is enabled
        }
        // Check for Wi-Fi proxy settings
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connectivityManager.activeNetwork
        val linkProperties = connectivityManager.getLinkProperties(activeNetwork)
        linkProperties?.let {
            for (proxy in it.httpProxy?.toString()?.split(",") ?: emptyList()) {
                if (proxy.isNotEmpty()) {
                    return true // Proxy is enabled via Wi-Fi settings
                }
            }
        }
        return false // No proxy detected
    }


    private fun isTaiChi(): Boolean {
        // A list with valid installers package name
        val validInstallers: List<String> =
//      ArrayList(mutableListOf("com.android.vending", "com.google.android.feedback","com.google.android.apps.nbu.files"))
            ArrayList(mutableListOf("me.weishu.exp"))

        // The package name of the app that has installed your app
        val installer = context.packageManager.getInstallerPackageName(context.packageName)

//    showToast("installer===>"+installer)

        // true if your app has been downloaded from Play Store
        return installer != null && validInstallers.contains(installer)

    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    private fun isDeveloperOptionEnabled(): Boolean {
        return when {
            Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN -> {
                Settings.Secure.getInt(
                    context.contentResolver,
                    Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
                ) != 0
                        || Settings.Secure.getInt(
                    context.getContentResolver(),
                    Settings.Global.ADB_ENABLED,
                    0
                ) == 1
            }

            Build.VERSION.SDK_INT == Build.VERSION_CODES.JELLY_BEAN -> {
                @Suppress("DEPRECATION")
                Settings.Secure.getInt(
                    context.contentResolver,
                    Settings.Secure.DEVELOPMENT_SETTINGS_ENABLED, 0
                ) != 0
                        || Settings.Secure.getInt(
                    context.getContentResolver(),
                    Settings.Global.ADB_ENABLED,
                    0
                ) == 1
            }

            else -> false
        }
    }

}