package com.core.shared.crash_reporting

import androidx.annotation.Keep
import com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool
@Keep
interface CrashReportingManager {

    val smartZoneReportingTools: Map<CrashReportingToolIdentifier, SmartZoneReportingTool>
    val crashReportingKeys: Map<String, Any?>

    fun log(priority: Int, tag: String?, message: String, t: Throwable?)

    fun registerCrashReportingTool(smartZoneReportingTool: SmartZoneReportingTool)

    fun unRegisterCrashReportingTool(identifier: CrashReportingToolIdentifier)

    fun getCrashReportingTool(identifier: CrashReportingToolIdentifier): SmartZoneReportingTool?

    fun initCrashReportingKeys()

    fun setCrashReportingKey(key: String, value: Any?, stored: Boolean = false)

    fun setCrashReportingKey(key: CrashReportingKey, value: Any?, stored: Boolean = false)

}

