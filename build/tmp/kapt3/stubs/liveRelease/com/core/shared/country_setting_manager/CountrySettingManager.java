package com.core.shared.country_setting_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J#\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u001b\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0017\u001a\u0002H\u000eH\u0016\u00a2\u0006\u0002\u0010\u0018R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/core/shared/country_setting_manager/CountrySettingManager;", "Lcom/core/shared/country_setting_manager/CountrySettingHandler;", "Lorg/koin/core/component/KoinComponent;", "()V", "sharedPreference", "Lcom/core/shared/storage_manager/StorageManager;", "getSharedPreference", "()Lcom/core/shared/storage_manager/StorageManager;", "sharedPreference$delegate", "Lkotlin/Lazy;", "clearSelectedCountry", "", "clearSelectedCountryData", "getSelectedCountryData", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "isSelectedCountry", "", "setSelectedCountry", "isCountrySelected", "setSelectedCountryData", "countryData", "(Ljava/lang/Object;)V", "core_liveRelease"})
public final class CountrySettingManager implements com.core.shared.country_setting_manager.CountrySettingHandler, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedPreference$delegate = null;
    
    public CountrySettingManager() {
        super();
    }
    
    private final com.core.shared.storage_manager.StorageManager getSharedPreference() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedCountry(boolean isCountrySelected) {
    }
    
    @java.lang.Override()
    public boolean isSelectedCountry() {
        return false;
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void setSelectedCountryData(T countryData) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public <T extends java.lang.Object>T getSelectedCountryData(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type) {
        return null;
    }
    
    @java.lang.Override()
    public void clearSelectedCountry() {
    }
    
    @java.lang.Override()
    public void clearSelectedCountryData() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}