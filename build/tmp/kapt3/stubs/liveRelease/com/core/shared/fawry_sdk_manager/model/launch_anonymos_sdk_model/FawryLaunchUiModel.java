package com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010/\u001a\u00020\u000fH\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J{\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u00c6\u0001J\u0013\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\u0006\u00107\u001a\u000208J\t\u00109\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016\u00a8\u0006:"}, d2 = {"Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/FawryLaunchUiModel;", "", "launchCustomerUiModel", "Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/LaunchCustomerUiModel;", "launchMerchantUiModel", "Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/LaunchMerchantUiModel;", "allow3DPayment", "", "chargeItems", "Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/BillItemsUiModel;", "shippingAddress", "Lcom/fawry/fawrypay/models/ShippingAddress;", "branchCode", "", "scheduledTime", "Ljava/util/Date;", "skipReceipt", "skipLogin", "signatureSha256", "payWithCardToken", "(Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/LaunchCustomerUiModel;Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/LaunchMerchantUiModel;ZLcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/BillItemsUiModel;Lcom/fawry/fawrypay/models/ShippingAddress;Ljava/lang/String;Ljava/util/Date;ZZLjava/lang/String;Z)V", "getAllow3DPayment", "()Z", "getBranchCode", "()Ljava/lang/String;", "getChargeItems", "()Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/BillItemsUiModel;", "getLaunchCustomerUiModel", "()Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/LaunchCustomerUiModel;", "getLaunchMerchantUiModel", "()Lcom/core/shared/fawry_sdk_manager/model/launch_anonymos_sdk_model/LaunchMerchantUiModel;", "getPayWithCardToken", "getScheduledTime", "()Ljava/util/Date;", "getShippingAddress", "()Lcom/fawry/fawrypay/models/ShippingAddress;", "getSignatureSha256", "getSkipLogin", "getSkipReceipt", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toFawryLaunchModel", "Lcom/fawry/fawrypay/models/FawryLaunchModel;", "toString", "core_liveRelease"})
public final class FawryLaunchUiModel {
    @org.jetbrains.annotations.NotNull()
    private final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchCustomerUiModel launchCustomerUiModel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchMerchantUiModel launchMerchantUiModel = null;
    private final boolean allow3DPayment = false;
    @org.jetbrains.annotations.NotNull()
    private final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.BillItemsUiModel chargeItems = null;
    @org.jetbrains.annotations.Nullable()
    private final com.fawry.fawrypay.models.ShippingAddress shippingAddress = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String branchCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date scheduledTime = null;
    private final boolean skipReceipt = false;
    private final boolean skipLogin = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String signatureSha256 = null;
    private final boolean payWithCardToken = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchCustomerUiModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final boolean component11() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchMerchantUiModel component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.BillItemsUiModel component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fawry.fawrypay.models.ShippingAddress component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.FawryLaunchUiModel copy(@org.jetbrains.annotations.NotNull()
    com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchCustomerUiModel launchCustomerUiModel, @org.jetbrains.annotations.NotNull()
    com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchMerchantUiModel launchMerchantUiModel, boolean allow3DPayment, @org.jetbrains.annotations.NotNull()
    com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.BillItemsUiModel chargeItems, @org.jetbrains.annotations.Nullable()
    com.fawry.fawrypay.models.ShippingAddress shippingAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String branchCode, @org.jetbrains.annotations.NotNull()
    java.util.Date scheduledTime, boolean skipReceipt, boolean skipLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String signatureSha256, boolean payWithCardToken) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public FawryLaunchUiModel(@org.jetbrains.annotations.NotNull()
    com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchCustomerUiModel launchCustomerUiModel, @org.jetbrains.annotations.NotNull()
    com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchMerchantUiModel launchMerchantUiModel, boolean allow3DPayment, @org.jetbrains.annotations.NotNull()
    com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.BillItemsUiModel chargeItems, @org.jetbrains.annotations.Nullable()
    com.fawry.fawrypay.models.ShippingAddress shippingAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String branchCode, @org.jetbrains.annotations.NotNull()
    java.util.Date scheduledTime, boolean skipReceipt, boolean skipLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String signatureSha256, boolean payWithCardToken) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchCustomerUiModel getLaunchCustomerUiModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.LaunchMerchantUiModel getLaunchMerchantUiModel() {
        return null;
    }
    
    public final boolean getAllow3DPayment() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model.BillItemsUiModel getChargeItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fawry.fawrypay.models.ShippingAddress getShippingAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBranchCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getScheduledTime() {
        return null;
    }
    
    public final boolean getSkipReceipt() {
        return false;
    }
    
    public final boolean getSkipLogin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSignatureSha256() {
        return null;
    }
    
    public final boolean getPayWithCardToken() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fawry.fawrypay.models.FawryLaunchModel toFawryLaunchModel() {
        return null;
    }
}