package com.core.shared.crash_reporting.di

import com.core.shared.crash_reporting.CrashReportingManager
import com.core.shared.crash_reporting.SmartZoneCrashReportingManager
import com.core.shared.crash_reporting.crash_reporting_tools.FirebaseCrashReportingTool
import com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool
import org.koin.dsl.module

internal val crashReportingModule = module {
    single<CrashReportingManager> { SmartZoneCrashReportingManager() }
    single<SmartZoneReportingTool> { FirebaseCrashReportingTool() }
}
