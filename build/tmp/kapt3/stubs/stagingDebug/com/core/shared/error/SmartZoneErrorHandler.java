package com.core.shared.error;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\b\bH&\u00a8\u0006\t"}, d2 = {"Lcom/core/shared/error/SmartZoneErrorHandler;", "", "handleError", "", "error", "Lcom/core/shared/error/SmartZoneError;", "callback", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "core_stagingDebug"})
public abstract interface SmartZoneErrorHandler {
    
    public abstract void handleError(@org.jetbrains.annotations.NotNull()
    com.core.shared.error.SmartZoneError error, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.core.shared.error.SmartZoneError, kotlin.Unit> callback);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}