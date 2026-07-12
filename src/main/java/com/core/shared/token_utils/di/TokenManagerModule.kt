package com.core.shared.token_utils.di

import com.core.shared.token_utils.TokenHandler
import com.core.shared.token_utils.TokensManager
import org.koin.dsl.module

val tokenManagerModule = module {
    single<TokenHandler> { TokensManager() }
}