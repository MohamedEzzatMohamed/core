package com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model

import com.fawry.fawrypay.models.LaunchMerchantModel

data class LaunchMerchantUiModel(
    val merchantCode: String,
    val secretCode: String,
    val merchantReferenceNumber: String
) {
    fun toLaunchMerchantModel() = LaunchMerchantModel(
        merchantCode = merchantCode,
        secretCode = secretCode,
        merchantRefNum = merchantReferenceNumber
    )
}