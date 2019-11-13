package com.subhash.deezer.ui.utils

import android.widget.ImageView
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
