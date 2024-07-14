package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.model.GridBanner
import com.gunder.market.model.dummyGridBanner
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun CardVertical(modifier: Modifier = Modifier, gridBanner: GridBanner) {
	Card(
//					elevation = CardDefaults.cardElevation(
//						defaultElevation = 6.dp
//					),
		modifier = Modifier
//						.width(200.dp)
			.padding(vertical = 8.dp, horizontal = 8.dp)
//						.fillMaxWidth(),
//					shape = RoundedCornerShape(8.dp)
	) {
		Image(
			painter = painterResource(gridBanner.imgBanner),
			contentDescription = null,
			modifier = modifier
				.fillMaxSize(),
			contentScale = ContentScale.Crop,
		)
	}
}

@Composable
fun MainImageCategoryGrid(modifier: Modifier = Modifier) {
	LazyVerticalGrid(
		columns = GridCells.Fixed(2),
//		contentPadding = PaddingValues(
//			vertical = 8.dp,
////			horizontal = 8.dp,
//		),
		modifier = modifier.padding(2.dp),
		content = {
			items(dummyGridBanner) {
				CardVertical(gridBanner = it)
			}
		},
	)
}

@Preview(showBackground = true)
@Composable
private fun MainImageCategoryGridPreview() {
	MarketTheme {
		MainImageCategoryGrid()
	}
}