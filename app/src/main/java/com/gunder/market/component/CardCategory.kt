package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListBanner
import com.gunder.market.model.dummyListBanner
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CardCategory(
	modifier: Modifier = Modifier,
	listBanner: ListBanner
) {
	Card(
		modifier = Modifier
			.width(200.dp)
			.padding(vertical =  8.dp, horizontal = 16.dp)
			.heightIn(48.dp),
		shape = RoundedCornerShape(8.dp)
	) {
		Image(
			painter = painterResource(id = listBanner.imgBanner),
			contentDescription = null,
//			modifier = Modifier.width(200.dp)
		)
	}

}

@Preview(showBackground = true)
@Composable
private fun CardCategoryPreview() {
	MarketTheme {
		CardCategory(listBanner = ListBanner(R.drawable.banner1))
	}

}

@Composable
fun MainCardCategory(modifier: Modifier = Modifier) {
	LazyRow {
		items(dummyListBanner) {
			CardCategory(listBanner = it)
		}
	}

}

@Preview(showBackground = true)
@Composable
private fun MainCardCategoryPreview() {
	MarketTheme {
		MainCardCategory()
	}

}