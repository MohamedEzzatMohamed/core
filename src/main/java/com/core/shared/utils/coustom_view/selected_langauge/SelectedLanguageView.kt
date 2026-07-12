package com.core.shared.utils.coustom_view.selected_langauge

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.core.shared.databinding.LayoutSelectLanguageBinding
import com.core.shared.localization_operation.language_setting.LanguageSelectedSettingHandler
import com.core.shared.localization_operation.local_helper.LocaleHelper
import com.core.shared.localization_operation.local_helper.LocaleHelperHandler
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class SelectedLanguageView(context: Context, attributes: AttributeSet? = null) :
    FrameLayout(context, attributes), KoinComponent {

    private val binding by lazy {
        LayoutSelectLanguageBinding.inflate(LayoutInflater.from(context), this, true)
    }

    private val localeHelperHandler: LocaleHelperHandler by inject()

    private val languageSelectedSettingHandler: LanguageSelectedSettingHandler by inject()


    init {
        setOnSelectEnglishLanguageClicked()
        setOnSelectArabicLanguageClicked()
    }

    private fun setOnSelectEnglishLanguageClicked() = binding.englishLLC.setOnClickListener {
        handleLangeSelectListener(LocaleHelper.SupportedLanguage.ENGLISH)
    }

    private fun setOnSelectArabicLanguageClicked() = binding.arabicLLC.setOnClickListener {
        handleLangeSelectListener(LocaleHelper.SupportedLanguage.ARABIC)
    }

    private fun handleLangeSelectListener(language: LocaleHelper.SupportedLanguage) {
        (context as? Activity)?.let {
            localeHelperHandler.setLocale(it, language)
            languageSelectedSettingHandler.setSelectedLanguageStatus()
            handleApplicationRestart()
        }
    }

    private fun handleApplicationRestart() {
        (context as? Activity)?.apply {
            finish()
            startActivity(intent)
        }
    }
}