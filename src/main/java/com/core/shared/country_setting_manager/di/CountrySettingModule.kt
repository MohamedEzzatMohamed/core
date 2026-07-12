package com.core.shared.country_setting_manager.di

import com.core.shared.country_setting_manager.CountrySettingHandler
import com.core.shared.country_setting_manager.CountrySettingManager
import org.koin.dsl.module


internal val countrySettingModule = module {
    single<CountrySettingHandler> { CountrySettingManager() }
}