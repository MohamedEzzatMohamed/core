package com.core.shared.localization_operation.language_setting


import com.core.shared.storage_manager.SHARED_PREFERENCE
import com.core.shared.storage_manager.StorageManager
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named

private const val SELECTED_LANGUAGE_STORAGE_KEY = "Selected language"
private const val LANGUAGE_SELECTED = "LANGUAGE_SELECTED"
class LanguageSelectedSettingManager : LanguageSelectedSettingHandler, KoinComponent {

    private val storageManager: StorageManager by inject(named(SHARED_PREFERENCE))

    override fun setSelectedLanguageStatus() {
        val selectedLocale = storageManager.getString(SELECTED_LANGUAGE_STORAGE_KEY)
        storageManager.setBoolean(LANGUAGE_SELECTED, selectedLocale != null)
    }

    override fun isSelectedLanguage() = storageManager.getBoolean(LANGUAGE_SELECTED, false)

    override fun clearSelectedLanguage() = storageManager.remove(LANGUAGE_SELECTED)

}