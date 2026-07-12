package com.core.shared.base_application

import android.app.Application
import androidx.annotation.Keep
import com.core.shared.BuildConfig
import com.core.shared.crash_reporting.CrashReportingKey
import com.core.shared.crash_reporting.CrashReportingManager
import com.pluto.Pluto
import com.pluto.plugins.network.PlutoNetworkPlugin
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import timber.log.Timber
import zerobranch.androidremotedebugger.AndroidRemoteDebugger

@Keep
abstract class BaseApplication : Application(), KoinComponent {


    private val crashReportingManager: CrashReportingManager by inject()


    override fun onCreate() {
        super.onCreate()
        initCrashReportingManager()
        plantTimberTrees()
        initRemoteDebugger()
        initPluto()
    }

    private fun initCrashReportingManager() {
        if (this::crashReportingManager.isLateinit)
            addCrashReportingTools(crashReportingManager)
    }

    open fun addCrashReportingTools(crashReportingManager: CrashReportingManager?) = Unit

    private fun plantTimberTrees() {
        Timber.plant(CrashReportingTree())
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.plant(RemoteDebuggerTree())
        }
    }

    private inner class CrashReportingTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            setPreLogKeys()
            crashReportingManager.log(priority, tag, message, t)
        }
    }

    private fun setPreLogKeys() {
        getPreLogKeys().forEach { (key, value) ->
            crashReportingManager.setCrashReportingKey(
                key, value
            )
        }
    }

    open fun getPreLogKeys(): List<Pair<CrashReportingKey, String?>> = listOf()

    private fun initRemoteDebugger() {
        if (!BuildConfig.DEBUG) return
        val remoteDebugger = AndroidRemoteDebugger.Builder(applicationContext)
            .disableInternalLogging()
            .port(getRemoteDebuggerPort())
            .build()
        AndroidRemoteDebugger.init(remoteDebugger)
    }

    abstract fun getRemoteDebuggerPort(): Int

    private fun initPluto() = Pluto.Installer(this).apply {
        getPlutoPlugins().forEach { addPlugin(it) }
    }.install()


    open fun getPlutoPlugins() = listOf(PlutoNetworkPlugin("network"))

    private inner class RemoteDebuggerTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            AndroidRemoteDebugger.Log.log(priority, tag, message, t)
        }
    }

}