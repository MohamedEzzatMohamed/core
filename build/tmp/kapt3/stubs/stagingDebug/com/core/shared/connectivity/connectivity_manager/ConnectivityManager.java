package com.core.shared.connectivity.connectivity_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/core/shared/connectivity/connectivity_manager/ConnectivityManager;", "", "activity", "Landroid/app/Activity;", "internetAccessObserver", "Lcom/core/shared/connectivity/internet_access_observer/InternetAccessObserver;", "(Landroid/app/Activity;Lcom/core/shared/connectivity/internet_access_observer/InternetAccessObserver;)V", "_isNetworkConnected", "Landroidx/lifecycle/MutableLiveData;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getAppCompatActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "getNetworkRequest", "Landroid/net/NetworkRequest;", "isNetworkConnected", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "networkManagerHolder", "Lcom/core/shared/connectivity/connectivity_manager/NetworkAwareComponent;", "checkConnectInternetType", "", "getActiveNetwork", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getInternetAccessResponse", "getNetworkCallBack", "handleNetworkCallbackRegistration", "handleUnregisteredNetworkState", "observeOnIsInternetAvailable", "core_stagingDebug"})
public final class ConnectivityManager {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.core.shared.connectivity.internet_access_observer.InternetAccessObserver internetAccessObserver = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isNetworkConnected;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isNetworkConnected = null;
    @org.jetbrains.annotations.Nullable()
    private android.net.NetworkCapabilities networkCapabilities;
    @org.jetbrains.annotations.NotNull()
    private android.net.NetworkRequest getNetworkRequest;
    @org.jetbrains.annotations.NotNull()
    private android.net.ConnectivityManager.NetworkCallback networkCallback;
    @org.jetbrains.annotations.Nullable()
    private final com.core.shared.connectivity.connectivity_manager.NetworkAwareComponent networkManagerHolder = null;
    
    public ConnectivityManager(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.core.shared.connectivity.internet_access_observer.InternetAccessObserver internetAccessObserver) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isNetworkConnected() {
        return null;
    }
    
    private final androidx.appcompat.app.AppCompatActivity getAppCompatActivity() {
        return null;
    }
    
    private final void handleNetworkCallbackRegistration() {
    }
    
    private final void observeOnIsInternetAvailable() {
    }
    
    private final android.net.NetworkRequest getNetworkRequest() {
        return null;
    }
    
    private final android.net.ConnectivityManager.NetworkCallback getNetworkCallBack() {
        return null;
    }
    
    private final void handleUnregisteredNetworkState() {
    }
    
    private final android.net.NetworkCapabilities getActiveNetwork() {
        return null;
    }
    
    private final android.net.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    private final void checkConnectInternetType() {
    }
    
    private final void getInternetAccessResponse() {
    }
}