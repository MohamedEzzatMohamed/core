package com.core.shared.utils.dialogs.smart_zone_dialog

import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.os.Handler
import android.os.Looper
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.app.AlertDialog
import androidx.core.text.HtmlCompat
import androidx.core.text.toSpanned
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import com.core.shared.R
import com.core.shared.databinding.LayoutSmartzoneDialogBinding
import com.core.shared.utils.CommonUtils
import com.core.shared.utils.extensions.localize
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class SmartZoneDialogBuilder(activity: Activity, @StyleRes style: Int = R.style.CustomDialogTheme) :
    MaterialAlertDialogBuilder(activity, style) {


    lateinit var binding: LayoutSmartzoneDialogBinding

    private var title: Spanned? = null
    private var message: Spanned? = null
    private var messageInfo: CharSequence? = null
    private var icon: Int? = null
    private var topButtonText: String? = null
    private var bottomButtonText: String? = null
    private var topButtonAction: (() -> Unit)? = null
    private var bottomButtonAction: (() -> Unit)? = null
    private var topButtonVisibility: Boolean? = null
    private var bottomButtonVisibility: Boolean? = null
    private var topButtonStyle: SmartZoneButtonStyle? = null
    private var bottomButtonStyle: SmartZoneButtonStyle? = null
    private var topButtonActionDismiss: Boolean? = null
    private var bottomButtonActionDismiss: Boolean? = null
    private var autoDismissDurationMs: Long? = null
    private var isGifIcon: Boolean = false
    private var externalDismissListener: DialogInterface.OnDismissListener? = null


    override fun create(): AlertDialog {
        binding = LayoutSmartzoneDialogBinding.inflate(LayoutInflater.from(context))
        setView(binding.root)
        val dialog = super.create()
        CommonUtils.setLayoutParams(dialog)
        binding.setUpViews(dialog)

        autoDismissDurationMs?.let { duration ->

            dialog.setOnShowListener {

                val handler = Handler(Looper.getMainLooper())

                val dismissRunnable = Runnable {
                    try {
                        if (dialog.isShowing) {
                            dialog.dismiss()
                        }
                    } catch (_: Exception) {}
                }

                handler.postDelayed(dismissRunnable, duration)

                dialog.setOnDismissListener {
                    handler.removeCallbacks(dismissRunnable)
                    externalDismissListener?.onDismiss(dialog)
                }
            }
        }

        return dialog
    }

    private fun LayoutSmartzoneDialogBinding.setUpViews(dialog: Dialog) {
        title?.let { initializeTitleText(it) }
        message?.let { initializeMessageText(it) }
        messageInfo?.let { initializeMessageInfoText(it) }
//        icon?.let { initializeIcon(it) }
        icon?.let {
            if (isGifIcon) {
                setGifIcon(it)
            } else {
                initializeIcon(it)
            }
        }
        handleTopButton(dialog)
        handleBottomButton(dialog)
    }

    fun addHtmlMessage(message: Int, vararg values: Any): SmartZoneDialogBuilder {
        val localizedMessage = context.localize(message, *values)
        val spanned = HtmlCompat.fromHtml(localizedMessage, HtmlCompat.FROM_HTML_MODE_LEGACY)
        val spannedBuilder = SpannableStringBuilder()
        if (this.message != null) {
            this.message = spannedBuilder.append(this.message).append("\n").append(spanned)
        } else {
            this.message = spanned
        }

        return this
    }

    fun setTitleStringFormat(title: Int, vararg values: Any): SmartZoneDialogBuilder {
        this.title = context.localize(title, *values).toSpanned()
        return this
    }

    fun setMessageStringFormat(message: Int, vararg value: Any): SmartZoneDialogBuilder {
        this.message = context.localize(message, *value).toSpanned()
        return this
    }

    override fun setTitle(titleId: Int): SmartZoneDialogBuilder {
        title = context.localize(titleId).toSpanned()
        return this
    }

    private fun LayoutSmartzoneDialogBinding.initializeTitleText(title: Spanned) {
        titleTv.visibility = View.VISIBLE
        titleTv.text = title
    }

    override fun setMessage(messageId: Int): SmartZoneDialogBuilder {
        message = context.localize(messageId).toSpanned()
        return this
    }

    private fun LayoutSmartzoneDialogBinding.initializeMessageText(message: Spanned) {
        messageTv.visibility = View.VISIBLE
        messageTv.text = message
    }

    override fun setMessage(message: CharSequence?): SmartZoneDialogBuilder {
        messageInfo = message
        return this
    }

    private fun LayoutSmartzoneDialogBinding.initializeMessageInfoText(message: CharSequence) {
        messageInfoTv.visibility = View.VISIBLE
        messageInfoTv.text = message
    }

    override fun setIcon(iconId: Int): SmartZoneDialogBuilder {
        icon = iconId
        return this
    }

    private fun LayoutSmartzoneDialogBinding.initializeIcon(icon: Int) {
        icon.let {
            iconIv.visibility = View.VISIBLE
            iconIv.setImageResource(it)
        }
    }

    override fun setPositiveButton(
        text: CharSequence?, listener: DialogInterface.OnClickListener?
    ): MaterialAlertDialogBuilder {
        throw UnsupportedOperationException()
    }

    override fun setNegativeButton(
        text: CharSequence?, listener: DialogInterface.OnClickListener?
    ): MaterialAlertDialogBuilder {
        throw UnsupportedOperationException()
    }

    override fun setNeutralButton(
        text: CharSequence?, listener: DialogInterface.OnClickListener?
    ): MaterialAlertDialogBuilder {
        throw UnsupportedOperationException()
    }

    fun autoDismissAfter(durationMs: Long): SmartZoneDialogBuilder {
        autoDismissDurationMs = durationMs
        return this
    }

    override fun setOnDismissListener(listener: DialogInterface.OnDismissListener?): SmartZoneDialogBuilder {
        externalDismissListener = listener
        return this
    }

    private fun LayoutSmartzoneDialogBinding.setGifIcon(@DrawableRes gifRes: Int) {
        gifIv.visibility = View.VISIBLE
        Glide.with(gifIv)
            .asGif()
            .load(gifRes)
            .into(gifIv)
    }

    fun setGifIcon(@DrawableRes gifRes: Int): SmartZoneDialogBuilder {
        this.icon = gifRes
        this.isGifIcon = true
        return this
    }

    fun setTopButton(
        topButtonText: Int,
        topButtonStyle: SmartZoneButtonStyle? = null,
        dialogDismiss: Boolean = true,
        topButtonVisibility: Boolean = true,
        topButton: () -> Unit
    ): SmartZoneDialogBuilder {
        this.topButtonStyle = topButtonStyle
        this.topButtonText = context.localize(topButtonText)
        this.topButtonActionDismiss = dialogDismiss
        this.topButtonAction = topButton
        this.topButtonVisibility = topButtonVisibility
        return this
    }


    fun setBottomButton(
        bottomButtonText: Int,
        bottomButtonStyle: SmartZoneButtonStyle? = null,
        dialogDismiss: Boolean = true,
        bottomButtonVisibility: Boolean = true,
        bottomButtonAction: () -> Unit = {}
    ): SmartZoneDialogBuilder {
        this.bottomButtonStyle = bottomButtonStyle
        this.bottomButtonText = context.localize(bottomButtonText)
        this.bottomButtonActionDismiss = dialogDismiss
        this.bottomButtonAction = bottomButtonAction
        this.bottomButtonVisibility = bottomButtonVisibility
        return this
    }

    private fun LayoutSmartzoneDialogBinding.handleTopButton(dialog: Dialog) {
        topButton.isVisible = topButtonText != null
        topButton.isVisible = topButtonVisibility == true
        topButtonStyle?.applyOnButton(topButton)
        topButton.text = topButtonText.toString()
        setOnTopButtonClicked(dialog)
    }

    private fun LayoutSmartzoneDialogBinding.setOnTopButtonClicked(dialog: Dialog) {
        topButton.setOnClickListener {
            topButtonAction?.invoke()
            if (topButtonActionDismiss == true) {
                dialog.dismiss()
            }
        }
    }

    private fun LayoutSmartzoneDialogBinding.handleBottomButton(dialog: Dialog) {
        bottomButton.isVisible = bottomButtonText != null
        bottomButton.isVisible = bottomButtonVisibility == true
        bottomButtonStyle?.applyOnButton(bottomButton)
        bottomButton.text = bottomButtonText.toString()
        setOnBottomButtonClicked(dialog)
    }

    private fun LayoutSmartzoneDialogBinding.setOnBottomButtonClicked(dialog: Dialog) {
        bottomButton.setOnClickListener {
            bottomButtonAction?.invoke()
            if (bottomButtonActionDismiss == true) {
                dialog.dismiss()
            }
        }
    }
}