package com.core.shared.token_utils

import com.google.android.gms.common.util.Base64Utils
import com.google.gson.Gson
import com.core.shared.error.FailedToDecodeJwtException
import com.core.shared.error.SmartZoneError
import java.nio.charset.StandardCharsets


fun String.getPayLoad(onError: (SmartZoneError) -> Unit = {}): JwtPayload? {
    val jsonPayload = getJsonPayload(onError)
    return Gson().fromJson(jsonPayload, JwtPayload::class.java)
}

private fun String.getJsonPayload(onError: (SmartZoneError) -> Unit = {}): String? {
    val parts = split(".").toTypedArray()
    return try {
        Base64Utils.decodeUrlSafe(parts[1]).toString(StandardCharsets.UTF_8)
    } catch (e: Exception) {
        onError(getJwtError(e))
        null
    }
}

private fun String.getJwtError(e: Exception): SmartZoneError {
    return SmartZoneError.E(
        exception = FailedToDecodeJwtException(cause = e),
        logMessage = "failed to decode JWT for token: $this",
        logTag = TokensManager::class.java.simpleName
    )
}