package com.example.part3_chapter6.viewholder

import com.example.part3_chapter6.ListAdapter
import com.example.part3_chapter6.model.Horizontal
import com.example.part3_chapter6.model.ListItem
import fastcampus.part3.chapter6.databinding.ItemHorizontalBinding

class HorizontalViewHolder(
    private val binding : ItemHorizontalBinding
) : BindingViewHolder<fastcampus.part3.chapter6.databinding.ItemHorizontalBinding>(binding){
    private val adapter = ListAdapter()

    init {
        binding.listview.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as Horizontal
        binding.titleTextView.text = item.title
        adapter.submitList(item.items)
    }
}