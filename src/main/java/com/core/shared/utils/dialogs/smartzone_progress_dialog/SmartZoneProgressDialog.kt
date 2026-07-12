package com.core.shared.utils.dialogs.smartzone_progress_dialog

import android.app.Activity
import android.app.AlertDialog
import com.core.shared.databinding.LayoutSmartzoneProgressDialogBinding
import com.core.shared.utils.CommonUtils.setLayoutParams


class SmartZoneProgressDialog(private val activity: Activity) {

    private val binding by lazy { LayoutSmartzoneProgressDialogBinding.inflate(activity.layoutInflater) }
    private var dialog: AlertDialog? = null

    init {
        buildAlertDialogView()
    }

    private fun buildAlertDialogView(): AlertDialog? {
        val builder = AlertDialog.Builder(activity)
        builder.setView(binding.root)
        dialog = builder.create()
        dialog?.let { setLayoutParams(it) }
        dialog?.setCancelable(false)
        return dialog
    }

    fun show() {
        dialog?.show()
    }

    fun dismiss() {
        dialog?.dismiss()
    }

}