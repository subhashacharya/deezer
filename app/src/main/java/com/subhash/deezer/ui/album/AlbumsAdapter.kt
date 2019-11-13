package com.subhash.deezer.ui.album

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
import com.subhash.deezer.databinding.AlbumResultViewItemBinding

class AlbumsAdapter(
    private val albumViewState: LiveData<AlbumsViewState>,
    private val albumEventsListener: AlbumEventsListener,
    private val itemsLifecycleOwner: LifecycleOwner
) : RecyclerView.Adapter<AlbumsAdapterViewHolder>() {

    private val differ = AsyncListDiffer(this, AlbumsResultDiffCallback)
    private var layoutInflater: LayoutInflater? = null

    init {
        albumViewState.observe(itemsLifecycleOwner, Observer {
            differ.submitList(it.albumsResultItems)
        })
    }

    private fun requireInflater(view: View): LayoutInflater {
        return layoutInflater ?: LayoutInflater.from(view.context).also { layoutInflater = it }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumsAdapterViewHolder {
        return when (viewType) {
            R.layout.album_result_view_item -> AlbumsAdapterViewHolder.AlbumItemViewHolder(
                AlbumResultViewItemBinding.inflate(requireInflater(parent), parent, false)
            )
            else -> throw IllegalArgumentException("Undefined view type: $viewType")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (val item = differ.currentList[position]) {
            is AlbumItem -> R.layout.album_result_view_item
            else -> throw IllegalArgumentException("Unknown item type: ${item.javaClass}")
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: AlbumsAdapterViewHolder, position: Int) {
        val currentItem = differ.currentList[position]
        when (holder) {
            is AlbumsAdapterViewHolder.AlbumItemViewHolder -> holder.binding.apply {
                album = currentItem as AlbumItem
                listener = albumEventsListener
            }
        }

        holder.itemBinding.apply {
            lifecycleOwner = itemsLifecycleOwner
            executePendingBindings()
        }
    }
}

private object AlbumsResultDiffCallback : DiffUtil.ItemCallback<AlbumsResultItem>() {

    override fun areItemsTheSame(oldItem: AlbumsResultItem, newItem: AlbumsResultItem): Boolean {
        return when {
            oldItem is AlbumItem && newItem is AlbumItem -> oldItem.id == newItem.id
            else -> false
        }
    }

    override fun areContentsTheSame(oldItem: AlbumsResultItem, newItem: AlbumsResultItem): Boolean {
        return when {
            oldItem is AlbumItem && newItem is AlbumItem ->
                oldItem.albumArt == newItem.albumArt && oldItem.title == newItem.title && oldItem.artists == newItem.artists
            else -> false
        }
    }
}

sealed class AlbumsAdapterViewHolder(val itemBinding: ViewDataBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    class AlbumItemViewHolder(
        val binding: AlbumResultViewItemBinding
    ) : AlbumsAdapterViewHolder(binding)
}
