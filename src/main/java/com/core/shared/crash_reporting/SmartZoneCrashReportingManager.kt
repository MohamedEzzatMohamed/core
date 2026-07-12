package com.core.shared.crash_reporting

import com.core.shared.crash_reporting.crash_reporting_tools.SmartZoneReportingTool
import com.core.shared.storage_manager.SHARED_PREFERENCE
import com.core.shared.storage_manager.StorageManager
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named


class SmartZoneCrashReportingManager : CrashReportingManager, KoinComponent {

    private val storageManager: StorageManager by inject(named(SHARED_PREFERENCE))

    override val smartZoneReportingTools =
        mutableMapOf<CrashReportingToolIdentifier, SmartZoneReportingTool>()
    override val crashReportingKeys = mutableMapOf<String, Any?>()

    init {
        initCrashReportingKeys()
    }

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        smartZoneReportingTools.values.forEach {
            it.log(priority, tag, message, t)
        }
    }


    override fun registerCrashReportingTool(smartZoneReportingTool: SmartZoneReportingTool) {
        smartZoneReportingTools[smartZoneReportingTool.identifier] = smartZoneReportingTool
    }

    override fun unRegisterCrashReportingTool(identifier: CrashReportingToolIdentifier) {
        smartZoneReportingTools.remove(identifier)
    }

    override fun getCrashReportingTool(identifier: CrashReportingToolIdentifier) =
        smartZoneReportingTools[identifier]

    override fun initCrashReportingKeys() {
        storageManager.getAll()
            ?.filter { it.key.startsWith(CRASH_REPORT_KEY) }
            ?.map { (k, v) -> k.removePrefix(CRASH_REPORT_KEY) to v.toString() }
            ?.forEach { setCrashReportingKey(it.first, it.second) }
    }


    override fun setCrashReportingKey(key: String, value: Any?, stored: Boolean) {
        crashReportingKeys[key] = value
        smartZoneReportingTools.values.forEach { it.setCrashReportingKey(key, value) }
        if (stored) storageManager.setString("$CRASH_REPORT_KEY$key", value.toString())
    }

    override fun setCrashReportingKey(key: CrashReportingKey, value: Any?, stored: Boolean) {
        setCrashReportingKey(key.key, value, stored)
    }

    companion object {
        private const val CRASH_REPORT_KEY = "CRK_"
        private const val APP_VERSION = "APP_VERSION"
    }
}