package com.core.shared.error;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\'()B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010%\u001a\u00020&R&\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001b\u0082\u0001\u0003*+,\u00a8\u0006-"}, d2 = {"Lcom/core/shared/error/SmartZoneError;", "", "()V", "errors", "", "Ljava/lang/Error;", "Lkotlin/Error;", "getErrors", "()Ljava/util/List;", "setErrors", "(Ljava/util/List;)V", "exception", "", "getException", "()Ljava/lang/Throwable;", "setException", "(Ljava/lang/Throwable;)V", "extraData", "getExtraData", "()Ljava/lang/Object;", "setExtraData", "(Ljava/lang/Object;)V", "logMessage", "", "getLogMessage", "()Ljava/lang/String;", "setLogMessage", "(Ljava/lang/String;)V", "logPriority", "Lcom/core/shared/error/ErrorLogPriority;", "getLogPriority", "()Lcom/core/shared/error/ErrorLogPriority;", "setLogPriority", "(Lcom/core/shared/error/ErrorLogPriority;)V", "logTag", "getLogTag", "setLogTag", "logError", "", "E", "I", "W", "Lcom/core/shared/error/SmartZoneError$E;", "Lcom/core/shared/error/SmartZoneError$I;", "Lcom/core/shared/error/SmartZoneError$W;", "core_liveDebug"})
public abstract class SmartZoneError {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Throwable exception;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object extraData;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.lang.Error> errors;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String logMessage;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String logTag = "SmartZone Error =>";
    @org.jetbrains.annotations.NotNull()
    private com.core.shared.error.ErrorLogPriority logPriority = com.core.shared.error.ErrorLogPriority.ERROR;
    
    private SmartZoneError() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getException() {
        return null;
    }
    
    public final void setException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExtraData() {
        return null;
    }
    
    public final void setExtraData(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Error> getErrors() {
        return null;
    }
    
    public final void setErrors(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Error> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogMessage() {
        return null;
    }
    
    public final void setLogMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogTag() {
        return null;
    }
    
    public final void setLogTag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.error.ErrorLogPriority getLogPriority() {
        return null;
    }
    
    public final void setLogPriority(@org.jetbrains.annotations.NotNull()
    com.core.shared.error.ErrorLogPriority p0) {
    }
    
    public final void logError() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/core/shared/error/SmartZoneError$E;", "Lcom/core/shared/error/SmartZoneError;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errors", "", "Ljava/lang/Error;", "Lkotlin/Error;", "logMessage", "", "logTag", "extraData", "", "(Ljava/lang/Exception;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "core_liveDebug"})
    public static final class E extends com.core.shared.error.SmartZoneError {
        
        public E(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Error> errors, @org.jetbrains.annotations.Nullable()
        java.lang.String logMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String logTag, @org.jetbrains.annotations.Nullable()
        java.lang.Object extraData) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/core/shared/error/SmartZoneError$I;", "Lcom/core/shared/error/SmartZoneError;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errors", "", "Ljava/lang/Error;", "Lkotlin/Error;", "logMessage", "", "logTag", "extraData", "", "(Ljava/lang/Exception;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "core_liveDebug"})
    public static final class I extends com.core.shared.error.SmartZoneError {
        
        public I(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Error> errors, @org.jetbrains.annotations.Nullable()
        java.lang.String logMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String logTag, @org.jetbrains.annotations.Nullable()
        java.lang.Object extraData) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/core/shared/error/SmartZoneError$W;", "Lcom/core/shared/error/SmartZoneError;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errors", "", "Ljava/lang/Error;", "Lkotlin/Error;", "logMessage", "", "logTag", "extraData", "", "(Ljava/lang/Exception;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "core_liveDebug"})
    public static final class W extends com.core.shared.error.SmartZoneError {
        
        public W(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Error> errors, @org.jetbrains.annotations.Nullable()
        java.lang.String logMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String logTag, @org.jetbrains.annotations.Nullable()
        java.lang.Object extraData) {
        }
    }
}