package com.core.shared.fawry_sdk_manager.model.fawry_response

data class FawrySuccessPaymentResponse(
    val customerMail: String,
    val customerMobile: String,
    val customerProfileId: String,
    val expirationTime: String,
    val fawryFees: Double,
    val merchantRefNumber: String,
    val orderAmount: String,
    val orderStatus: String,
    val paymentAmount: String,
    val paymentMethod: String,
    val referenceNumber: String,
    val shippingFees: Double,
    val signature: String,
    val statusCode: Int,
    val statusDescription: String,
    val taxes: Double,
    val type: String
)
