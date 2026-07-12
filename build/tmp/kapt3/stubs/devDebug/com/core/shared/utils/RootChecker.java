package com.core.shared.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/core/shared/utils/RootChecker;", "", "()V", "Companion", "core_devDebug"})
public final class RootChecker {
    @org.jetbrains.annotations.NotNull()
    public static final com.core.shared.utils.RootChecker.Companion Companion = null;
    
    public RootChecker() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086 \u00a8\u0006\u0005"}, d2 = {"Lcom/core/shared/utils/RootChecker$Companion;", "", "()V", "isDeviceRootedNative", "", "core_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final native boolean isDeviceRootedNative() {
            return false;
        }
    }
}