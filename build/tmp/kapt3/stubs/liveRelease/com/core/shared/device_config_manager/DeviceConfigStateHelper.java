package com.core.shared.device_config_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/core/shared/device_config_manager/DeviceConfigStateHelper;", "", "getDeviceConfigState", "", "onDeviceConfigState", "Lkotlin/Function1;", "Lcom/core/shared/device_config_manager/DeviceConfigState;", "core_liveRelease"})
public abstract interface DeviceConfigStateHelper {
    
    public abstract void getDeviceConfigState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.core.shared.device_config_manager.DeviceConfigState, kotlin.Unit> onDeviceConfigState);
}