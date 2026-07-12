package com.core.shared.crash_reporting.crash_reporting_key

import com.core.shared.crash_reporting.CrashReportingKey

class SmartZoneCrashReportingKeys {

    enum class SmartZoneKeys(override val key: String) : CrashReportingKey {
        TOKEN("TOKEN")
    }
}