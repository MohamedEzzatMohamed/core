package com.core.shared.localization_operation.language_setting;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/core/shared/localization_operation/language_setting/LanguageSelectedSettingHandler;", "", "clearSelectedLanguage", "", "isSelectedLanguage", "", "setSelectedLanguageStatus", "core_liveRelease"})
public abstract interface LanguageSelectedSettingHandler {
    
    public abstract void setSelectedLanguageStatus();
    
    public abstract boolean isSelectedLanguage();
    
    public abstract void clearSelectedLanguage();
}