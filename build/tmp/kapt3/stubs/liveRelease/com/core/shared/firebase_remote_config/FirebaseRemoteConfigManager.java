package com.core.shared.firebase_remote_config;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/core/shared/firebase_remote_config/FirebaseRemoteConfigManager;", "Lcom/core/shared/firebase_remote_config/FirebaseRemoteConfigHandler;", "()V", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getBooleanValue", "", "key", "", "getDoubleValue", "", "getFirebaseRemoteConfigSuccessState", "", "success", "Lkotlin/Function0;", "getLongValue", "", "getStringValue", "setDefaultRemoteConfig", "defaultRemoteConfig", "", "core_liveRelease"})
public final class FirebaseRemoteConfigManager implements com.core.shared.firebase_remote_config.FirebaseRemoteConfigHandler {
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig;
    
    public FirebaseRemoteConfigManager() {
        super();
    }
    
    @java.lang.Override()
    public void setDefaultRemoteConfig(@androidx.annotation.XmlRes()
    int defaultRemoteConfig) {
    }
    
    @java.lang.Override()
    public void getFirebaseRemoteConfigSuccessState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getStringValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override()
    public long getLongValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0L;
    }
    
    @java.lang.Override()
    public double getDoubleValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0.0;
    }
    
    @java.lang.Override()
    public boolean getBooleanValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
}