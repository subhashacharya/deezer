package com.subhash.deezer.ui.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/subhash/deezer/ui/album/AlbumsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/subhash/deezer/ui/album/AlbumsAdapterViewHolder;", "albumViewState", "Landroidx/lifecycle/LiveData;", "Lcom/subhash/deezer/ui/album/AlbumsViewState;", "albumEventsListener", "Lcom/subhash/deezer/ui/album/AlbumEventsListener;", "itemsLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LiveData;Lcom/subhash/deezer/ui/album/AlbumEventsListener;Landroidx/lifecycle/LifecycleOwner;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/subhash/deezer/ui/album/AlbumsResultItem;", "kotlin.jvm.PlatformType", "layoutInflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "requireInflater", "view", "Landroid/view/View;", "app_debug"})
public final class AlbumsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.subhash.deezer.ui.album.AlbumsAdapterViewHolder> {
    private final androidx.recyclerview.widget.AsyncListDiffer<com.subhash.deezer.ui.album.AlbumsResultItem> differ = null;
    private android.view.LayoutInflater layoutInflater;
    private final androidx.lifecycle.LiveData<com.subhash.deezer.ui.album.AlbumsViewState> albumViewState = null;
    private final com.subhash.deezer.ui.album.AlbumEventsListener albumEventsListener = null;
    private final androidx.lifecycle.LifecycleOwner itemsLifecycleOwner = null;
    
    private final android.view.LayoutInflater requireInflater(android.view.View view) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.subhash.deezer.ui.album.AlbumsAdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.album.AlbumsAdapterViewHolder holder, int position) {
    }
    
    public AlbumsAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.subhash.deezer.ui.album.AlbumsViewState> albumViewState, @org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.album.AlbumEventsListener albumEventsListener, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner itemsLifecycleOwner) {
        super();
    }
}