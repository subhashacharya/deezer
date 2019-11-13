package com.subhash.deezer.ui.tracks

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
import com.subhash.deezer.databinding.TrackResultViewItemBinding

class TracksAdapter(
    private val viewState: LiveData<TracksViewState>,
    private val itemsLifecycleOwner: LifecycleOwner
) : RecyclerView.Adapter<TracksAdapterViewHolder>() {

    private val differ = AsyncListDiffer(this, TracksResultDiffCallback)
    private var layoutInflater: LayoutInflater? = null

    init {
        viewState.observe(itemsLifecycleOwner, Observer {
            differ.submitList(it.trackItems)
        })
    }

    private fun requireInflater(view: View): LayoutInflater {
        return layoutInflater ?: LayoutInflater.from(view.context).also { layoutInflater = it }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TracksAdapterViewHolder {
        return when (viewType) {
            R.layout.track_result_view_item -> TracksAdapterViewHolder.TrackItemViewHolder(
                TrackResultViewItemBinding.inflate(requireInflater(parent), parent, false)
            )
            else -> throw IllegalArgumentException("Undefined view type: $viewType")
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: TracksAdapterViewHolder, position: Int) {
        val currentItem = differ.currentList[position]
        when (holder) {
            is TracksAdapterViewHolder.TrackItemViewHolder -> holder.binding.apply {
                track = currentItem as TrackItem
            }
        }
        holder.viewDataBinding.apply {
            lifecycleOwner = itemsLifecycleOwner
            executePendingBindings()
        }
    }


    override fun getItemViewType(position: Int): Int {
        return when (val item = differ.currentList[position]) {
            is TrackItem -> R.layout.track_result_view_item
            else -> throw IllegalArgumentException("Unknown item type: ${item.javaClass}")
        }
    }

}

private object TracksResultDiffCallback : DiffUtil.ItemCallback<TrackAdapterItem>() {

    override fun areItemsTheSame(oldItem: TrackAdapterItem, newItem: TrackAdapterItem): Boolean {
        return when {
            oldItem is TrackItem && newItem is TrackItem -> newItem.trackId == oldItem.trackId
            else -> false
        }
    }

    override fun areContentsTheSame(oldItem: TrackAdapterItem, newItem: TrackAdapterItem): Boolean {
        return when {
            oldItem is TrackItem && newItem is TrackItem -> newItem.trackTitle == oldItem.trackTitle
                    && newItem.trackArtist == oldItem.trackArtist && newItem.trackPosition == oldItem.trackPosition
            else -> false
        }
    }
}

sealed class TracksAdapterViewHolder(
    val viewDataBinding: ViewDataBinding
) : RecyclerView.ViewHolder(viewDataBinding.root) {

    class TrackItemViewHolder(
        val binding: TrackResultViewItemBinding
    ) : TracksAdapterViewHolder(binding)
}