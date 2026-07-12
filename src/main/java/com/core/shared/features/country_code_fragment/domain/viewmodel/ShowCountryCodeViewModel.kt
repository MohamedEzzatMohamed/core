package com.core.shared.features.country_code_fragment.domain.viewmodel

import androidx.lifecycle.ViewModel
import com.core.shared.R
import com.core.shared.features.country_code_fragment.domain.enum.CountryCode
import com.core.shared.features.country_code_fragment.domain.model.CountryCodeEntity
import org.koin.core.component.KoinComponent

class ShowCountryCodeViewModel : ViewModel(), KoinComponent {

    private val egypt =
        CountryCodeEntity(R.drawable.ic_vector_egypt, R.string.countryOfEgypt, CountryCode.EGYPT)
    private val saudiArabia = CountryCodeEntity(
        R.drawable.ic_vector_saudi_arabia_flag, R.string.countryOfSaudiArabia, CountryCode.KSA
    )

    fun getCountryCodeList() = mutableListOf(egypt, saudiArabia)
}