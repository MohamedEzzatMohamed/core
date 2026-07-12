package com.core.shared.error

data class SmartZoneException(val SmartZoneError: SmartZoneError) : Exception()