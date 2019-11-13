package com.subhash.deezer.ui.album

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.subhash.deezer.databinding.AlbumFragmentBinding
import com.subhash.deezer.ui.tracks.TrackFragmentArguments
import com.subhash.deezer.ui.utils.getViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class AlbumFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getViewModel<AlbumViewModel>(viewModelFactory).apply {
            val (artistId, artistName) = requireArguments().let {
                requireNotNull(it.getString("artistId")) to requireNotNull(it.getString("artistName"))
            }
            initializeArtist(artistId, artistName)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return AlbumFragmentBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = requireNotNull(DataBindingUtil.getBinding<AlbumFragmentBinding>(view))
        val albumViewModel = getViewModel<AlbumViewModel>(viewModelFactory)

        binding.apply {
            albumsGrid.adapter = AlbumsAdapter(
                albumViewModel.viewState, albumViewModel, viewLifecycleOwner
            )

            toolbar.setNavigationOnClickListener { findNavController().popBackStack() }

            lifecycleOwner = viewLifecycleOwner
        }

        albumViewModel.apply {
            navigateToAlbumTrack.observe(viewLifecycleOwner, Observer {
               findNavController().navigate(AlbumFragmentDirections.actionAlbumToTracks(
                   TrackFragmentArguments(it.artists, it.id, it.title, it.albumCover)
               ))
            })
        }
    }
}
