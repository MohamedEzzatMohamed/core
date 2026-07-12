package com.core.shared.utils.dialogs.smart_zone_dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010*\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00052\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,\"\u00020-\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\bJ\b\u00101\u001a\u000202H\u0016J>\u00103\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u00104\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00142\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0010\u00105\u001a\u00020\u00002\b\b\u0001\u00106\u001a\u00020\u0005J\u0010\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0005H\u0016J\u0012\u00109\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010#H\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0005H\u0016J\'\u0010;\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00052\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,\"\u00020-\u00a2\u0006\u0002\u0010.J\u001c\u0010=\u001a\u00020\u00012\b\u0010>\u001a\u0004\u0018\u00010#2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001c\u0010A\u001a\u00020\u00012\b\u0010>\u001a\u0004\u0018\u00010#2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010B\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010\u001cH\u0016J\u001c\u0010C\u001a\u00020\u00012\b\u0010>\u001a\u0004\u0018\u00010#2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0005H\u0016J\'\u0010F\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00052\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,\"\u00020-\u00a2\u0006\u0002\u0010.J<\u0010G\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00052\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u00104\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00142\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0014\u0010I\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010J\u001a\u00020KH\u0002J\u0014\u0010L\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010J\u001a\u00020KH\u0002J\u0014\u0010M\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0014\u0010N\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010 \u001a\u00020#H\u0002J\u0014\u0010O\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0002J\u0014\u0010P\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010$\u001a\u00020!H\u0002J\u0016\u00105\u001a\u00020\u0012*\u00020\u000b2\b\b\u0001\u00106\u001a\u00020\u0005H\u0002J\u0014\u0010Q\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010J\u001a\u00020KH\u0002J\u0014\u0010R\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010J\u001a\u00020KH\u0002J\u0014\u0010S\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010J\u001a\u00020KH\u0002R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\'\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015\u00a8\u0006T"}, d2 = {"Lcom/core/shared/utils/dialogs/smart_zone_dialog/SmartZoneDialogBuilder;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "activity", "Landroid/app/Activity;", "style", "", "(Landroid/app/Activity;I)V", "autoDismissDurationMs", "", "Ljava/lang/Long;", "binding", "Lcom/core/shared/databinding/LayoutSmartzoneDialogBinding;", "getBinding", "()Lcom/core/shared/databinding/LayoutSmartzoneDialogBinding;", "setBinding", "(Lcom/core/shared/databinding/LayoutSmartzoneDialogBinding;)V", "bottomButtonAction", "Lkotlin/Function0;", "", "bottomButtonActionDismiss", "", "Ljava/lang/Boolean;", "bottomButtonStyle", "Lcom/core/shared/utils/dialogs/smart_zone_dialog/SmartZoneButtonStyle;", "bottomButtonText", "", "bottomButtonVisibility", "externalDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "icon", "Ljava/lang/Integer;", "isGifIcon", "message", "Landroid/text/Spanned;", "messageInfo", "", "title", "topButtonAction", "topButtonActionDismiss", "topButtonStyle", "topButtonText", "topButtonVisibility", "addHtmlMessage", "values", "", "", "(I[Ljava/lang/Object;)Lcom/core/shared/utils/dialogs/smart_zone_dialog/SmartZoneDialogBuilder;", "autoDismissAfter", "durationMs", "create", "Landroidx/appcompat/app/AlertDialog;", "setBottomButton", "dialogDismiss", "setGifIcon", "gifRes", "setIcon", "iconId", "setMessage", "messageId", "setMessageStringFormat", "value", "setNegativeButton", "text", "listener", "Landroid/content/DialogInterface$OnClickListener;", "setNeutralButton", "setOnDismissListener", "setPositiveButton", "setTitle", "titleId", "setTitleStringFormat", "setTopButton", "topButton", "handleBottomButton", "dialog", "Landroid/app/Dialog;", "handleTopButton", "initializeIcon", "initializeMessageInfoText", "initializeMessageText", "initializeTitleText", "setOnBottomButtonClicked", "setOnTopButtonClicked", "setUpViews", "core_liveRelease"})
public final class SmartZoneDialogBuilder extends com.google.android.material.dialog.MaterialAlertDialogBuilder {
    public com.core.shared.databinding.LayoutSmartzoneDialogBinding binding;
    @org.jetbrains.annotations.Nullable()
    private android.text.Spanned title;
    @org.jetbrains.annotations.Nullable()
    private android.text.Spanned message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence messageInfo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer icon;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String topButtonText;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bottomButtonText;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> topButtonAction;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> bottomButtonAction;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean topButtonVisibility;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean bottomButtonVisibility;
    @org.jetbrains.annotations.Nullable()
    private com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneButtonStyle topButtonStyle;
    @org.jetbrains.annotations.Nullable()
    private com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneButtonStyle bottomButtonStyle;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean topButtonActionDismiss;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean bottomButtonActionDismiss;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long autoDismissDurationMs;
    private boolean isGifIcon = false;
    @org.jetbrains.annotations.Nullable()
    private android.content.DialogInterface.OnDismissListener externalDismissListener;
    
    public SmartZoneDialogBuilder(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @androidx.annotation.StyleRes()
    int style) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.databinding.LayoutSmartzoneDialogBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.core.shared.databinding.LayoutSmartzoneDialogBinding p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.app.AlertDialog create() {
        return null;
    }
    
    private final void setUpViews(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$setUpViews, android.app.Dialog dialog) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder addHtmlMessage(int message, @org.jetbrains.annotations.NotNull()
    java.lang.Object... values) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setTitleStringFormat(int title, @org.jetbrains.annotations.NotNull()
    java.lang.Object... values) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setMessageStringFormat(int message, @org.jetbrains.annotations.NotNull()
    java.lang.Object... value) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setTitle(int titleId) {
        return null;
    }
    
    private final void initializeTitleText(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$initializeTitleText, android.text.Spanned title) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setMessage(int messageId) {
        return null;
    }
    
    private final void initializeMessageText(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$initializeMessageText, android.text.Spanned message) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence message) {
        return null;
    }
    
    private final void initializeMessageInfoText(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$initializeMessageInfoText, java.lang.CharSequence message) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setIcon(int iconId) {
        return null;
    }
    
    private final void initializeIcon(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$initializeIcon, int icon) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setPositiveButton(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnClickListener listener) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNegativeButton(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnClickListener listener) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNeutralButton(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnClickListener listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder autoDismissAfter(long durationMs) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setOnDismissListener(@org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener listener) {
        return null;
    }
    
    private final void setGifIcon(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$setGifIcon, @androidx.annotation.DrawableRes()
    int gifRes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setGifIcon(@androidx.annotation.DrawableRes()
    int gifRes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setTopButton(int topButtonText, @org.jetbrains.annotations.Nullable()
    com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneButtonStyle topButtonStyle, boolean dialogDismiss, boolean topButtonVisibility, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> topButton) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder setBottomButton(int bottomButtonText, @org.jetbrains.annotations.Nullable()
    com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneButtonStyle bottomButtonStyle, boolean dialogDismiss, boolean bottomButtonVisibility, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> bottomButtonAction) {
        return null;
    }
    
    private final void handleTopButton(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$handleTopButton, android.app.Dialog dialog) {
    }
    
    private final void setOnTopButtonClicked(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$setOnTopButtonClicked, android.app.Dialog dialog) {
    }
    
    private final void handleBottomButton(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$handleBottomButton, android.app.Dialog dialog) {
    }
    
    private final void setOnBottomButtonClicked(com.core.shared.databinding.LayoutSmartzoneDialogBinding $this$setOnBottomButtonClicked, android.app.Dialog dialog) {
    }
}