package com.core.shared.storage_manager.di

import com.core.shared.storage_manager.ENCRYPTED_SHARED_PREFERENCE
import com.core.shared.storage_manager.EncryptedSharedPreferenceManager
import com.core.shared.storage_manager.SHARED_PREFERENCE
import com.core.shared.storage_manager.SharedPreferencesManager
import com.core.shared.storage_manager.StorageManager
import org.koin.core.qualifier.named
import org.koin.dsl.module

val sharedPreferenceModule = module {
    single<StorageManager>(named(ENCRYPTED_SHARED_PREFERENCE)) {
        EncryptedSharedPreferenceManager(get())
    }
    single<StorageManager>(named(SHARED_PREFERENCE)) {
        SharedPreferencesManager(get())
    }
}