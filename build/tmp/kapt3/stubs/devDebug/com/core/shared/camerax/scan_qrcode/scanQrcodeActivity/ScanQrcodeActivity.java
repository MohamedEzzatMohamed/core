package com.core.shared.camerax.scan_qrcode.scanQrcodeActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/core/shared/camerax/scan_qrcode/scanQrcodeActivity/ScanQrcodeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/core/shared/camerax/scan_qrcode/scanQrcodeActivity/QrScannerHandler;", "()V", "binding", "Lcom/core/shared/databinding/ActivityScanQrcodeBinding;", "getBinding", "()Lcom/core/shared/databinding/ActivityScanQrcodeBinding;", "setBinding", "(Lcom/core/shared/databinding/ActivityScanQrcodeBinding;)V", "hideSystemBars", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onQrCodeScanned", "qrCodeResult", "", "onWindowFocusChanged", "hasFocus", "", "core_devDebug"})
public final class ScanQrcodeActivity extends androidx.appcompat.app.AppCompatActivity implements com.core.shared.camerax.scan_qrcode.scanQrcodeActivity.QrScannerHandler {
    public com.core.shared.databinding.ActivityScanQrcodeBinding binding;
    
    public ScanQrcodeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.databinding.ActivityScanQrcodeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.core.shared.databinding.ActivityScanQrcodeBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideSystemBars() {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    @java.lang.Override()
    public void onQrCodeScanned(@org.jetbrains.annotations.NotNull()
    java.lang.String qrCodeResult) {
    }
}