package com.core.shared.features.country_code_fragment.di

import com.core.shared.features.country_code_fragment.domain.viewmodel.ShowCountryCodeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val showCountryCodeViewModelModule = module {
    viewModel { ShowCountryCodeViewModel() }
}