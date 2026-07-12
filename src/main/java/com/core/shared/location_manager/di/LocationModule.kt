package com.core.shared.location_manager.di

import com.core.shared.location_manager.LocationHandler
import com.core.shared.location_manager.LocationManager
import org.koin.dsl.module


internal val locationModule = module {
    single<LocationHandler> { LocationManager(get()) }
}