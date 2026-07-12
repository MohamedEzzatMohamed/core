package com.core.shared.token_utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&\u00a8\u0006\u0011"}, d2 = {"Lcom/core/shared/token_utils/TokenHandler;", "", "clearAppToken", "", "clearToken", "getAppToken", "", "getExpirationDate", "getPayload", "Lcom/core/shared/token_utils/JwtPayload;", "getToken", "handleSaveAppToken", "appToken", "handleSaveToken", "token", "saveAppToken", "saveToken", "core_devDebug"})
public abstract interface TokenHandler {
    
    public abstract void saveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getToken();
    
    public abstract void saveAppToken(@org.jetbrains.annotations.NotNull()
    java.lang.String appToken);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getAppToken();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.core.shared.token_utils.JwtPayload getPayload();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getExpirationDate();
    
    public abstract void clearToken();
    
    public abstract void clearAppToken();
    
    public abstract void handleSaveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    public abstract void handleSaveAppToken(@org.jetbrains.annotations.NotNull()
    java.lang.String appToken);
}