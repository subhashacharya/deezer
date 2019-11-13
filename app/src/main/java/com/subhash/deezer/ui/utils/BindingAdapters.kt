package com.subhash.deezer.ui.utils

import android.view.View
import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import coil.api.load
import coil.transform.CircleCropTransformation
import com.subhash.deezer.R

@BindingAdapter("artistAvatar")
fun loadArtistAvatar(imageView: ImageView, url: String) {
    imageView.load(url) {
        placeholder(R.drawable.ic_baseline_account_circle_24)
        transformations(CircleCropTransformation())
    }
}

@BindingAdapter("albumArt")
fun loadAlbumArt(imageView: ImageView, url: String) {
    imageView.load(url) {
        placeholder(R.drawable.ic_baseline_image_24)
    }
}

@BindingAdapter("visible")
fun setVisible(view: View, visible: Boolean?) {
    view.isVisible = visible == true
}
