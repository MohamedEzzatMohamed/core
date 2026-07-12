package com.core.shared.device_config_manager

interface DeviceConfigStateHelper {
    fun getDeviceConfigState(onDeviceConfigState: (DeviceConfigState)-> Unit)
}