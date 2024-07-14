package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.GridBanner
import com.gunder.market.model.dummyGridBanner
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainImageCategory(modifier: Modifier = Modifier) {
	Column(
		modifier = Modifier
			.fillMaxWidth()
			.padding(8.dp),
		verticalArrangement = Arrangement.spacedBy(8.dp),
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Row(
			modifier = Modifier.padding(horizontal = 8.dp),
			horizontalArrangement = Arrangement.spacedBy(18.dp),
		) {
			Card(
				modifier = Modifier,
				shape = RoundedCornerShape(8.dp)
			) {
				Image(
					painter = painterResource(id = R.drawable.banner_horizontal_1),
					contentDescription = null
				)
			}
			Card(
				modifier = Modifier,
				shape = RoundedCornerShape(8.dp)
			) {
				Image(
					painter = painterResource(id = R.drawable.banner_horizontal_2),
					contentDescription = null
				)
			}
		}

		Row(
			modifier = Modifier.padding(horizontal = 8.dp),
			horizontalArrangement = Arrangement.spacedBy(18.dp),
		) {
			Card(
				modifier = Modifier,
				shape = RoundedCornerShape(8.dp)
			) {
				Image(
					painter = painterResource(id = R.drawable.banner_horizontal_3),
					contentDescription = null
				)
			}
			Card(
				modifier = Modifier,
				shape = RoundedCornerShape(8.dp)
			) {
				Image(
					painter = painterResource(id = R.drawable.banner_horizontal_4),
					contentDescription = null
				)
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
private fun MainImageCategoryPreview() {
	MarketTheme {
		MainImageCategory()
	}
}
