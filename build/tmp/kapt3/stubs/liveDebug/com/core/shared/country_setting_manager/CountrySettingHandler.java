package com.core.shared.country_setting_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J#\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&J\u001b\u0010\u000e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000f\u001a\u0002H\u0006H&\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/core/shared/country_setting_manager/CountrySettingHandler;", "", "clearSelectedCountry", "", "clearSelectedCountryData", "getSelectedCountryData", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "isSelectedCountry", "", "setSelectedCountry", "isCountrySelected", "setSelectedCountryData", "countryData", "(Ljava/lang/Object;)V", "core_liveDebug"})
public abstract interface CountrySettingHandler {
    
    public abstract void setSelectedCountry(boolean isCountrySelected);
    
    public abstract boolean isSelectedCountry();
    
    public abstract <T extends java.lang.Object>void setSelectedCountryData(T countryData);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T getSelectedCountryData(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type);
    
    public abstract void clearSelectedCountry();
    
    public abstract void clearSelectedCountryData();
}