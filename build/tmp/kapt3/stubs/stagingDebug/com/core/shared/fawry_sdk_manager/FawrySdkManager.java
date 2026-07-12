package com.core.shared.fawry_sdk_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010 \u001a\u00020\t2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J$\u0010!\u001a\u00020\t2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u000bH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/core/shared/fawry_sdk_manager/FawrySdkManager;", "Lcom/core/shared/fawry_sdk_manager/FawrySdkHandler;", "Lorg/koin/core/component/KoinComponent;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "_onFailure", "Lkotlin/Function1;", "", "", "_onSuccess", "Lkotlin/Function2;", "", "fawrySdk", "Lcom/fawry/fawrypay/FawrySdk;", "getFawrySdk", "()Lcom/fawry/fawrypay/FawrySdk;", "fawrySdk$delegate", "Lkotlin/Lazy;", "localeHelperHandler", "Lcom/core/shared/localization_operation/local_helper/LocaleHelperHandler;", "getLocaleHelperHandler", "()Lcom/core/shared/localization_operation/local_helper/LocaleHelperHandler;", "localeHelperHandler$delegate", "fawrySdkCallback", "Lcom/fawry/fawrypay/interfaces/FawrySdkCallbacks;", "getFawrySdkLang", "Lcom/fawry/fawrypay/FawrySdk$Languages;", "initFawrySdk", "baseUrl", "fawryLaunchUiModel", "Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/FawryLaunchUiModel;", "onFailure", "onSuccess", "core_stagingDebug"})
public final class FawrySdkManager implements com.core.shared.fawry_sdk_manager.FawrySdkHandler, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy localeHelperHandler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fawrySdk$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function2<? super java.lang.String, java.lang.Object, kotlin.Unit> _onSuccess;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> _onFailure;
    
    public FawrySdkManager(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    private final com.core.shared.localization_operation.local_helper.LocaleHelperHandler getLocaleHelperHandler() {
        return null;
    }
    
    private final com.fawry.fawrypay.FawrySdk getFawrySdk() {
        return null;
    }
    
    @java.lang.Override()
    public void initFawrySdk(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.FawryLaunchUiModel fawryLaunchUiModel) {
    }
    
    private final com.fawry.fawrypay.FawrySdk.Languages getFawrySdkLang() {
        return null;
    }
    
    private final com.fawry.fawrypay.interfaces.FawrySdkCallbacks fawrySdkCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, java.lang.Object, kotlin.Unit> onSuccess) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}