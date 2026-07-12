package com.core.shared.firebase_remote_config

import androidx.annotation.XmlRes

interface FirebaseRemoteConfigHandler {

    fun setDefaultRemoteConfig(@XmlRes defaultRemoteConfig: Int)

    fun getFirebaseRemoteConfigSuccessState(success: () -> Unit)

    fun getStringValue(key: String) : String

    fun getLongValue(key: String) : Long

    fun getDoubleValue(key: String) : Double

    fun getBooleanValue(key: String) : Boolean
}