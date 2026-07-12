package com.core.shared.firebase_remote_config.di

import com.core.shared.firebase_remote_config.FirebaseRemoteConfigHandler
import com.core.shared.firebase_remote_config.FirebaseRemoteConfigManager
import org.koin.dsl.module


internal val firebaseRemoteConfigModule = module {
    single<FirebaseRemoteConfigHandler> { FirebaseRemoteConfigManager() }
}
