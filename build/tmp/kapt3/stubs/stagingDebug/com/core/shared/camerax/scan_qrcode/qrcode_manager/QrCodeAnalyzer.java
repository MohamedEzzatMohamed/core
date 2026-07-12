package com.core.shared.camerax.scan_qrcode.qrcode_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/core/shared/camerax/scan_qrcode/qrcode_manager/QrCodeAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "onQrCodesDetected", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "qrCode", "", "(Lkotlin/jvm/functions/Function1;)V", "analyze", "imageProxy", "Landroidx/camera/core/ImageProxy;", "getBarcodeScannerOptions", "Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;", "handleAnalyzeImage", "core_stagingDebug"})
@androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalGetImage.class})
public final class QrCodeAnalyzer implements androidx.camera.core.ImageAnalysis.Analyzer {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onQrCodesDetected = null;
    
    public QrCodeAnalyzer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onQrCodesDetected) {
        super();
    }
    
    @java.lang.Override()
    public void analyze(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageProxy imageProxy) {
    }
    
    private final void handleAnalyzeImage(androidx.camera.core.ImageProxy imageProxy) {
    }
    
    private final com.google.mlkit.vision.barcode.BarcodeScannerOptions getBarcodeScannerOptions() {
        return null;
    }
}