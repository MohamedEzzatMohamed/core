package com.core.shared.fawry_sdk_manager.di

import android.app.Activity
import com.core.shared.fawry_sdk_manager.FawrySdkHandler
import com.core.shared.fawry_sdk_manager.FawrySdkManager
import org.koin.dsl.module


internal val fawrySdkModule = module {
    factory<FawrySdkHandler> { (activity: Activity) -> FawrySdkManager(activity) }
}