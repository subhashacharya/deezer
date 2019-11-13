package com.subhash.deezer.ui.tracks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.updateLayoutParams
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.material.appbar.AppBarLayout
import com.subhash.deezer.R
import com.subhash.deezer.databinding.TracksFragmentBinding
import com.subhash.deezer.ui.utils.getViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import kotlin.math.abs

class TracksFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getViewModel<TracksViewModel>(viewModelFactory).apply {
            setTrackInfo(requireNotNull(requireArguments().getParcelable("albumInfo")))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return TracksFragmentBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = requireNotNull(DataBindingUtil.getBinding<TracksFragmentBinding>(view))
        val trackViewModel = getViewModel<TracksViewModel>(viewModelFactory)
        binding.apply {
            viewModel = trackViewModel
            tracksList.adapter = TracksAdapter(trackViewModel.viewState, viewLifecycleOwner)

            toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        }
    }
}
