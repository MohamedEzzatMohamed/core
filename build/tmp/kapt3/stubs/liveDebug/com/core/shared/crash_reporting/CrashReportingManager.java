package com.core.shared.crash_reporting;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\u000eH&J,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\tH&J$\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001dH&J$\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH&R \u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u001f"}, d2 = {"Lcom/core/shared/crash_reporting/CrashReportingManager;", "", "crashReportingKeys", "", "", "getCrashReportingKeys", "()Ljava/util/Map;", "smartZoneReportingTools", "Lcom/core/shared/crash_reporting/CrashReportingToolIdentifier;", "Lcom/core/shared/crash_reporting/crash_reporting_tools/SmartZoneReportingTool;", "getSmartZoneReportingTools", "getCrashReportingTool", "identifier", "initCrashReportingKeys", "", "log", "priority", "", "tag", "message", "t", "", "registerCrashReportingTool", "smartZoneReportingTool", "setCrashReportingKey", "key", "Lcom/core/shared/crash_reporting/CrashReportingKey;", "value", "stored", "", "unRegisterCrashReportingTool", "core_liveDebug"})
@androidx.annotation.Keep()
public abstract interface CrashReportingManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<com.core.shared.crash_reporting.CrashReportingToolIdentifier, com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool> getSmartZoneReportingTools();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.lang.Object> getCrashReportingKeys();
    
    public abstract void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t);
    
    public abstract void registerCrashReportingTool(@org.jetbrains.annotations.NotNull()
    com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool smartZoneReportingTool);
    
    public abstract void unRegisterCrashReportingTool(@org.jetbrains.annotations.NotNull()
    com.core.shared.crash_reporting.CrashReportingToolIdentifier identifier);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool getCrashReportingTool(@org.jetbrains.annotations.NotNull()
    com.core.shared.crash_reporting.CrashReportingToolIdentifier identifier);
    
    public abstract void initCrashReportingKeys();
    
    public abstract void setCrashReportingKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value, boolean stored);
    
    public abstract void setCrashReportingKey(@org.jetbrains.annotations.NotNull()
    com.core.shared.crash_reporting.CrashReportingKey key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value, boolean stored);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}