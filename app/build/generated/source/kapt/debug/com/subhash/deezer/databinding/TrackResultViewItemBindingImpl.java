package com.subhash.deezer.databinding;
import com.subhash.deezer.R;
import com.subhash.deezer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TrackResultViewItemBindingImpl extends TrackResultViewItemBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TrackResultViewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private TrackResultViewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.trackArtist.setTag(null);
        this.trackPosition.setTag(null);
        this.trackTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.track == variableId) {
            setTrack((com.subhash.deezer.ui.tracks.TrackItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTrack(@Nullable com.subhash.deezer.ui.tracks.TrackItem Track) {
        this.mTrack = Track;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.track);
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
        java.lang.String trackTrackArtist = null;
        java.lang.String trackTrackPosition = null;
        java.lang.String trackTrackTitle = null;
        com.subhash.deezer.ui.tracks.TrackItem track = mTrack;

        if ((dirtyFlags & 0x3L) != 0) {



                if (track != null) {
                    // read track.trackArtist
                    trackTrackArtist = track.getTrackArtist();
                    // read track.trackPosition
                    trackTrackPosition = track.getTrackPosition();
                    // read track.trackTitle
                    trackTrackTitle = track.getTrackTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.trackArtist, trackTrackArtist);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.trackPosition, trackTrackPosition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.trackTitle, trackTrackTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): track
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}