package com.core.shared.country_setting_manager

interface CountrySettingHandler {
    fun setSelectedCountry(isCountrySelected: Boolean)

    fun isSelectedCountry(): Boolean

    fun <T> setSelectedCountryData(countryData: T)

    fun <T> getSelectedCountryData(type: Class<T>): T?

    fun clearSelectedCountry()

    fun clearSelectedCountryData()
}