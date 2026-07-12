package com.core.shared.gps_manager

import android.annotation.SuppressLint
import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData

@SuppressLint("RestrictedApi")
class GpsStateManager(private val activity: Activity) : BroadcastReceiver(),
    GpsStateHandler {

    private val appCompatActivity get() = (activity as AppCompatActivity)
    private var gpsState = MutableLiveData<Boolean>()

    override fun onReceive(context: Context, intent: Intent?) {
        if (intent?.action?.matches(LocationManager.PROVIDERS_CHANGED_ACTION.toRegex()) == true) {
            gpsState.postValue(isGPSEnabled(context))
        }
    }

    override fun getGpsState(isEnabled: (Boolean) -> Unit) =
        gpsState.observe(appCompatActivity) { isEnabled(it) }


    private fun isGPSEnabled(context: Context): Boolean {
        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
    }


    init {
        handleReceiverCallbackRegistration()
    }

    private fun handleReceiverCallbackRegistration() {
        appCompatActivity.lifecycle.addObserver(object : DefaultLifecycleObserver {
            override fun onCreate(owner: LifecycleOwner) {
                super.onCreate(owner)
                gpsState.postValue(isGPSEnabled(activity))
                registerGpsStateReceiver()
            }

            override fun onDestroy(owner: LifecycleOwner) {
                super.onDestroy(owner)
                unRegisterGpsStateReceiver()
            }
        })
    }

    private fun registerGpsStateReceiver() {
        val filter = IntentFilter(LocationManager.PROVIDERS_CHANGED_ACTION)
        appCompatActivity.registerReceiver(this, filter)
    }


    private fun unRegisterGpsStateReceiver() =
        appCompatActivity.unregisterReceiver(this)
}