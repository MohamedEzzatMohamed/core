package com.core.shared.user_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J#\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H&\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u0002H\u0005H&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/core/shared/user_manager/UserManagerHandler;", "", "clearUserDate", "", "getUserData", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "saveUserData", "loginUserModel", "(Ljava/lang/Object;)V", "core_liveRelease"})
public abstract interface UserManagerHandler {
    
    public abstract <T extends java.lang.Object>void saveUserData(T loginUserModel);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T getUserData(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type);
    
    public abstract void clearUserDate();
}