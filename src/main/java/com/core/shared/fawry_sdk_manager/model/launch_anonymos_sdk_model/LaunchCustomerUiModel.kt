package com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model

import com.fawry.fawrypay.models.LaunchCustomerModel

data class LaunchCustomerUiModel(
    val customerEmail: String,
    val customerMobile: String,
    val customerProfileId: String,
) {
    fun toLaunchCustomerModel() = LaunchCustomerModel(
        customerEmail = customerEmail,
        customerMobile = customerMobile,
        customerProfileId = customerProfileId
    )
}
