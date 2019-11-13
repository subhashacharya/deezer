package com.subhash.deezer.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.subhash.deezer.databinding.SearchFragmentBinding
import com.subhash.deezer.ui.utils.getViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SearchFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var inputMethodManager: InputMethodManager

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

            searchEditText.setOnEditorActionListener { v, actionId, _ ->
                if (actionId == IME_ACTION_SEARCH) {
                    //Search is handled on each text change, just close the keypad
                    inputMethodManager.hideSoftInputFromWindow(v.windowToken, 0);
                }
                false
            }

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
