package com.core.shared.fawry_sdk_manager

import com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.FawryLaunchUiModel

interface FawrySdkHandler {

    fun initFawrySdk(baseUrl: String, fawryLaunchUiModel: FawryLaunchUiModel)
    fun onSuccess(onSuccess: (String, Any?) -> Unit)
    fun onFailure(onFailure: (String) -> Unit)

}