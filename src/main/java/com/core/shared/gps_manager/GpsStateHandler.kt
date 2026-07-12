package com.core.shared.gps_manager

interface GpsStateHandler {
    fun getGpsState(isEnabled: (Boolean) -> Unit)
}