package com.core.shared.base_repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010\u0016\u001a\u00020\f2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001a\"\u0004\b\u0002\u0010\u001b2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001d\u001a\u00028\u0000H\u0086@\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001d\u001a\u00028\u0000H\u00a6@\u00a2\u0006\u0002\u0010\u001eJ\f\u0010!\u001a\u00020\"*\u00020#H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006$"}, d2 = {"Lcom/core/shared/base_repository/BaseRepository;", "RequestDto", "ResponseDto", "", "()V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "getGeneralApolloHttpError", "Lcom/core/shared/error/SmartZoneError$E;", "getGeneralExceptionError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getIoExceptionError", "Ljava/io/IOException;", "getNotFoundError", "code", "", "getNotSuccessfulResponseError", "response", "Lretrofit2/Response;", "getNotSuccessfulResponseState", "Lcom/core/shared/state/State;", "T", "getOperationState", "requestDto", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnauthorizedError", "performApiCall", "handleApolloHttpException", "Lcom/core/shared/error/SmartZoneError;", "Lcom/apollographql/apollo3/exception/ApolloHttpException;", "core_devDebug"})
public abstract class BaseRepository<RequestDto extends java.lang.Object, ResponseDto extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CoroutineDispatcher dispatcher;
    
    public BaseRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return null;
    }
    
    public final void setDispatcher(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOperationState(RequestDto requestDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.core.shared.state.State<ResponseDto>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object performApiCall(RequestDto requestDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.core.shared.state.State<ResponseDto>> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.core.shared.state.State<T> getNotSuccessfulResponseState(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<?> response) {
        return null;
    }
    
    private final com.core.shared.error.SmartZoneError.E getIoExceptionError(java.io.IOException e) {
        return null;
    }
    
    private final com.core.shared.error.SmartZoneError handleApolloHttpException(com.apollographql.apollo3.exception.ApolloHttpException $this$handleApolloHttpException) {
        return null;
    }
    
    private final com.core.shared.error.SmartZoneError.E getGeneralExceptionError(java.lang.Exception e) {
        return null;
    }
    
    private final com.core.shared.error.SmartZoneError.E getNotSuccessfulResponseError(retrofit2.Response<?> response) {
        return null;
    }
    
    private final com.core.shared.error.SmartZoneError.E getUnauthorizedError(int code) {
        return null;
    }
    
    private final com.core.shared.error.SmartZoneError.E getNotFoundError(int code) {
        return null;
    }
    
    private final com.core.shared.error.SmartZoneError.E getGeneralApolloHttpError() {
        return null;
    }
}