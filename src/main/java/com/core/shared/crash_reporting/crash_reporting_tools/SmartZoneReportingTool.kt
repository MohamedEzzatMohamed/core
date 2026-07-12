package com.core.shared.crash_reporting.crash_reporting_tools

import com.core.shared.crash_reporting.CrashReportingToolIdentifier

interface SmartZoneReportingTool {
    val identifier: CrashReportingToolIdentifier
    fun log(priority: Int, tag: String?, message: String, throwable: Throwable?)
    fun setCrashReportingKey(key: String, value: Any?)
}