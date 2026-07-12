package com.core.shared.state

import com.core.shared.error.SmartZoneError

typealias ResponseErrors = Error
sealed class State<T> {
    var hasBeenHandled = false

    class Initial<T> : State<T>()

    class Loading<T> : State<T>()
    data class Success<T>(val data: T? = null, val error: SmartZoneError? = null) : State<T>()
    data class Error<T>(val error: SmartZoneError) : State<T>()

    companion object {
        fun <T> infoError(exception: Exception) = Error<T>(SmartZoneError.I(exception = exception))
        fun <T> warnError(exception: Exception, errors: List<ResponseErrors>? = null) =
            Error<T>(SmartZoneError.W(exception = exception, errors = errors))

        fun <T> criticalError(exception: Exception) = Error<T>(SmartZoneError.E(exception = exception))
    }
}