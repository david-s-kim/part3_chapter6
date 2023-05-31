package com.example.part3_chapter6.model

interface ListItem : java.io.Serializable {
    val viewType : ViewType

    fun getKey() = hashCode()
}

enum class ViewType {
    VIEW_PAGER,
    HORIZONTAL,
    FULL_AD,

    SELL_ITEM,
    IMAGE,
    SALE,
    COUPON,

    EMPTY
}