package com.core.shared.connectivity.internet_access_observer;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0002\u00a2\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/core/shared/connectivity/internet_access_observer/InternetAccessObserver;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "_isInternetAvailable", "Landroidx/lifecycle/MutableLiveData;", "", "internetAccessErrorHandler", "Lcom/core/shared/connectivity/internet_access_observer/InternetAccessErrorHandler;", "isInternetAvailable", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "getInternetAccessResponse", "", "getInternetExceptionError", "errorType", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)Lkotlin/Unit;", "isInternetAccess", "Companion", "core_liveRelease"})
public final class InternetAccessObserver {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.Nullable()
    private final com.core.shared.connectivity.internet_access_observer.InternetAccessErrorHandler internetAccessErrorHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isInternetAvailable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isInternetAvailable = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOCKET_TIME_OUT_EXCEPTION = "SOCKET_TIME_OUT_EXCEPTION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SSL_HANDSHAKE_EXCEPTION = "SSL_HANDSHAKE_EXCEPTION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNKNOWN_HOST_EXCEPTION = "UNKNOWN_HOST_EXCEPTION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GENERAL_EXCEPTION = "GENERAL_EXCEPTION";
    @org.jetbrains.annotations.NotNull()
    public static final com.core.shared.connectivity.internet_access_observer.InternetAccessObserver.Companion Companion = null;
    
    public InternetAccessObserver(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isInternetAvailable() {
        return null;
    }
    
    public final void getInternetAccessResponse() {
    }
    
    private final boolean isInternetAccess() {
        return false;
    }
    
    private final kotlin.Unit getInternetExceptionError(java.lang.String errorType, java.lang.Exception exception) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/core/shared/connectivity/internet_access_observer/InternetAccessObserver$Companion;", "", "()V", "GENERAL_EXCEPTION", "", "SOCKET_TIME_OUT_EXCEPTION", "SSL_HANDSHAKE_EXCEPTION", "UNKNOWN_HOST_EXCEPTION", "core_liveRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}