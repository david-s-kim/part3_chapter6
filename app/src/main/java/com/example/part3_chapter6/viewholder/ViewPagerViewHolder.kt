package com.example.part3_chapter6.viewholder

import com.example.part3_chapter6.ListAdapter
import com.example.part3_chapter6.model.ListItem
import com.example.part3_chapter6.model.ViewPager
import fastcampus.part3.chapter6.databinding.ItemViewpagerBinding

class ViewPagerViewHolder(
    binding : ItemViewpagerBinding
): BindingViewHolder<com.example.part3_chapter6.databinding.ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewpager.adapter = adapter

    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }
}