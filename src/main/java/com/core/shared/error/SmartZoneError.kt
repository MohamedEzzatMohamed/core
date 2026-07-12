package com.core.shared.error

import timber.log.Timber

sealed class SmartZoneError {
    var exception: Throwable? = GeneralException()
    var extraData: Any? = null
    var errors: List<Error>? = null
    var logMessage: String? = null
    var logTag: String = "SmartZone Error =>"
    var logPriority: ErrorLogPriority = ErrorLogPriority.ERROR

    fun logError() {
        val message = "$logTag \n" +
                "Log errors: $errors\n" +
                "Log Message: $logMessage\n" +
                "Extra Data: $extraData\n"
        Timber.log(logPriority.level, exception, message)
    }


    class E(
        exception: Exception,
        errors: List<Error>? = null,
        logMessage: String? = null,
        logTag: String? = null,
        extraData: Any? = null
    ) : SmartZoneError() {
        init {
            this.logPriority = ErrorLogPriority.ERROR
            this.errors = errors
            this.logMessage = logMessage
            logTag?.let { this.logTag = it }
            this.exception = exception
            this.extraData = extraData
        }

    }

    class W(
        exception: Exception,
        errors: List<Error>? = null,
        logMessage: String? = null,
        logTag: String? = null,
        extraData: Any? = null
    ) : SmartZoneError() {
        init {
            this.logPriority = ErrorLogPriority.WARN
            this.errors = errors
            this.logMessage = logMessage
            logTag?.let { this.logTag = it }
            this.exception = exception
            this.extraData = extraData
        }

    }

    class I(
        exception: Exception,
        errors: List<Error>? = null,
        logMessage: String? = null,
        logTag: String? = null,
        extraData: Any? = null
    ) : SmartZoneError() {
        init {
            this.logPriority = ErrorLogPriority.INFO
            this.errors = errors
            this.logMessage = logMessage
            logTag?.let { this.logTag = it }
            this.exception = exception
            this.extraData = extraData
        }

    }
}