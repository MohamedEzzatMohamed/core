package com.core.shared.utils.dialogs.smartzone_progress_dialog.di

import android.app.Activity
import com.core.shared.utils.dialogs.smartzone_progress_dialog.SmartZoneProgressDialog
import org.koin.dsl.module


internal val progressDialogModule = module {
    factory { (activity: Activity) ->
        SmartZoneProgressDialog(activity)
    }
}