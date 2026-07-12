package com.core.shared.connectivity.internet_access_observer;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/core/shared/connectivity/internet_access_observer/InternetAccessErrorHandler;", "", "readInternetAccessExceptionError", "", "errorType", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core_liveRelease"})
public abstract interface InternetAccessErrorHandler {
    
    public abstract void readInternetAccessExceptionError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorType, @org.jetbrains.annotations.NotNull()
    java.lang.Exception exception);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void readInternetAccessExceptionError(@org.jetbrains.annotations.NotNull()
        com.core.shared.connectivity.internet_access_observer.InternetAccessErrorHandler $this, @org.jetbrains.annotations.NotNull()
        java.lang.String errorType, @org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
        }
    }
}