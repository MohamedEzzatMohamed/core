package com.core.shared.device_config_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0003J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/core/shared/device_config_manager/DeviceConfigStateManager;", "Lcom/core/shared/device_config_manager/DeviceConfigStateHelper;", "Lorg/koin/core/component/KoinComponent;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getDeviceConfigState", "", "onDeviceConfigState", "Lkotlin/Function1;", "Lcom/core/shared/device_config_manager/DeviceConfigState;", "isDeveloperOptionEnabled", "", "isProxyEnabled", "isRooted", "isRootedDevBeer", "isTaiChi", "core_liveDebug"})
public final class DeviceConfigStateManager implements com.core.shared.device_config_manager.DeviceConfigStateHelper, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public DeviceConfigStateManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public void getDeviceConfigState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.core.shared.device_config_manager.DeviceConfigState, kotlin.Unit> onDeviceConfigState) {
    }
    
    private final boolean isRooted() {
        return false;
    }
    
    private final boolean isRootedDevBeer() {
        return false;
    }
    
    private final boolean isProxyEnabled() {
        return false;
    }
    
    private final boolean isTaiChi() {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN)
    private final boolean isDeveloperOptionEnabled() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}