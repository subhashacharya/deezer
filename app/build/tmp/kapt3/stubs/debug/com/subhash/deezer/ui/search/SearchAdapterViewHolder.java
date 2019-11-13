package com.subhash.deezer.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/subhash/deezer/ui/search/SearchAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "getItemBinding", "()Landroidx/databinding/ViewDataBinding;", "ArtistResultViewHolder", "HeaderItemViewHolder", "Lcom/subhash/deezer/ui/search/SearchAdapterViewHolder$HeaderItemViewHolder;", "Lcom/subhash/deezer/ui/search/SearchAdapterViewHolder$ArtistResultViewHolder;", "app_debug"})
public abstract class SearchAdapterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ViewDataBinding itemBinding = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ViewDataBinding getItemBinding() {
        return null;
    }
    
    private SearchAdapterViewHolder(androidx.databinding.ViewDataBinding itemBinding) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/subhash/deezer/ui/search/SearchAdapterViewHolder$HeaderItemViewHolder;", "Lcom/subhash/deezer/ui/search/SearchAdapterViewHolder;", "binding", "Lcom/subhash/deezer/databinding/SearchResultHeaderViewItemBinding;", "(Lcom/subhash/deezer/databinding/SearchResultHeaderViewItemBinding;)V", "getBinding", "()Lcom/subhash/deezer/databinding/SearchResultHeaderViewItemBinding;", "app_debug"})
    public static final class HeaderItemViewHolder extends com.subhash.deezer.ui.search.SearchAdapterViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.subhash.deezer.databinding.SearchResultHeaderViewItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.subhash.deezer.databinding.SearchResultHeaderViewItemBinding getBinding() {
            return null;
        }
        
        public HeaderItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.subhash.deezer.databinding.SearchResultHeaderViewItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/subhash/deezer/ui/search/SearchAdapterViewHolder$ArtistResultViewHolder;", "Lcom/subhash/deezer/ui/search/SearchAdapterViewHolder;", "binding", "Lcom/subhash/deezer/databinding/SearchResultArtistViewItemBinding;", "(Lcom/subhash/deezer/databinding/SearchResultArtistViewItemBinding;)V", "getBinding", "()Lcom/subhash/deezer/databinding/SearchResultArtistViewItemBinding;", "app_debug"})
    public static final class ArtistResultViewHolder extends com.subhash.deezer.ui.search.SearchAdapterViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.subhash.deezer.databinding.SearchResultArtistViewItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.subhash.deezer.databinding.SearchResultArtistViewItemBinding getBinding() {
            return null;
        }
        
        public ArtistResultViewHolder(@org.jetbrains.annotations.NotNull()
        com.subhash.deezer.databinding.SearchResultArtistViewItemBinding binding) {
            super(null);
        }
    }
}