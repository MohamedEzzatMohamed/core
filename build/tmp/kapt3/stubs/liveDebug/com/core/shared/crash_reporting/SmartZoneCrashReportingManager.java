package com.core.shared.crash_reporting;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\fH\u0016J\"\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00072\u0006\u0010%\u001a\u00020&H\u0016J\"\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00072\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000bH\u0016R\"\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/core/shared/crash_reporting/SmartZoneCrashReportingManager;", "Lcom/core/shared/crash_reporting/CrashReportingManager;", "Lorg/koin/core/component/KoinComponent;", "()V", "crashReportingKeys", "", "", "", "getCrashReportingKeys", "()Ljava/util/Map;", "smartZoneReportingTools", "Lcom/core/shared/crash_reporting/CrashReportingToolIdentifier;", "Lcom/core/shared/crash_reporting/crash_reporting_tools/SmartZoneReportingTool;", "getSmartZoneReportingTools", "storageManager", "Lcom/core/shared/storage_manager/StorageManager;", "getStorageManager", "()Lcom/core/shared/storage_manager/StorageManager;", "storageManager$delegate", "Lkotlin/Lazy;", "getCrashReportingTool", "identifier", "initCrashReportingKeys", "", "log", "priority", "", "tag", "message", "t", "", "registerCrashReportingTool", "smartZoneReportingTool", "setCrashReportingKey", "key", "Lcom/core/shared/crash_reporting/CrashReportingKey;", "value", "stored", "", "unRegisterCrashReportingTool", "Companion", "core_liveDebug"})
public final class SmartZoneCrashReportingManager implements com.core.shared.crash_reporting.CrashReportingManager, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy storageManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<com.core.shared.crash_reporting.CrashReportingToolIdentifier, com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool> smartZoneReportingTools = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Object> crashReportingKeys = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CRASH_REPORT_KEY = "CRK_";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String APP_VERSION = "APP_VERSION";
    @org.jetbrains.annotations.NotNull()
    public static final com.core.shared.crash_reporting.SmartZoneCrashReportingManager.Companion Companion = null;
    
    public SmartZoneCrashReportingManager() {
        super();
    }
    
    private final com.core.shared.storage_manager.StorageManager getStorageManager() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<com.core.shared.crash_reporting.CrashReportingToolIdentifier, com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool> getSmartZoneReportingTools() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.String, java.lang.Object> getCrashReportingKeys() {
        return null;
    }
    
    @java.lang.Override()
    public void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @java.lang.Override()
    public void registerCrashReportingTool(@org.jetbrains.annotations.NotNull()
    com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool smartZoneReportingTool) {
    }
    
    @java.lang.Override()
    public void unRegisterCrashReportingTool(@org.jetbrains.annotations.NotNull()
    com.core.shared.crash_reporting.CrashReportingToolIdentifier identifier) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool getCrashReportingTool(@org.jetbrains.annotations.NotNull()
    com.core.shared.crash_reporting.CrashReportingToolIdentifier identifier) {
        return null;
    }
    
    @java.lang.Override()
    public void initCrashReportingKeys() {
    }
    
    @java.lang.Override()
    public void setCrashReportingKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value, boolean stored) {
    }
    
    @java.lang.Override()
    public void setCrashReportingKey(@org.jetbrains.annotations.NotNull()
    com.core.shared.crash_reporting.CrashReportingKey key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value, boolean stored) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/core/shared/crash_reporting/SmartZoneCrashReportingManager$Companion;", "", "()V", "APP_VERSION", "", "CRASH_REPORT_KEY", "core_liveDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}