package com.core.shared.camerax;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010$\u001a\u0014 !*\t\u0018\u00010%\u00a2\u0006\u0002\b&0%\u00a2\u0006\u0002\b&H\u0002J\b\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0002J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H&\u00a2\u0006\u0002\u0010.J)\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020004\u00a2\u0006\u0002\b5H\u0016J\u0010\u00106\u001a\u0002002\u0006\u00107\u001a\u00020\u0016H\u0002J\b\u00108\u001a\u000200H\u0016J$\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u000200H\u0016J\u0010\u0010A\u001a\u0002002\u0006\u00107\u001a\u00020\u0016H\u0002J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020DH\u0002J\u000f\u0010E\u001a\u0004\u0018\u000100H\u0002\u00a2\u0006\u0002\u0010FJ\u0016\u0010G\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001fH\u0002J\b\u0010H\u001a\u000200H\u0002J\b\u0010I\u001a\u000200H\u0002J\b\u0010J\u001a\u000200H\u0002J\b\u0010K\u001a\u000200H\u0002R\u0012\u0010\u0006\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u0004\u0018\u00010\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014\u00a8\u0006L"}, d2 = {"Lcom/core/shared/camerax/BaseCameraFragment;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "Lcom/core/shared/error/SmartZoneErrorHandler;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "cameraLens", "", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getCameraProvider", "()Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraProvider$delegate", "Lkotlin/Lazy;", "flashView", "Landroid/view/View;", "getFlashView", "()Landroid/view/View;", "isTorchOn", "", "previewView", "getPreviewView", "processCameraProvider", "Lcom/google/common/util/concurrent/ListenableFuture;", "getProcessCameraProvider", "()Lcom/google/common/util/concurrent/ListenableFuture;", "processCameraProvider$delegate", "requestPermission", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "switchCameraIv", "getSwitchCameraIv", "buildCameraSelector", "Landroidx/camera/core/CameraSelector;", "Lorg/jspecify/annotations/NonNull;", "buildPreviewUseCase", "Landroidx/camera/core/Preview;", "getCameraPermissionError", "Lcom/core/shared/error/SmartZoneError$W;", "getUseCase", "", "Landroidx/camera/core/UseCase;", "()[Landroidx/camera/core/UseCase;", "handleError", "", "error", "Lcom/core/shared/error/SmartZoneError;", "callback", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "handleFlashIvVisibility", "isBackCamera", "handleTakePictureButton", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setBackCameraLens", "setOnFlashViewClicked", "camera", "Landroidx/camera/core/Camera;", "setOnSwitchCameraIvClicked", "()Lkotlin/Unit;", "setRequestPermission", "setUpCameraConfiguration", "showCameraNotEnabledPopUp", "showImageCaptureErrorPopUp", "startCamera", "core_devDebug"})
public abstract class BaseCameraFragment<dataBinding extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment implements com.core.shared.error.SmartZoneErrorHandler {
    @org.jetbrains.annotations.Nullable()
    private final android.view.View flashView = null;
    @org.jetbrains.annotations.Nullable()
    private final android.view.View switchCameraIv = null;
    private boolean isTorchOn = false;
    private int cameraLens = androidx.camera.core.CameraSelector.LENS_FACING_BACK;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy processCameraProvider$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermission = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cameraProvider$delegate = null;
    
    public BaseCameraFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract dataBinding getBinding();
    
    @org.jetbrains.annotations.Nullable()
    public android.view.View getFlashView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.view.View getSwitchCameraIv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getPreviewView();
    
    private final com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> getProcessCameraProvider() {
        return null;
    }
    
    private final androidx.camera.lifecycle.ProcessCameraProvider getCameraProvider() {
        return null;
    }
    
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> setRequestPermission() {
        return null;
    }
    
    private final void startCamera() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void handleError(@org.jetbrains.annotations.NotNull()
    com.core.shared.error.SmartZoneError error, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.core.shared.error.SmartZoneError, kotlin.Unit> callback) {
    }
    
    private final void showCameraNotEnabledPopUp() {
    }
    
    private final void showImageCaptureErrorPopUp() {
    }
    
    private final com.core.shared.error.SmartZoneError.W getCameraPermissionError() {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final androidx.camera.core.CameraSelector buildCameraSelector() {
        return null;
    }
    
    private final kotlin.Unit setOnSwitchCameraIvClicked() {
        return null;
    }
    
    private final androidx.camera.core.Preview buildPreviewUseCase() {
        return null;
    }
    
    private final void setOnFlashViewClicked(androidx.camera.core.Camera camera) {
    }
    
    private final void handleFlashIvVisibility(boolean isBackCamera) {
    }
    
    private final void setBackCameraLens(boolean isBackCamera) {
    }
    
    private final void setUpCameraConfiguration() {
    }
    
    public void handleTakePictureButton() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.camera.core.UseCase[] getUseCase();
}