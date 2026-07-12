package com.core.shared.location_manager

import android.location.Location

interface LocationHandler {
    fun getLastLocation(location: (Location) -> Unit)
}