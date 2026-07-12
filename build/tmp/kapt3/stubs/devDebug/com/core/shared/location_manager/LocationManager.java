package com.core.shared.location_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0016\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/core/shared/location_manager/LocationManager;", "Lcom/core/shared/location_manager/LocationHandler;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getAppCompatActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "lastLocation", "Landroidx/lifecycle/MutableLiveData;", "Landroid/location/Location;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "getLastLocation", "", "location", "Lkotlin/Function1;", "getLocationCallback", "handleReceiverCallbackRegistration", "setLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "startLocationUpdates", "stopLocationUpdates", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "core_devDebug"})
public final class LocationManager implements com.core.shared.location_manager.LocationHandler {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private com.google.android.gms.location.LocationCallback locationCallback;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<android.location.Location> lastLocation;
    
    public LocationManager(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    private final androidx.appcompat.app.AppCompatActivity getAppCompatActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void getLastLocation(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit> location) {
    }
    
    private final void handleReceiverCallbackRegistration() {
    }
    
    private final com.google.android.gms.location.LocationCallback getLocationCallback() {
        return null;
    }
    
    private final void startLocationUpdates() {
    }
    
    private final com.google.android.gms.location.LocationRequest setLocationRequest() {
        return null;
    }
    
    private final com.google.android.gms.tasks.Task<java.lang.Void> stopLocationUpdates() {
        return null;
    }
}