package com.core.shared.utils.fragment_extensions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a(\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\r\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u001aB\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00122\'\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014\u00a2\u0006\u0002\b\u0018\u00a2\u0006\u0002\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"navigate", "", "Landroidx/fragment/app/Fragment;", "directions", "Landroidx/navigation/NavDirections;", "action", "", "bundle", "Landroid/os/Bundle;", "navigateBetweenNavigationGraph", "navGraphId", "startDestId", "navigateUp", "onBackPressed", "Lkotlin/Function0;", "repeatOnLifecycleScope", "Lkotlinx/coroutines/Job;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "core_stagingDebug"})
public final class FragmentExtentionsKt {
    
    public static final void navigate(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$navigate, int action, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    public static final void navigate(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$navigate, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections directions) {
    }
    
    public static final void navigateUp(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$navigateUp) {
    }
    
    public static final void onBackPressed(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$onBackPressed, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.Job repeatOnLifecycleScope(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$repeatOnLifecycleScope, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle.State lifecycle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    public static final void navigateBetweenNavigationGraph(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$navigateBetweenNavigationGraph, @androidx.annotation.IdRes()
    int navGraphId, @androidx.annotation.IdRes()
    int startDestId, @androidx.annotation.IdRes()
    int action) {
    }
}