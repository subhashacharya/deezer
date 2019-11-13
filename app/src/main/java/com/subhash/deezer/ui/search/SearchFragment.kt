package com.subhash.deezer.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.subhash.deezer.R
import com.subhash.deezer.databinding.SearchFragmentBinding
import com.subhash.deezer.ui.utils.getViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SearchFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return SearchFragmentBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding: SearchFragmentBinding = requireNotNull(DataBindingUtil.getBinding(view))
        val searchViewModel = getViewModel<SearchViewModel>(viewModelFactory)
        binding.apply {
            searchResults.adapter = SearchAdapter(
                searchViewModel.searchViewState, searchViewModel, viewLifecycleOwner
            )

            viewModel = searchViewModel
            listener = searchViewModel
            lifecycleOwner = viewLifecycleOwner
        }

        searchViewModel.apply {
            navigateToAlbums.observe(viewLifecycleOwner, Observer {
                findNavController().navigate(SearchFragmentDirections.actionSearchToAlbums(it.id, it.title))
            })
        }
    }
}
