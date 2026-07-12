package com.core.shared.localization_operation.language_setting;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/core/shared/localization_operation/language_setting/LanguageSelectedSettingManager;", "Lcom/core/shared/localization_operation/language_setting/LanguageSelectedSettingHandler;", "Lorg/koin/core/component/KoinComponent;", "()V", "storageManager", "Lcom/core/shared/storage_manager/StorageManager;", "getStorageManager", "()Lcom/core/shared/storage_manager/StorageManager;", "storageManager$delegate", "Lkotlin/Lazy;", "clearSelectedLanguage", "", "isSelectedLanguage", "", "setSelectedLanguageStatus", "core_liveDebug"})
public final class LanguageSelectedSettingManager implements com.core.shared.localization_operation.language_setting.LanguageSelectedSettingHandler, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy storageManager$delegate = null;
    
    public LanguageSelectedSettingManager() {
        super();
    }
    
    private final com.core.shared.storage_manager.StorageManager getStorageManager() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedLanguageStatus() {
    }
    
    @java.lang.Override()
    public boolean isSelectedLanguage() {
        return false;
    }
    
    @java.lang.Override()
    public void clearSelectedLanguage() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}