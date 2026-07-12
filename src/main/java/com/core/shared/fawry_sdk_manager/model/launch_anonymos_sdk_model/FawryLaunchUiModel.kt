package com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model

import com.fawry.fawrypay.models.FawryLaunchModel
import com.fawry.fawrypay.models.ShippingAddress
import java.util.Date

data class FawryLaunchUiModel(
    val launchCustomerUiModel: LaunchCustomerUiModel,
    val launchMerchantUiModel: LaunchMerchantUiModel,
    val allow3DPayment: Boolean,
    val chargeItems: BillItemsUiModel,
    val shippingAddress: ShippingAddress? = null,
    val branchCode: String? = null,
    val scheduledTime: Date,
    val skipReceipt: Boolean,
    val skipLogin: Boolean,
    val signatureSha256: String,
    val payWithCardToken: Boolean
) {
    fun toFawryLaunchModel() = FawryLaunchModel(
        launchCustomerModel = launchCustomerUiModel.toLaunchCustomerModel(),
        launchMerchantModel = launchMerchantUiModel.toLaunchMerchantModel(),
        allow3DPayment = allow3DPayment,
        chargeItems = chargeItems.toChargeListItems(),
        shippingAddress = shippingAddress,
        branchCode = branchCode,
        scheduledTime = scheduledTime,
        skipReceipt = skipReceipt,
        skipLogin = skipLogin,
//        signature = signatureSha256,
        payWithCardToken = payWithCardToken

    )
}
