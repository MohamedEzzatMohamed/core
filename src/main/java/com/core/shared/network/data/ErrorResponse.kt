package com.core.shared.network.data

import com.google.gson.annotations.SerializedName

data class ErrorResponse(
    @SerializedName("message")
    val errorMessage: String? = null
)