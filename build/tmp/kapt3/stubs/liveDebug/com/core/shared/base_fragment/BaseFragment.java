package com.core.shared.base_fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020:H\u0004J\u0010\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020&H\u0014J\u0010\u0010>\u001a\u00020:2\u0006\u0010=\u001a\u00020&H\u0014J\u0010\u0010?\u001a\u00020:2\u0006\u0010=\u001a\u00020&H\u0014J\u0010\u0010@\u001a\u00020:2\u0006\u0010=\u001a\u00020&H\u0014J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020BH\u0014J\u0010\u0010D\u001a\u00020:2\u0006\u0010=\u001a\u00020&H\u0014J\u0010\u0010E\u001a\u00020:2\u0006\u0010=\u001a\u00020&H\u0014J\u0017\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020IH\u0004\u00a2\u0006\u0002\u0010JJ\u0006\u0010K\u001a\u00020:J\u001f\u0010L\u001a\u00028\u00002\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH&\u00a2\u0006\u0002\u0010QJ&\u0010R\u001a\u0004\u0018\u00010I2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010U\u001a\u00020:H\u0016J\u0010\u0010V\u001a\u00020:2\u0006\u0010W\u001a\u00020XH\u0016J\u0010\u0010Y\u001a\u00020:2\u0006\u0010W\u001a\u00020XH\u0016J\u0012\u0010Z\u001a\u00020:2\b\u0010[\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\\\u001a\u00020:H\u0014J\b\u0010]\u001a\u00020:H\u0016J\u0016\u0010^\u001a\u00020:2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020:0`H\u0004J\u0017\u0010a\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020IH\u0004\u00a2\u0006\u0002\u0010JJ\u000e\u0010b\u001a\u00020:2\u0006\u0010=\u001a\u00020&J\u0006\u0010c\u001a\u00020:J\u000e\u0010d\u001a\u00020:2\u0006\u0010=\u001a\u00020&J#\u0010e\u001a\u00020:*\u00020B2\u0017\u0010f\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020:0g\u00a2\u0006\u0002\bhJ\n\u0010i\u001a\u00020&*\u00020jJ#\u0010i\u001a\u00020&*\u00020j2\u0012\u0010k\u001a\n\u0012\u0006\b\u0001\u0012\u00020l0%\"\u00020l\u00a2\u0006\u0002\u0010mJ\n\u0010b\u001a\u00020:*\u00020jJ\n\u0010d\u001a\u00020:*\u00020jR\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0011\u0010\t\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b!\u0010\"R\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\'R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\u0015\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002058DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\u0015\u001a\u0004\b6\u00107\u00a8\u0006n"}, d2 = {"Lcom/core/shared/base_fragment/BaseFragment;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "Lcom/core/shared/connectivity/connectivity_manager/NetworkAwareComponent;", "()V", "_binding", "Landroidx/databinding/ViewDataBinding;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "connectivityManager", "Lcom/core/shared/connectivity/connectivity_manager/ConnectivityManager;", "getConnectivityManager", "()Lcom/core/shared/connectivity/connectivity_manager/ConnectivityManager;", "countrySettingHandler", "Lcom/core/shared/country_setting_manager/CountrySettingHandler;", "getCountrySettingHandler", "()Lcom/core/shared/country_setting_manager/CountrySettingHandler;", "countrySettingHandler$delegate", "Lkotlin/Lazy;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "()Landroid/view/inputmethod/InputMethodManager;", "languageSelectedSettingHandler", "Lcom/core/shared/localization_operation/language_setting/LanguageSelectedSettingHandler;", "getLanguageSelectedSettingHandler", "()Lcom/core/shared/localization_operation/language_setting/LanguageSelectedSettingHandler;", "languageSelectedSettingHandler$delegate", "localeHelperHandler", "Lcom/core/shared/localization_operation/local_helper/LocaleHelperHandler;", "getLocaleHelperHandler", "()Lcom/core/shared/localization_operation/local_helper/LocaleHelperHandler;", "localeHelperHandler$delegate", "permissions", "", "", "[Ljava/lang/String;", "requestMultiplePermissionsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "sharedPreference", "Lcom/core/shared/storage_manager/StorageManager;", "getSharedPreference", "()Lcom/core/shared/storage_manager/StorageManager;", "sharedPreference$delegate", "smartZoneProgressDialog", "Lcom/core/shared/utils/dialogs/smartzone_progress_dialog/SmartZoneProgressDialog;", "getSmartZoneProgressDialog", "()Lcom/core/shared/utils/dialogs/smartzone_progress_dialog/SmartZoneProgressDialog;", "smartZoneProgressDialog$delegate", "userManagerHandler", "Lcom/core/shared/user_manager/UserManagerHandler;", "getUserManagerHandler", "()Lcom/core/shared/user_manager/UserManagerHandler;", "userManagerHandler$delegate", "checkOnSelfPermission", "", "handleApplicationRestart", "handleGeneralExceptionError", "message", "handleGeneralResponseError", "handleIoExceptionError", "handleNotFoundError", "handleOtherErrors", "Lcom/core/shared/error/SmartZoneError;", "error", "handleUnauthorizedAppError", "handleUnauthorizedError", "hideKeyboard", "", "view", "Landroid/view/View;", "(Landroid/view/View;)Ljava/lang/Boolean;", "hideProgressDialog", "onCreateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onNetworkAvailable", "network", "Landroid/net/Network;", "onNetworkLost", "onPermissionDenied", "permission", "onPermissionsGranted", "onStart", "showDelayProgressDialog", "callbackAction", "Lkotlin/Function0;", "showKeyboard", "showLongToast", "showProgressDialog", "showShortToast", "handleError", "callback", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "localize", "", "args", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "core_liveDebug"})
public abstract class BaseFragment<dataBinding extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment implements org.koin.core.component.KoinComponent, com.core.shared.connectivity.connectivity_manager.NetworkAwareComponent {
    @org.jetbrains.annotations.Nullable()
    private dataBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy localeHelperHandler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy languageSelectedSettingHandler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedPreference$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy userManagerHandler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy countrySettingHandler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy smartZoneProgressDialog$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] permissions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestMultiplePermissionsLauncher = null;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dataBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.core.shared.connectivity.connectivity_manager.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.core.shared.localization_operation.local_helper.LocaleHelperHandler getLocaleHelperHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.core.shared.localization_operation.language_setting.LanguageSelectedSettingHandler getLanguageSelectedSettingHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.core.shared.storage_manager.StorageManager getSharedPreference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.core.shared.user_manager.UserManagerHandler getUserManagerHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.core.shared.country_setting_manager.CountrySettingHandler getCountrySettingHandler() {
        return null;
    }
    
    private final com.core.shared.utils.dialogs.smartzone_progress_dialog.SmartZoneProgressDialog getSmartZoneProgressDialog() {
        return null;
    }
    
    private final android.view.inputmethod.InputMethodManager getInputMethodManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract dataBinding onCreateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container);
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String localize(int $this$localize) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String localize(int $this$localize, @org.jetbrains.annotations.NotNull()
    java.lang.Object... args) {
        return null;
    }
    
    public final void showShortToast(int $this$showShortToast) {
    }
    
    public final void showShortToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showLongToast(int $this$showLongToast) {
    }
    
    public final void showLongToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showProgressDialog() {
    }
    
    public final void hideProgressDialog() {
    }
    
    @java.lang.Override()
    public void onNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    @java.lang.Override()
    public void onNetworkLost(@org.jetbrains.annotations.NotNull()
    android.net.Network network) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Boolean showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Boolean hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    protected final void showDelayProgressDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callbackAction) {
    }
    
    protected final void handleApplicationRestart() {
    }
    
    public final void handleError(@org.jetbrains.annotations.NotNull()
    com.core.shared.error.SmartZoneError $this$handleError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.core.shared.error.SmartZoneError, kotlin.Unit> callback) {
    }
    
    private final void checkOnSelfPermission() {
    }
    
    protected void onPermissionsGranted() {
    }
    
    protected void onPermissionDenied(@org.jetbrains.annotations.Nullable()
    java.lang.String permission) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected com.core.shared.error.SmartZoneError handleOtherErrors(@org.jetbrains.annotations.NotNull()
    com.core.shared.error.SmartZoneError error) {
        return null;
    }
    
    protected void handleGeneralExceptionError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected void handleIoExceptionError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected void handleGeneralResponseError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected void handleUnauthorizedError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected void handleUnauthorizedAppError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected void handleNotFoundError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}