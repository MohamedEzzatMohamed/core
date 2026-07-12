package com.core.shared.crash_reporting.crash_reporting_tools;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/core/shared/crash_reporting/crash_reporting_tools/FirebaseCrashReportingTool;", "Lcom/core/shared/crash_reporting/crash_reporting_tools/SmartZoneReportingTool;", "()V", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "getCrashlytics", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "identifier", "Lcom/core/shared/crash_reporting/CrashReportingToolIdentifier;", "getIdentifier", "()Lcom/core/shared/crash_reporting/CrashReportingToolIdentifier;", "log", "", "priority", "", "tag", "", "message", "throwable", "", "setCrashReportingKey", "key", "value", "", "core_liveRelease"})
public final class FirebaseCrashReportingTool implements com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool {
    @org.jetbrains.annotations.NotNull()
    private final com.core.shared.crash_reporting.CrashReportingToolIdentifier identifier = null;
    
    public FirebaseCrashReportingTool() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.crash_reporting.CrashReportingToolIdentifier getIdentifier() {
        return null;
    }
    
    private final com.google.firebase.crashlytics.FirebaseCrashlytics getCrashlytics() {
        return null;
    }
    
    @java.lang.Override()
    public void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void setCrashReportingKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
}