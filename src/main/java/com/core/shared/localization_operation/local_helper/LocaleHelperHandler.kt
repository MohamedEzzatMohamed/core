package com.core.shared.localization_operation.local_helper

import android.app.Activity
import android.app.Application
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.Locale

interface LocaleHelperHandler {

    fun init(@ApplicationContext application: Application)

    fun setLocale(context: Activity, language: LocaleHelper.SupportedLanguage)

    fun getLocale(): Locale

    fun isEnglishSelected(): Boolean

    fun <T> getLocalizedValue(enValue: T, localeValue: T) : T

}