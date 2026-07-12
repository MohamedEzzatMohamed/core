package com.core.shared.storage_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0019H\u0016J+\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001dH\u0016\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0006H\u0002J\u001c\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0013H\u0016J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0017H\u0016J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0019H\u0016J#\u0010&\u001a\u00020\f\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\'\u001a\u0002H\u001bH\u0016\u00a2\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0010H\u0016J\u0010\u0010*\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006+"}, d2 = {"Lcom/core/shared/storage_manager/EncryptedSharedPreferenceManager;", "Lcom/core/shared/storage_manager/StorageManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "clearStorage", "", "createNewSharedPreferenceFile", "getAll", "", "", "", "getBoolean", "", "key", "defaultValue", "getFloat", "", "getInteger", "", "getObject", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getStoredSharedPreferences", "getString", "remove", "setBoolean", "value", "setFloat", "setInteger", "setObject", "objects", "(Ljava/lang/String;Ljava/lang/Object;)V", "setString", "trySharedPreferences", "core_devDebug"})
public final class EncryptedSharedPreferenceManager implements com.core.shared.storage_manager.StorageManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedPreferences$delegate = null;
    
    public EncryptedSharedPreferenceManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    private final android.content.SharedPreferences getStoredSharedPreferences() {
        return null;
    }
    
    private final void trySharedPreferences(android.content.SharedPreferences sharedPreferences) {
    }
    
    private final android.content.SharedPreferences createNewSharedPreferenceFile() {
        return null;
    }
    
    @java.lang.Override()
    public void setBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    @java.lang.Override()
    public boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    @java.lang.Override()
    public void setInteger(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    @java.lang.Override()
    public int getInteger(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    @java.lang.Override()
    public void setFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    @java.lang.Override()
    public float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float defaultValue) {
        return 0.0F;
    }
    
    @java.lang.Override()
    public void setString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultValue) {
        return null;
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void setObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T objects) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public <T extends java.lang.Object>T getObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.util.Map<java.lang.String, java.lang.Object> getAll() {
        return null;
    }
    
    @java.lang.Override()
    public void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public void clearStorage() {
    }
}