package com.core.shared.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010\u000b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\n\u0010\u001c\u001a\u00020\u000f*\u00020\u001dR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\n\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/core/shared/utils/LiveOkhttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lcom/core/shared/utils/LiveOkhttpLoggingInterceptor$Logger;", "(Lcom/core/shared/utils/LiveOkhttpLoggingInterceptor$Logger;)V", "headersToRedact", "", "", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "bodyHasUnknownEncoding", "", "headers", "Lokhttp3/Headers;", "-deprecated_level", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logHeader", "", "i", "", "setLevel", "isProbablyUtf8", "Lokio/Buffer;", "Logger", "core_liveRelease"})
public final class LiveOkhttpLoggingInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final com.core.shared.utils.LiveOkhttpLoggingInterceptor.Logger logger = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private volatile java.util.Set<java.lang.String> headersToRedact;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private volatile okhttp3.logging.HttpLoggingInterceptor.Level level = okhttp3.logging.HttpLoggingInterceptor.Level.BODY;
    
    @kotlin.jvm.JvmOverloads()
    public LiveOkhttpLoggingInterceptor() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public LiveOkhttpLoggingInterceptor(@org.jetbrains.annotations.NotNull()
    com.core.shared.utils.LiveOkhttpLoggingInterceptor.Logger logger) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor.Level getLevel() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "level")
    public final void level(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor.Level p0) {
    }
    
    /**
     * Sets the level and returns this.
     *
     * This was deprecated in OkHttp 4.0 in favor of the [level] val. In OkHttp 4.3 it is
     * un-deprecated because Java callers can't chain when assigning Kotlin vals. (The getter remains
     * deprecated).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.utils.LiveOkhttpLoggingInterceptor setLevel(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor.Level level) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    private final void logHeader(okhttp3.Headers headers, int i) {
    }
    
    private final boolean bodyHasUnknownEncoding(okhttp3.Headers headers) {
        return false;
    }
    
    public final boolean isProbablyUtf8(@org.jetbrains.annotations.NotNull()
    okio.Buffer $this$isProbablyUtf8) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/core/shared/utils/LiveOkhttpLoggingInterceptor$Logger;", "", "log", "", "message", "", "Companion", "core_liveRelease"})
    public static abstract interface Logger {
        
        /**
         * A [Logger] defaults output appropriate for the current platform.
         */
        @kotlin.jvm.JvmField()
        @org.jetbrains.annotations.NotNull()
        public static final com.core.shared.utils.LiveOkhttpLoggingInterceptor.Logger DEFAULT = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.core.shared.utils.LiveOkhttpLoggingInterceptor.Logger.Companion Companion = null;
        
        public abstract void log(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/core/shared/utils/LiveOkhttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lcom/core/shared/utils/LiveOkhttpLoggingInterceptor$Logger;", "DefaultLogger", "core_liveRelease"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/core/shared/utils/LiveOkhttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lcom/core/shared/utils/LiveOkhttpLoggingInterceptor$Logger;", "()V", "log", "", "message", "", "core_liveRelease"})
            static final class DefaultLogger implements com.core.shared.utils.LiveOkhttpLoggingInterceptor.Logger {
                
                public DefaultLogger() {
                    super();
                }
                
                @java.lang.Override()
                public void log(@org.jetbrains.annotations.NotNull()
                java.lang.String message) {
                }
            }
        }
    }
}