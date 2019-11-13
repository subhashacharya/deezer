package com.subhash.deezer.databinding;
import com.subhash.deezer.R;
import com.subhash.deezer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AlbumResultViewItemBindingImpl extends AlbumResultViewItemBinding implements com.subhash.deezer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AlbumResultViewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private AlbumResultViewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.albumArt.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.subhash.deezer.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.album == variableId) {
            setAlbum((com.subhash.deezer.ui.album.AlbumItem) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.subhash.deezer.ui.album.AlbumEventsListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAlbum(@Nullable com.subhash.deezer.ui.album.AlbumItem Album) {
        this.mAlbum = Album;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.album);
        super.requestRebind();
    }
    public void setListener(@Nullable com.subhash.deezer.ui.album.AlbumEventsListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.subhash.deezer.ui.album.AlbumItem album = mAlbum;
        java.lang.String albumAlbumArt = null;
        java.lang.String albumArtists = null;
        com.subhash.deezer.ui.album.AlbumEventsListener listener = mListener;
        java.lang.String albumTitle = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (album != null) {
                    // read album.albumArt
                    albumAlbumArt = album.getAlbumArt();
                    // read album.artists
                    albumArtists = album.getArtists();
                    // read album.title
                    albumTitle = album.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.subhash.deezer.ui.utils.BindingAdaptersKt.loadAlbumArt(this.albumArt, albumAlbumArt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, albumArtists);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, albumTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // album
        com.subhash.deezer.ui.album.AlbumItem album = mAlbum;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.subhash.deezer.ui.album.AlbumEventsListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            listener.onAlbumSelected(album);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): album
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}