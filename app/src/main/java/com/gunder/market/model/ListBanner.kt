package com.gunder.market.model

import androidx.annotation.DrawableRes
import com.gunder.market.R

data class ListBanner(
	@DrawableRes val imgCard: Int,
	)

val dummyListBanner = listOf(
	ListBanner(R.drawable.banner1),
	ListBanner(R.drawable.banner2),
	ListBanner(R.drawable.banner3)
)