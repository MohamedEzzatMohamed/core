package com.core.shared.localization_operation.local_helper

import android.app.Activity
import android.app.Application
import android.content.res.Resources
import androidx.core.os.ConfigurationCompat
import com.core.shared.storage_manager.SHARED_PREFERENCE
import com.core.shared.storage_manager.StorageManager
import com.yariksoffice.lingver.Lingver
import dagger.hilt.android.qualifiers.ApplicationContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named
import java.util.Locale


private const val SELECTED_LANGUAGE_STORAGE_KEY = "Selected language"


class LocaleHelper : LocaleHelperHandler, KoinComponent {

    private val storageManager: StorageManager by inject(named(SHARED_PREFERENCE))

    override fun init(@ApplicationContext application: Application) {
        Lingver.init(application).setLocale(application, getLocale())
    }

    override fun setLocale(context: Activity, language: SupportedLanguage) {
        persist(language)
        Lingver.getInstance().setLocale(context, language.locale)
    }

    private fun persist(language: SupportedLanguage) =
        storageManager.setString(SELECTED_LANGUAGE_STORAGE_KEY, language.locale.language)

    override fun getLocale(): Locale {
        val selectedLocale = storageManager.getString(SELECTED_LANGUAGE_STORAGE_KEY)
        if (selectedLocale != null) return Locale(selectedLocale)
        return SupportedLanguage.ARABIC.locale
//        val deviceLange = ConfigurationCompat.getLocales(Resources.getSystem().configuration).get(0)
//        return SupportedLanguage.entries.find {
//            it.locale.language.equals(deviceLange?.language, true)
//        }?.locale ?: SupportedLanguage.ARABIC.locale
    }

    override fun isEnglishSelected() = getLocale() == SupportedLanguage.ENGLISH.locale


    override fun <T> getLocalizedValue(enValue: T, localeValue: T) = when {
        isEnglishSelected() -> enValue
        else -> localeValue
    }


    enum class SupportedLanguage(val locale: Locale) { ENGLISH(Locale("en")), ARABIC(Locale("ar")) }
}