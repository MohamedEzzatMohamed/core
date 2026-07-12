package com.core.shared.firebase_remote_config


import androidx.annotation.XmlRes
import com.core.shared.BuildConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfig

class FirebaseRemoteConfigManager : FirebaseRemoteConfigHandler {


    private var firebaseRemoteConfig: FirebaseRemoteConfig = FirebaseRemoteConfig.getInstance()

    override fun setDefaultRemoteConfig(@XmlRes defaultRemoteConfig: Int) {
        firebaseRemoteConfig.setDefaultsAsync(defaultRemoteConfig)
    }


    override fun getFirebaseRemoteConfigSuccessState(success: () -> Unit) {
        firebaseRemoteConfig.fetch(0)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    firebaseRemoteConfig.activate()
                        .addOnCompleteListener { activateTask ->
                            if (activateTask.isSuccessful) {
                                success()
                            }
                        }
                }
            }
    }

    override fun getStringValue(key: String) = firebaseRemoteConfig.getString(key)


    override fun getLongValue(key: String) = firebaseRemoteConfig.getLong(key)


    override fun getDoubleValue(key: String) = firebaseRemoteConfig.getDouble(key)


    override fun getBooleanValue(key: String) = firebaseRemoteConfig.getBoolean(key)

}