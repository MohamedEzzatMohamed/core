package com.core.shared.localization_operation.language_setting

interface LanguageSelectedSettingHandler {
    fun setSelectedLanguageStatus()

    fun isSelectedLanguage(): Boolean

    fun clearSelectedLanguage()

}