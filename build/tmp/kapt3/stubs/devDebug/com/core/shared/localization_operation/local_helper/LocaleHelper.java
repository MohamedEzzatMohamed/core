package com.core.shared.localization_operation.local_helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J#\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u0002H\r2\u0006\u0010\u000f\u001a\u0002H\rH\u0016\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/core/shared/localization_operation/local_helper/LocaleHelper;", "Lcom/core/shared/localization_operation/local_helper/LocaleHelperHandler;", "Lorg/koin/core/component/KoinComponent;", "()V", "storageManager", "Lcom/core/shared/storage_manager/StorageManager;", "getStorageManager", "()Lcom/core/shared/storage_manager/StorageManager;", "storageManager$delegate", "Lkotlin/Lazy;", "getLocale", "Ljava/util/Locale;", "getLocalizedValue", "T", "enValue", "localeValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "init", "", "application", "Landroid/app/Application;", "isEnglishSelected", "", "persist", "language", "Lcom/core/shared/localization_operation/local_helper/LocaleHelper$SupportedLanguage;", "setLocale", "context", "Landroid/app/Activity;", "SupportedLanguage", "core_devDebug"})
public final class LocaleHelper implements com.core.shared.localization_operation.local_helper.LocaleHelperHandler, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy storageManager$delegate = null;
    
    public LocaleHelper() {
        super();
    }
    
    private final com.core.shared.storage_manager.StorageManager getStorageManager() {
        return null;
    }
    
    @java.lang.Override()
    public void init(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
    
    @java.lang.Override()
    public void setLocale(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    com.core.shared.localization_operation.local_helper.LocaleHelper.SupportedLanguage language) {
    }
    
    private final void persist(com.core.shared.localization_operation.local_helper.LocaleHelper.SupportedLanguage language) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Locale getLocale() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isEnglishSelected() {
        return false;
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>T getLocalizedValue(T enValue, T localeValue) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/core/shared/localization_operation/local_helper/LocaleHelper$SupportedLanguage;", "", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;ILjava/util/Locale;)V", "getLocale", "()Ljava/util/Locale;", "ENGLISH", "ARABIC", "core_devDebug"})
    public static enum SupportedLanguage {
        /*public static final*/ ENGLISH /* = new ENGLISH(null) */,
        /*public static final*/ ARABIC /* = new ARABIC(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Locale locale = null;
        
        SupportedLanguage(java.util.Locale locale) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Locale getLocale() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.core.shared.localization_operation.local_helper.LocaleHelper.SupportedLanguage> getEntries() {
            return null;
        }
    }
}