package com.core.shared.utils.coustom_view.selected_langauge;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/core/shared/utils/coustom_view/selected_langauge/SelectedLanguageView;", "Landroid/widget/FrameLayout;", "Lorg/koin/core/component/KoinComponent;", "context", "Landroid/content/Context;", "attributes", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/core/shared/databinding/LayoutSelectLanguageBinding;", "getBinding", "()Lcom/core/shared/databinding/LayoutSelectLanguageBinding;", "binding$delegate", "Lkotlin/Lazy;", "languageSelectedSettingHandler", "Lcom/core/shared/localization_operation/language_setting/LanguageSelectedSettingHandler;", "getLanguageSelectedSettingHandler", "()Lcom/core/shared/localization_operation/language_setting/LanguageSelectedSettingHandler;", "languageSelectedSettingHandler$delegate", "localeHelperHandler", "Lcom/core/shared/localization_operation/local_helper/LocaleHelperHandler;", "getLocaleHelperHandler", "()Lcom/core/shared/localization_operation/local_helper/LocaleHelperHandler;", "localeHelperHandler$delegate", "handleApplicationRestart", "", "handleLangeSelectListener", "language", "Lcom/core/shared/localization_operation/local_helper/LocaleHelper$SupportedLanguage;", "setOnSelectArabicLanguageClicked", "setOnSelectEnglishLanguageClicked", "core_liveDebug"})
public final class SelectedLanguageView extends android.widget.FrameLayout implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy localeHelperHandler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy languageSelectedSettingHandler$delegate = null;
    
    public SelectedLanguageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributes) {
        super(null);
    }
    
    private final com.core.shared.databinding.LayoutSelectLanguageBinding getBinding() {
        return null;
    }
    
    private final com.core.shared.localization_operation.local_helper.LocaleHelperHandler getLocaleHelperHandler() {
        return null;
    }
    
    private final com.core.shared.localization_operation.language_setting.LanguageSelectedSettingHandler getLanguageSelectedSettingHandler() {
        return null;
    }
    
    private final void setOnSelectEnglishLanguageClicked() {
    }
    
    private final void setOnSelectArabicLanguageClicked() {
    }
    
    private final void handleLangeSelectListener(com.core.shared.localization_operation.local_helper.LocaleHelper.SupportedLanguage language) {
    }
    
    private final void handleApplicationRestart() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}