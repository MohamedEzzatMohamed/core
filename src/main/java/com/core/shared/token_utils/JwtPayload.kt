package com.core.shared.token_utils


import com.google.gson.annotations.SerializedName

data class JwtPayload(
    @SerializedName("AcademyId")
    val academyId: String,
    @SerializedName("exp")
    val exp: Long,
    @SerializedName("iat")
    val iat: Long,
    @SerializedName("nbf")
    val nbf: Long,
    @SerializedName("role")
    val role: List<String>,
    @SerializedName("unique_name")
    val uniqueName: String
)