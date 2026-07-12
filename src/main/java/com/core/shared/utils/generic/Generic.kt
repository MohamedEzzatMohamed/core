package com.core.shared.utils.generic

import com.core.shared.error.SmartZoneError
import com.core.shared.state.State
import com.google.gson.GsonBuilder


fun <T> fetchResponseFromJson(json: String, response: Class<T>): T? =
    GsonBuilder().create().fromJson(json, response)


fun <E> generalError(
    exception: Exception, logMessage: String?
) = State.Error<E>(SmartZoneError.E(exception = exception, logMessage = logMessage))
