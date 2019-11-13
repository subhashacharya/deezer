package com.subhash.deezer.ui.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

inline fun <reified T : ViewModel> ViewModelStoreOwner.getViewModel(viewModelFactory: ViewModelProvider.Factory): T {
    return ViewModelProvider(this, viewModelFactory).get(T::class.java)
}
