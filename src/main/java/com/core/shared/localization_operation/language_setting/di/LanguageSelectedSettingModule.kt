package com.core.shared.localization_operation.language_setting.di

import com.core.shared.localization_operation.language_setting.LanguageSelectedSettingHandler
import com.core.shared.localization_operation.language_setting.LanguageSelectedSettingManager
import org.koin.dsl.module


internal val languageSelectedSettingModule = module {
    single<LanguageSelectedSettingHandler> { LanguageSelectedSettingManager() }
}