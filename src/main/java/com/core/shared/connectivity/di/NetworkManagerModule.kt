package com.core.shared.connectivity.di

import android.app.Activity
import com.core.shared.connectivity.connectivity_manager.ConnectivityManager
import com.core.shared.connectivity.internet_access_observer.InternetAccessObserver
import org.koin.dsl.module

internal val connectivityManagerModule = module {
    single { (activity: Activity) ->
        val internetAccessObserver = InternetAccessObserver(activity)
        ConnectivityManager(activity, internetAccessObserver)
    }
}