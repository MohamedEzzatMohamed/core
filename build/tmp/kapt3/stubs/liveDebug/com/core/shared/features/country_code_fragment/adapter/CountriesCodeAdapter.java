package com.core.shared.features.country_code_fragment.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/core/shared/features/country_code_fragment/adapter/CountriesCodeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/core/shared/features/country_code_fragment/adapter/CountriesCodeAdapter$ViewHolder;", "countryItem", "", "Lcom/core/shared/features/country_code_fragment/domain/model/CountryCodeEntity;", "onItemClicked", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "core_liveDebug"})
public final class CountriesCodeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.core.shared.features.country_code_fragment.adapter.CountriesCodeAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.core.shared.features.country_code_fragment.domain.model.CountryCodeEntity> countryItem = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onItemClicked = null;
    
    public CountriesCodeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.core.shared.features.country_code_fragment.domain.model.CountryCodeEntity> countryItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClicked) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.core.shared.features.country_code_fragment.adapter.CountriesCodeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.core.shared.features.country_code_fragment.adapter.CountriesCodeAdapter.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/core/shared/features/country_code_fragment/adapter/CountriesCodeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/core/shared/databinding/ItemCountriesCodeBinding;", "(Lcom/core/shared/features/country_code_fragment/adapter/CountriesCodeAdapter;Lcom/core/shared/databinding/ItemCountriesCodeBinding;)V", "bind", "", "item", "Lcom/core/shared/features/country_code_fragment/domain/model/CountryCodeEntity;", "setupViews", "core_liveDebug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.core.shared.databinding.ItemCountriesCodeBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.core.shared.databinding.ItemCountriesCodeBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.core.shared.features.country_code_fragment.domain.model.CountryCodeEntity item) {
        }
        
        private final void setupViews(com.core.shared.databinding.ItemCountriesCodeBinding $this$setupViews, com.core.shared.features.country_code_fragment.domain.model.CountryCodeEntity item) {
        }
    }
}