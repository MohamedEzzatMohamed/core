package com.core.shared.country_setting_manager

import com.core.shared.storage_manager.SHARED_PREFERENCE
import com.core.shared.storage_manager.StorageManager
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named

private const val COUNTRY_SELECTED = "COUNTRY_SELECTED"
private const val COUNTRY_DATA = "COUNTRY_DATA"

class CountrySettingManager : CountrySettingHandler, KoinComponent {

    private val sharedPreference: StorageManager by inject(named(SHARED_PREFERENCE))

    override fun setSelectedCountry(isCountrySelected: Boolean) =
        sharedPreference.setBoolean(COUNTRY_SELECTED, isCountrySelected)

    override fun isSelectedCountry() =
        sharedPreference.getBoolean(COUNTRY_SELECTED, defaultValue = false)

    override fun <T> setSelectedCountryData(countryData: T) =
        sharedPreference.setObject(COUNTRY_DATA, countryData)

    override fun <T> getSelectedCountryData(type: Class<T>) =
        sharedPreference.getObject(COUNTRY_DATA, type)

    override fun clearSelectedCountry() = sharedPreference.remove(COUNTRY_SELECTED)

    override fun clearSelectedCountryData() = sharedPreference.remove(COUNTRY_DATA)

}