package com.core.shared.storage_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0015H\u0016J+\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0010\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0016\u00a2\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\u0018\u0010 \u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J#\u0010!\u001a\u00020\t\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\"\u001a\u0002H\u0017H\u0016\u00a2\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/core/shared/storage_manager/SharedPreferencesManager;", "Lcom/core/shared/storage_manager/StorageManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPref", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "clearStorage", "", "getAll", "", "", "", "getBoolean", "", "key", "defaultValue", "getFloat", "", "getInteger", "", "getObject", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "remove", "setBoolean", "value", "setFloat", "setInteger", "setObject", "objects", "(Ljava/lang/String;Ljava/lang/Object;)V", "setString", "core_stagingDebug"})
public final class SharedPreferencesManager implements com.core.shared.storage_manager.StorageManager {
    private final android.content.SharedPreferences sharedPref = null;
    
    public SharedPreferencesManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
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