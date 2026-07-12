package com.core.shared.camerax.scan_qrcode.qrcode_fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0017\u001a\u0014 \u0019*\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u00180\u000f\u00a2\u0006\u0002\b\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002R\u001b\u0010\u0005\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\r\u00a8\u0006&"}, d2 = {"Lcom/core/shared/camerax/scan_qrcode/qrcode_fragment/ScanQrCodeFragment;", "Lcom/core/shared/camerax/BaseCameraFragment;", "Lcom/core/shared/databinding/FragmentScanQrCodeBinding;", "Lcom/core/shared/error/SmartZoneErrorHandler;", "()V", "binding", "getBinding", "()Lcom/core/shared/databinding/FragmentScanQrCodeBinding;", "binding$delegate", "Lkotlin/Lazy;", "flashView", "Landroid/view/View;", "getFlashView", "()Landroid/view/View;", "imageAnalysisUseCase", "Landroidx/camera/core/ImageAnalysis;", "getImageAnalysisUseCase", "()Landroidx/camera/core/ImageAnalysis;", "imageAnalysisUseCase$delegate", "previewView", "getPreviewView", "switchCameraIv", "getSwitchCameraIv", "getImageAnalysis", "Lorg/jspecify/annotations/NonNull;", "kotlin.jvm.PlatformType", "getQrCodeImageAnalysisUseCase", "getQrCodeImageAnalyzer", "Lcom/core/shared/camerax/scan_qrcode/qrcode_manager/QrCodeAnalyzer;", "getUseCase", "", "Landroidx/camera/core/UseCase;", "()[Landroidx/camera/core/UseCase;", "handleQrCodeResult", "", "qrResult", "", "setFragmentResult", "core_liveRelease"})
public final class ScanQrCodeFragment extends com.core.shared.camerax.BaseCameraFragment<com.core.shared.databinding.FragmentScanQrCodeBinding> implements com.core.shared.error.SmartZoneErrorHandler {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy imageAnalysisUseCase$delegate = null;
    
    public ScanQrCodeFragment() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.databinding.FragmentScanQrCodeBinding getBinding() {
        return null;
    }
    
    private final androidx.camera.core.ImageAnalysis getImageAnalysisUseCase() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View getPreviewView() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View getFlashView() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View getSwitchCameraIv() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.camera.core.UseCase[] getUseCase() {
        return null;
    }
    
    private final androidx.camera.core.ImageAnalysis getQrCodeImageAnalysisUseCase() {
        return null;
    }
    
    private final androidx.camera.core.ImageAnalysis getImageAnalysis() {
        return null;
    }
    
    private final com.core.shared.camerax.scan_qrcode.qrcode_manager.QrCodeAnalyzer getQrCodeImageAnalyzer() {
        return null;
    }
    
    private final void handleQrCodeResult(java.lang.String qrResult) {
    }
    
    private final void setFragmentResult(java.lang.String qrResult) {
    }
}