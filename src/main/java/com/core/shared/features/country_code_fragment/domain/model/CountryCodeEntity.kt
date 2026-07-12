package com.core.shared.features.country_code_fragment.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.core.shared.features.country_code_fragment.domain.enum.CountryCode

data class CountryCodeEntity(
    @DrawableRes val imagePath : Int,
    @StringRes val countryName: Int,
    val countryCode: CountryCode
)
