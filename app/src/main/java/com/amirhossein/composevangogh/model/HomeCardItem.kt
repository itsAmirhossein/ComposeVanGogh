package com.amirhossein.composevangogh.model

import androidx.annotation.DrawableRes

data class HomeCardItem(
    val headerTitle: String,
    @DrawableRes val headerIconId: Int,
    val items: List<Icon> = emptyList(),
)
