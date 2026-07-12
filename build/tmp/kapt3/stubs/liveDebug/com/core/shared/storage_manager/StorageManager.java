package com.core.shared.storage_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH&J+\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H&\u00a2\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\bH&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\fH&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000eH&J#\u0010\u001a\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00102\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u0002H\u0010H&\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H&\u00a8\u0006\u001e"}, d2 = {"Lcom/core/shared/storage_manager/StorageManager;", "", "clearStorage", "", "getAll", "", "", "getBoolean", "", "key", "defaultValue", "getFloat", "", "getInteger", "", "getObject", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "remove", "setBoolean", "value", "setFloat", "setInteger", "setObject", "objects", "(Ljava/lang/String;Ljava/lang/Object;)V", "setString", "core_liveDebug"})
public abstract interface StorageManager {
    
    public abstract void setBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value);
    
    public abstract boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue);
    
    public abstract void setInteger(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value);
    
    public abstract int getInteger(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue);
    
    public abstract void setFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value);
    
    public abstract float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float defaultValue);
    
    public abstract void setString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultValue);
    
    public abstract <T extends java.lang.Object>void setObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T objects);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T getObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Map<java.lang.String, java.lang.Object> getAll();
    
    public abstract void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract void clearStorage();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}