package com.core.shared.di

import com.core.shared.connectivity.di.connectivityManagerModule
import com.core.shared.country_setting_manager.di.countrySettingModule
import com.core.shared.crash_reporting.di.crashReportingModule
import com.core.shared.device_config_manager.di.deviceConfigModule
import com.core.shared.fawry_sdk_manager.di.fawrySdkModule
import com.core.shared.features.country_code_fragment.di.showCountryCodeViewModelModule
import com.core.shared.firebase_remote_config.di.firebaseRemoteConfigModule
import com.core.shared.gps_manager.di.gpsModule
import com.core.shared.localization_operation.language_setting.di.languageSelectedSettingModule
import com.core.shared.localization_operation.local_helper.di.app_module.localHelperModule
import com.core.shared.location_manager.di.locationModule
import com.core.shared.storage_manager.di.sharedPreferenceModule
import com.core.shared.user_manager.di.userManagerModule
import com.core.shared.utils.dialogs.smartzone_progress_dialog.di.progressDialogModule
import org.koin.dsl.module


val coreAppModule = module {
    includes(crashReportingModule)
    includes(firebaseRemoteConfigModule)
    includes(gpsModule)
    includes(localHelperModule)
    includes(locationModule)
    includes(sharedPreferenceModule)
    includes(connectivityManagerModule)
    includes(userManagerModule)
    includes(countrySettingModule)
    includes(languageSelectedSettingModule)
    includes(progressDialogModule)
    includes(showCountryCodeViewModelModule)
    includes(fawrySdkModule)
    includes(deviceConfigModule)

}