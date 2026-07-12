package com.core.shared.gps_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/core/shared/gps_manager/GpsStateHandler;", "", "getGpsState", "", "isEnabled", "Lkotlin/Function1;", "", "core_stagingDebug"})
public abstract interface GpsStateHandler {
    
    public abstract void getGpsState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> isEnabled);
}