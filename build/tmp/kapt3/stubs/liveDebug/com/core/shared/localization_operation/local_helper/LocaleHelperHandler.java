package com.core.shared.localization_operation.local_helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J#\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00052\u0006\u0010\u0007\u001a\u0002H\u0005H&\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u0014"}, d2 = {"Lcom/core/shared/localization_operation/local_helper/LocaleHelperHandler;", "", "getLocale", "Ljava/util/Locale;", "getLocalizedValue", "T", "enValue", "localeValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "init", "", "application", "Landroid/app/Application;", "isEnglishSelected", "", "setLocale", "context", "Landroid/app/Activity;", "language", "Lcom/core/shared/localization_operation/local_helper/LocaleHelper$SupportedLanguage;", "core_liveDebug"})
public abstract interface LocaleHelperHandler {
    
    public abstract void init(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    public abstract void setLocale(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    com.core.shared.localization_operation.local_helper.LocaleHelper.SupportedLanguage language);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Locale getLocale();
    
    public abstract boolean isEnglishSelected();
    
    public abstract <T extends java.lang.Object>T getLocalizedValue(T enValue, T localeValue);
}