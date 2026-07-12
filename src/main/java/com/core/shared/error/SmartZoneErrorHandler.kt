package com.core.shared.error

interface SmartZoneErrorHandler {
    fun handleError(error: SmartZoneError, callback: SmartZoneError.() -> Unit = {})
}