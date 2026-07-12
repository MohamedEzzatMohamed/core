package com.core.shared.state;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\n\u000b\f\r\u000eB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0001\u0004\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/core/shared/state/State;", "T", "", "()V", "hasBeenHandled", "", "getHasBeenHandled", "()Z", "setHasBeenHandled", "(Z)V", "Companion", "Error", "Initial", "Loading", "Success", "Lcom/core/shared/state/State$Error;", "Lcom/core/shared/state/State$Initial;", "Lcom/core/shared/state/State$Loading;", "Lcom/core/shared/state/State$Success;", "core_stagingDebug"})
public abstract class State<T extends java.lang.Object> {
    private boolean hasBeenHandled = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.core.shared.state.State.Companion Companion = null;
    
    private State() {
        super();
    }
    
    public final boolean getHasBeenHandled() {
        return false;
    }
    
    public final void setHasBeenHandled(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bJ4\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\b\u0012\u00060\rj\u0002`\u000e\u0018\u00010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/core/shared/state/State$Companion;", "", "()V", "criticalError", "Lcom/core/shared/state/State$Error;", "T", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "infoError", "warnError", "errors", "", "Ljava/lang/Error;", "Lcom/core/shared/state/ResponseErrors;", "core_stagingDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.core.shared.state.State.Error<T> infoError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.core.shared.state.State.Error<T> warnError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Error> errors) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.core.shared.state.State.Error<T> criticalError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/core/shared/state/State$Error;", "T", "Lcom/core/shared/state/State;", "error", "Lcom/core/shared/error/SmartZoneError;", "(Lcom/core/shared/error/SmartZoneError;)V", "getError", "()Lcom/core/shared/error/SmartZoneError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_stagingDebug"})
    public static final class Error<T extends java.lang.Object> extends com.core.shared.state.State<T> {
        @org.jetbrains.annotations.NotNull()
        private final com.core.shared.error.SmartZoneError error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.core.shared.error.SmartZoneError component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.core.shared.state.State.Error<T> copy(@org.jetbrains.annotations.NotNull()
        com.core.shared.error.SmartZoneError error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        com.core.shared.error.SmartZoneError error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.core.shared.error.SmartZoneError getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/core/shared/state/State$Initial;", "T", "Lcom/core/shared/state/State;", "()V", "core_stagingDebug"})
    public static final class Initial<T extends java.lang.Object> extends com.core.shared.state.State<T> {
        
        public Initial() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/core/shared/state/State$Loading;", "T", "Lcom/core/shared/state/State;", "()V", "core_stagingDebug"})
    public static final class Loading<T extends java.lang.Object> extends com.core.shared.state.State<T> {
        
        public Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/core/shared/state/State$Success;", "T", "Lcom/core/shared/state/State;", "data", "error", "Lcom/core/shared/error/SmartZoneError;", "(Ljava/lang/Object;Lcom/core/shared/error/SmartZoneError;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/core/shared/error/SmartZoneError;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/core/shared/error/SmartZoneError;)Lcom/core/shared/state/State$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "core_stagingDebug"})
    public static final class Success<T extends java.lang.Object> extends com.core.shared.state.State<T> {
        @org.jetbrains.annotations.Nullable()
        private final T data = null;
        @org.jetbrains.annotations.Nullable()
        private final com.core.shared.error.SmartZoneError error = null;
        
        @org.jetbrains.annotations.Nullable()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.core.shared.error.SmartZoneError component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.core.shared.state.State.Success<T> copy(@org.jetbrains.annotations.Nullable()
        T data, @org.jetbrains.annotations.Nullable()
        com.core.shared.error.SmartZoneError error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.Nullable()
        T data, @org.jetbrains.annotations.Nullable()
        com.core.shared.error.SmartZoneError error) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T getData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.core.shared.error.SmartZoneError getError() {
            return null;
        }
        
        public Success() {
        }
    }
}