package com.core.shared.base_application;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\'\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001c\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\rH\u0016J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/core/shared/base_application/BaseApplication;", "Landroid/app/Application;", "Lorg/koin/core/component/KoinComponent;", "()V", "crashReportingManager", "Lcom/core/shared/crash_reporting/CrashReportingManager;", "getCrashReportingManager", "()Lcom/core/shared/crash_reporting/CrashReportingManager;", "crashReportingManager$delegate", "Lkotlin/Lazy;", "addCrashReportingTools", "", "getPlutoPlugins", "", "Lcom/pluto/plugins/network/PlutoNetworkPlugin;", "getPreLogKeys", "Lkotlin/Pair;", "Lcom/core/shared/crash_reporting/CrashReportingKey;", "", "getRemoteDebuggerPort", "", "initCrashReportingManager", "initPluto", "initRemoteDebugger", "onCreate", "plantTimberTrees", "setPreLogKeys", "CrashReportingTree", "RemoteDebuggerTree", "core_liveRelease"})
@androidx.annotation.Keep()
public abstract class BaseApplication extends android.app.Application implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy crashReportingManager$delegate = null;
    
    public BaseApplication() {
        super();
    }
    
    private final com.core.shared.crash_reporting.CrashReportingManager getCrashReportingManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initCrashReportingManager() {
    }
    
    public void addCrashReportingTools(@org.jetbrains.annotations.Nullable()
    com.core.shared.crash_reporting.CrashReportingManager crashReportingManager) {
    }
    
    private final void plantTimberTrees() {
    }
    
    private final void setPreLogKeys() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<kotlin.Pair<com.core.shared.crash_reporting.CrashReportingKey, java.lang.String>> getPreLogKeys() {
        return null;
    }
    
    private final void initRemoteDebugger() {
    }
    
    public abstract int getRemoteDebuggerPort();
    
    private final void initPluto() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.pluto.plugins.network.PlutoNetworkPlugin> getPlutoPlugins() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\f"}, d2 = {"Lcom/core/shared/base_application/BaseApplication$CrashReportingTree;", "Ltimber/log/Timber$Tree;", "(Lcom/core/shared/base_application/BaseApplication;)V", "log", "", "priority", "", "tag", "", "message", "t", "", "core_liveRelease"})
    final class CrashReportingTree extends timber.log.Timber.Tree {
        
        public CrashReportingTree() {
            super();
        }
        
        @java.lang.Override()
        protected void log(int priority, @org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable t) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\f"}, d2 = {"Lcom/core/shared/base_application/BaseApplication$RemoteDebuggerTree;", "Ltimber/log/Timber$Tree;", "(Lcom/core/shared/base_application/BaseApplication;)V", "log", "", "priority", "", "tag", "", "message", "t", "", "core_liveRelease"})
    final class RemoteDebuggerTree extends timber.log.Timber.Tree {
        
        public RemoteDebuggerTree() {
            super();
        }
        
        @java.lang.Override()
        protected void log(int priority, @org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable t) {
        }
    }
}