package com.subhash.deezer.ui.tracks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/subhash/deezer/ui/tracks/TracksAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/subhash/deezer/ui/tracks/TracksAdapterViewHolder;", "viewState", "Landroidx/lifecycle/LiveData;", "Lcom/subhash/deezer/ui/tracks/TracksViewState;", "itemsLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/subhash/deezer/ui/tracks/TrackAdapterItem;", "kotlin.jvm.PlatformType", "layoutInflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "requireInflater", "view", "Landroid/view/View;", "app_debug"})
public final class TracksAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.subhash.deezer.ui.tracks.TracksAdapterViewHolder> {
    private final androidx.recyclerview.widget.AsyncListDiffer<com.subhash.deezer.ui.tracks.TrackAdapterItem> differ = null;
    private android.view.LayoutInflater layoutInflater;
    private final androidx.lifecycle.LiveData<com.subhash.deezer.ui.tracks.TracksViewState> viewState = null;
    private final androidx.lifecycle.LifecycleOwner itemsLifecycleOwner = null;
    
    private final android.view.LayoutInflater requireInflater(android.view.View view) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.subhash.deezer.ui.tracks.TracksAdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.tracks.TracksAdapterViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public TracksAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.subhash.deezer.ui.tracks.TracksViewState> viewState, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner itemsLifecycleOwner) {
        super();
    }
}