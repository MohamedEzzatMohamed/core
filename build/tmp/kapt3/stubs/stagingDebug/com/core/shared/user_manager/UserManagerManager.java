package com.core.shared.user_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J#\u0010\f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0012\u001a\u0002H\rH\u0016\u00a2\u0006\u0002\u0010\u0013R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/core/shared/user_manager/UserManagerManager;", "Lcom/core/shared/user_manager/UserManagerHandler;", "Lorg/koin/core/component/KoinComponent;", "()V", "sharedPreference", "Lcom/core/shared/storage_manager/StorageManager;", "getSharedPreference", "()Lcom/core/shared/storage_manager/StorageManager;", "sharedPreference$delegate", "Lkotlin/Lazy;", "clearUserDate", "", "getUserData", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "saveUserData", "loginUserModel", "(Ljava/lang/Object;)V", "core_stagingDebug"})
public final class UserManagerManager implements com.core.shared.user_manager.UserManagerHandler, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedPreference$delegate = null;
    
    public UserManagerManager() {
        super();
    }
    
    private final com.core.shared.storage_manager.StorageManager getSharedPreference() {
        return null;
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void saveUserData(T loginUserModel) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public <T extends java.lang.Object>T getUserData(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type) {
        return null;
    }
    
    @java.lang.Override()
    public void clearUserDate() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}