package com.core.shared.token_utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/core/shared/token_utils/TokensManager;", "Lcom/core/shared/token_utils/TokenHandler;", "Lorg/koin/core/component/KoinComponent;", "()V", "encryptedSharedPreference", "Lcom/core/shared/storage_manager/StorageManager;", "getEncryptedSharedPreference", "()Lcom/core/shared/storage_manager/StorageManager;", "encryptedSharedPreference$delegate", "Lkotlin/Lazy;", "clearAppToken", "", "clearToken", "getAppToken", "", "getExpirationDate", "getPayload", "Lcom/core/shared/token_utils/JwtPayload;", "getToken", "handleSaveAppToken", "appToken", "handleSaveToken", "token", "saveAppToken", "saveToken", "core_stagingDebug"})
public final class TokensManager implements com.core.shared.token_utils.TokenHandler, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy encryptedSharedPreference$delegate = null;
    
    public TokensManager() {
        super();
    }
    
    private final com.core.shared.storage_manager.StorageManager getEncryptedSharedPreference() {
        return null;
    }
    
    @java.lang.Override()
    public void saveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @java.lang.Override()
    public void saveAppToken(@org.jetbrains.annotations.NotNull()
    java.lang.String appToken) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getToken() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getAppToken() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.core.shared.token_utils.JwtPayload getPayload() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getExpirationDate() {
        return null;
    }
    
    @java.lang.Override()
    public void clearToken() {
    }
    
    @java.lang.Override()
    public void clearAppToken() {
    }
    
    @java.lang.Override()
    public void handleSaveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @java.lang.Override()
    public void handleSaveAppToken(@org.jetbrains.annotations.NotNull()
    java.lang.String appToken) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}