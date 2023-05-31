package com.example.part3_chapter6.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.part3_chapter6.model.ListItem
import androidx.databinding.ViewDataBinding
import fastcampus.part3.chapter6.BR

abstract class BindingViewHolder<VB : ViewDataBinding>(
    private val binding: VB
) : RecyclerView.ViewHolder(binding.root) {

    protected var item: ListItem? = null

    open fun bind(item: ListItem) {
        this.item = item
        binding.setVariable(BR.item, this.item)
    }

}