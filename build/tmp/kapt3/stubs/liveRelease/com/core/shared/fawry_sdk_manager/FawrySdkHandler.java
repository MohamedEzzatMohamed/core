package com.core.shared.fawry_sdk_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\tH&J$\u0010\n\u001a\u00020\u00032\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/core/shared/fawry_sdk_manager/FawrySdkHandler;", "", "initFawrySdk", "", "baseUrl", "", "fawryLaunchUiModel", "Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/FawryLaunchUiModel;", "onFailure", "Lkotlin/Function1;", "onSuccess", "Lkotlin/Function2;", "core_liveRelease"})
public abstract interface FawrySdkHandler {
    
    public abstract void initFawrySdk(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.FawryLaunchUiModel fawryLaunchUiModel);
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, java.lang.Object, kotlin.Unit> onSuccess);
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
}