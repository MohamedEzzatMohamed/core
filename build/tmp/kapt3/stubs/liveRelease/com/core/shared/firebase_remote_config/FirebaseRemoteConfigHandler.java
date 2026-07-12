package com.core.shared.firebase_remote_config;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lcom/core/shared/firebase_remote_config/FirebaseRemoteConfigHandler;", "", "getBooleanValue", "", "key", "", "getDoubleValue", "", "getFirebaseRemoteConfigSuccessState", "", "success", "Lkotlin/Function0;", "getLongValue", "", "getStringValue", "setDefaultRemoteConfig", "defaultRemoteConfig", "", "core_liveRelease"})
public abstract interface FirebaseRemoteConfigHandler {
    
    public abstract void setDefaultRemoteConfig(@androidx.annotation.XmlRes()
    int defaultRemoteConfig);
    
    public abstract void getFirebaseRemoteConfigSuccessState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getStringValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract long getLongValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract double getDoubleValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract boolean getBooleanValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
}