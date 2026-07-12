package com.core.shared.fawry_sdk_manager

import android.app.Activity
import com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.FawryLaunchUiModel
import com.core.shared.localization_operation.local_helper.LocaleHelperHandler
import com.fawry.fawrypay.FawrySdk
import com.fawry.fawrypay.interfaces.FawryPreLaunch
import com.fawry.fawrypay.interfaces.FawrySdkCallbacks
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class FawrySdkManager(private val activity: Activity) : FawrySdkHandler, KoinComponent {

    private val localeHelperHandler: LocaleHelperHandler by inject()

    private val fawrySdk by lazy { FawrySdk }

    private var _onSuccess: ((String, Any?) -> Unit)? = null

    private var _onFailure: ((String) -> Unit)? = null


    override fun initFawrySdk(baseUrl: String, fawryLaunchUiModel: FawryLaunchUiModel) {
        fawrySdk.launchAnonymousSDK(
            activity = activity,
            _languages = getFawrySdkLang(),
            _baseUrl = baseUrl,
            _fawryLaunchModel = fawryLaunchUiModel.toFawryLaunchModel(),
            _callback = fawrySdkCallback()
        )
    }


    private fun getFawrySdkLang() = if (localeHelperHandler.isEnglishSelected()) {
        FawrySdk.Languages.ENGLISH
    } else {
        FawrySdk.Languages.ARABIC
    }

    private fun fawrySdkCallback() = object : FawrySdkCallbacks {

        override fun onPreLaunch(onPreLaunch: FawryPreLaunch) {
            onPreLaunch.onContinue()
        }

        override fun onInit() {}

        override fun onSuccess(msg: String, data: Any?) {
            _onSuccess?.invoke(msg, data)
        }

        override fun onPaymentCompleted(msg: String, data: Any?) {}

        override fun onFailure(error: String) {
            _onFailure?.invoke(error)
        }
    }


    override fun onSuccess(onSuccess: (String, Any?) -> Unit) {
        this._onSuccess = onSuccess
    }

    override fun onFailure(onFailure: (String) -> Unit) {
        this._onFailure = onFailure
    }

}