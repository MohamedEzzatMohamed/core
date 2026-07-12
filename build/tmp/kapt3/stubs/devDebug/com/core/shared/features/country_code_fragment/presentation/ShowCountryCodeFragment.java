package com.core.shared.features.country_code_fragment.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\f\u0010#\u001a\u00020\u001e*\u00020\u0002H\u0002J\f\u0010$\u001a\u00020\u001e*\u00020\u0002H\u0002J\f\u0010%\u001a\u00020\u001e*\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006&"}, d2 = {"Lcom/core/shared/features/country_code_fragment/presentation/ShowCountryCodeFragment;", "Lcom/core/shared/base_fragment/BaseFragment;", "Lcom/core/shared/databinding/FragmentShowingCountryCodeBinding;", "()V", "countriesCodeAdapter", "Lcom/core/shared/features/country_code_fragment/adapter/CountriesCodeAdapter;", "isSelectedStudentStudentCountryCode", "", "()Ljava/lang/String;", "listOfCountryCode", "", "Lcom/core/shared/features/country_code_fragment/domain/model/CountryCodeEntity;", "getListOfCountryCode", "()Ljava/util/List;", "selectedStudentCountryCode", "", "getSelectedStudentCountryCode", "()Z", "viewModel", "Lcom/core/shared/features/country_code_fragment/domain/viewmodel/ShowCountryCodeViewModel;", "getViewModel", "()Lcom/core/shared/features/country_code_fragment/domain/viewmodel/ShowCountryCodeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setCountryCodeAdapter", "setOnBackClickedClicked", "setUpView", "core_devDebug"})
public final class ShowCountryCodeFragment extends com.core.shared.base_fragment.BaseFragment<com.core.shared.databinding.FragmentShowingCountryCodeBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.core.shared.features.country_code_fragment.adapter.CountriesCodeAdapter countriesCodeAdapter;
    
    public ShowCountryCodeFragment() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.databinding.FragmentShowingCountryCodeBinding onCreateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    private final com.core.shared.features.country_code_fragment.domain.viewmodel.ShowCountryCodeViewModel getViewModel() {
        return null;
    }
    
    private final java.util.List<com.core.shared.features.country_code_fragment.domain.model.CountryCodeEntity> getListOfCountryCode() {
        return null;
    }
    
    private final boolean getSelectedStudentCountryCode() {
        return false;
    }
    
    private final java.lang.String isSelectedStudentStudentCountryCode() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpView(com.core.shared.databinding.FragmentShowingCountryCodeBinding $this$setUpView) {
    }
    
    private final void setOnBackClickedClicked(com.core.shared.databinding.FragmentShowingCountryCodeBinding $this$setOnBackClickedClicked) {
    }
    
    private final void setCountryCodeAdapter(com.core.shared.databinding.FragmentShowingCountryCodeBinding $this$setCountryCodeAdapter) {
    }
}