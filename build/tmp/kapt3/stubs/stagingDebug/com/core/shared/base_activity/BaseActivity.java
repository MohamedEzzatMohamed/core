package com.core.shared.base_activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ)\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001e0\"\u00a2\u0006\u0002\b#H\u0016J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'H\u0002J\u0012\u0010(\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u000201H\u0016R\u0012\u0010\n\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0018\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00062"}, d2 = {"Lcom/core/shared/base_activity/BaseActivity;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "_navHostResourceId", "", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/core/shared/connectivity/connectivity_manager/NetworkAwareComponent;", "Lcom/core/shared/error/SmartZoneErrorHandler;", "Lorg/koin/core/component/KoinComponent;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "connectivityManager", "Lcom/core/shared/connectivity/connectivity_manager/ConnectivityManager;", "getConnectivityManager", "()Lcom/core/shared/connectivity/connectivity_manager/ConnectivityManager;", "connectivityManager$delegate", "Lkotlin/Lazy;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "navHostFragment$delegate", "navHostResourceId", "getNavHostResourceId", "()Ljava/lang/Integer;", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "handleError", "", "error", "Lcom/core/shared/error/SmartZoneError;", "callback", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "handleScreenShootAndRecordSecure", "hideSystemBars", "root", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNetworkAvailable", "network", "Landroid/net/Network;", "onNetworkLost", "onWindowFocusChanged", "hasFocus", "", "core_stagingDebug"})
public abstract class BaseActivity<dataBinding extends androidx.databinding.ViewDataBinding, _navHostResourceId extends java.lang.Integer> extends androidx.appcompat.app.AppCompatActivity implements com.core.shared.connectivity.connectivity_manager.NetworkAwareComponent, com.core.shared.error.SmartZoneErrorHandler, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy navHostFragment$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy connectivityManager$delegate = null;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract dataBinding getBinding();
    
    public abstract _navHostResourceId getNavHostResourceId();
    
    private final androidx.navigation.fragment.NavHostFragment getNavHostFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.connectivity.connectivity_manager.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    private final void hideSystemBars(android.view.View root) {
    }
    
    private final void handleScreenShootAndRecordSecure() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment getCurrentFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    @java.lang.Override()
    public void onNetworkLost(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    @java.lang.Override()
    public void handleError(@org.jetbrains.annotations.NotNull()
    com.core.shared.error.SmartZoneError error, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.core.shared.error.SmartZoneError, kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}