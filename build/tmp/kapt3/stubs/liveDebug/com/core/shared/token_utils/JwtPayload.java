package com.core.shared.token_utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\""}, d2 = {"Lcom/core/shared/token_utils/JwtPayload;", "", "academyId", "", "exp", "", "iat", "nbf", "role", "", "uniqueName", "(Ljava/lang/String;JJJLjava/util/List;Ljava/lang/String;)V", "getAcademyId", "()Ljava/lang/String;", "getExp", "()J", "getIat", "getNbf", "getRole", "()Ljava/util/List;", "getUniqueName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core_liveDebug"})
public final class JwtPayload {
    @com.google.gson.annotations.SerializedName(value = "AcademyId")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String academyId = null;
    @com.google.gson.annotations.SerializedName(value = "exp")
    private final long exp = 0L;
    @com.google.gson.annotations.SerializedName(value = "iat")
    private final long iat = 0L;
    @com.google.gson.annotations.SerializedName(value = "nbf")
    private final long nbf = 0L;
    @com.google.gson.annotations.SerializedName(value = "role")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> role = null;
    @com.google.gson.annotations.SerializedName(value = "unique_name")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uniqueName = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shared.token_utils.JwtPayload copy(@org.jetbrains.annotations.NotNull()
    java.lang.String academyId, long exp, long iat, long nbf, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> role, @org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName) {
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
    
    public JwtPayload(@org.jetbrains.annotations.NotNull()
    java.lang.String academyId, long exp, long iat, long nbf, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> role, @org.jetbrains.annotations.NotNull()
    java.lang.String uniqueName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAcademyId() {
        return null;
    }
    
    public final long getExp() {
        return 0L;
    }
    
    public final long getIat() {
        return 0L;
    }
    
    public final long getNbf() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueName() {
        return null;
    }
}