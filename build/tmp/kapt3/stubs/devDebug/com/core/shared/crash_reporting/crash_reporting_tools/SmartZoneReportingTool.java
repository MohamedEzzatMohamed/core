package com.core.shared.crash_reporting.crash_reporting_tools;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/core/shared/crash_reporting/crash_reporting_tools/SmartZoneReportingTool;", "", "identifier", "Lcom/core/shared/crash_reporting/CrashReportingToolIdentifier;", "getIdentifier", "()Lcom/core/shared/crash_reporting/CrashReportingToolIdentifier;", "log", "", "priority", "", "tag", "", "message", "throwable", "", "setCrashReportingKey", "key", "value", "core_devDebug"})
public abstract interface SmartZoneReportingTool {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.core.shared.crash_reporting.CrashReportingToolIdentifier getIdentifier();
    
    public abstract void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable);
    
    public abstract void setCrashReportingKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value);
}