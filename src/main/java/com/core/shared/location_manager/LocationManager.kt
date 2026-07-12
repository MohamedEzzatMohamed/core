package com.core.shared.location_manager

import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.app.Activity
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.location.Location
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.Granularity
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority

const val INTERVAL_MILS = 5000L
const val MAIN_UPDATE_DESTINATION = 10f

class LocationManager(private val activity: Activity) : LocationHandler {

    private val appCompatActivity get() = (activity as AppCompatActivity)
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var locationCallback: LocationCallback

    private var lastLocation = MutableLiveData<Location>()


    override fun getLastLocation(location: (Location) -> Unit) {
        lastLocation.observe(appCompatActivity) { location(it) }
    }


    init {
        handleReceiverCallbackRegistration()
    }

    private fun handleReceiverCallbackRegistration() {
        appCompatActivity.lifecycle.addObserver(object : DefaultLifecycleObserver {
            override fun onCreate(owner: LifecycleOwner) {
                super.onCreate(owner)
                fusedLocationClient = LocationServices.getFusedLocationProviderClient(activity)
                locationCallback = getLocationCallback()
            }

            override fun onResume(owner: LifecycleOwner) {
                super.onResume(owner)
                startLocationUpdates()
            }

            override fun onPause(owner: LifecycleOwner) {
                super.onPause(owner)
                stopLocationUpdates()
            }

            override fun onDestroy(owner: LifecycleOwner) {
                super.onDestroy(owner)
                stopLocationUpdates()
            }
        })
    }


    private fun getLocationCallback() = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            locationResult.lastLocation?.let { location ->
                if (lastLocation.value != null) {
                    stopLocationUpdates()
                    return@let
                }
                startLocationUpdates()
                lastLocation.postValue(location)
            }
        }
    }


    private fun startLocationUpdates() {
        if (checkSelfPermission(activity, ACCESS_FINE_LOCATION) != PERMISSION_GRANTED) {
            return
        }
        fusedLocationClient.requestLocationUpdates(
            setLocationRequest(), locationCallback, Looper.getMainLooper()
        )
    }

    private fun setLocationRequest() =
        LocationRequest.Builder(Priority.PRIORITY_HIGH_ACCURACY, INTERVAL_MILS).apply {
            setMinUpdateDistanceMeters(MAIN_UPDATE_DESTINATION)
            setGranularity(Granularity.GRANULARITY_PERMISSION_LEVEL)
            setWaitForAccurateLocation(true)
        }.build()


    private fun stopLocationUpdates() = fusedLocationClient.removeLocationUpdates(locationCallback)

}