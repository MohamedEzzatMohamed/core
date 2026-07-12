package com.core.shared.localization_operation.local_helper.di.app_module

import com.core.shared.localization_operation.local_helper.LocaleHelper
import com.core.shared.localization_operation.local_helper.LocaleHelperHandler
import org.koin.dsl.module

internal val localHelperModule = module {
    single<LocaleHelperHandler> { LocaleHelper() }
}