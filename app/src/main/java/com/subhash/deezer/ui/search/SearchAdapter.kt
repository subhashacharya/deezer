package com.subhash.deezer.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.subhash.deezer.R
import com.subhash.deezer.databinding.SearchResultArtistViewItemBinding
import com.subhash.deezer.databinding.SearchResultHeaderViewItemBinding

class SearchAdapter(
    private val searchViewState: LiveData<SearchViewState>,
    private val searchEventsListener: SearchEventsListener,
    private val itemsLifecycleOwner: LifecycleOwner
) : RecyclerView.Adapter<SearchAdapterViewHolder>() {

    private val differ = AsyncListDiffer(this, SearchResultsDiffCallback)
    private var layoutInflater: LayoutInflater? = null

    init {
        searchViewState.observe(itemsLifecycleOwner, Observer {
            differ.submitList(it.searchResultItems)
        })
    }

    private fun requireInflater(view: View): LayoutInflater {
        return layoutInflater ?: LayoutInflater.from(view.context).also { layoutInflater = it }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchAdapterViewHolder {
        return when (viewType) {
            R.layout.search_result_header_view_item -> SearchAdapterViewHolder.HeaderItemViewHolder(
                SearchResultHeaderViewItemBinding.inflate(requireInflater(parent), parent, false)
            )
            R.layout.search_result_artist_view_item -> SearchAdapterViewHolder.ArtistResultViewHolder(
                SearchResultArtistViewItemBinding.inflate(requireInflater(parent), parent, false)
            )
            else -> throw IllegalArgumentException("Undefined view type: $viewType")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (val item = differ.currentList[position]) {
            is HeaderItem -> R.layout.search_result_header_view_item
            is ArtistItem -> R.layout.search_result_artist_view_item
            else -> throw IllegalArgumentException("Unknown item type: ${item.javaClass}")
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: SearchAdapterViewHolder, position: Int) {
        val currentItem = differ.currentList[position]
        when (holder) {
            is SearchAdapterViewHolder.HeaderItemViewHolder -> holder.binding.apply {
                header = currentItem as HeaderItem
            }
            is SearchAdapterViewHolder.ArtistResultViewHolder -> holder.binding.apply {
                item = currentItem as ArtistItem
                listener = searchEventsListener
            }
        }

        holder.itemBinding.apply {
            lifecycleOwner = itemsLifecycleOwner
            executePendingBindings()
        }
    }
}

private object SearchResultsDiffCallback : DiffUtil.ItemCallback<SearchResultItem>() {
    override fun areItemsTheSame(oldItem: SearchResultItem, newItem: SearchResultItem): Boolean {
        return when {
            oldItem is HeaderItem && newItem is HeaderItem -> oldItem.title == newItem.title
            oldItem is ArtistItem && newItem is ArtistItem -> oldItem.id == newItem.id
            else -> false
        }
    }

    override fun areContentsTheSame(oldItem: SearchResultItem, newItem: SearchResultItem): Boolean {
        return when {
            oldItem is HeaderItem && newItem is HeaderItem -> oldItem.title == newItem.title
            oldItem is ArtistItem && newItem is ArtistItem ->
                oldItem.id == newItem.id && oldItem.title == newItem.title
            else -> false
        }
    }
}

sealed class SearchAdapterViewHolder(val itemBinding: ViewDataBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    class HeaderItemViewHolder(
        val binding: SearchResultHeaderViewItemBinding
    ) : SearchAdapterViewHolder(binding)

    class ArtistResultViewHolder(
        val binding: SearchResultArtistViewItemBinding
    ) : SearchAdapterViewHolder(binding)
}
