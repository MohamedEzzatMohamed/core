package com.core.shared.gps_manager.di

import com.core.shared.gps_manager.GpsStateHandler
import com.core.shared.gps_manager.GpsStateManager
import org.koin.dsl.module


internal val gpsModule = module {
    single<GpsStateHandler> { GpsStateManager(get()) }
}