package com.core.shared.user_manager.di

import com.core.shared.user_manager.UserManagerHandler
import com.core.shared.user_manager.UserManagerManager
import org.koin.dsl.module


internal val userManagerModule = module {
    single<UserManagerHandler> { UserManagerManager() }
}