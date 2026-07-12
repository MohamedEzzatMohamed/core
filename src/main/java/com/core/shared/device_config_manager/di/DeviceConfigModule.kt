package com.core.shared.device_config_manager.di

import com.core.shared.device_config_manager.DeviceConfigStateHelper
import com.core.shared.device_config_manager.DeviceConfigStateManager
import org.koin.dsl.module

val deviceConfigModule = module {
    single<DeviceConfigStateHelper> { DeviceConfigStateManager(get()) }
}