package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListCardForYou
import com.gunder.market.model.dummyListCardForYou
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun BannerVertical(modifier: Modifier = Modifier, listBanner: ListCardForYou) {
	Card(
		shape = RoundedCornerShape(8.dp),
		modifier = modifier.padding(4.dp)
//		colors = CardDefaults.cardColors(Color.Transparent)
	) {
		Image(
			painter = painterResource(listBanner.imgCard),
			contentDescription = stringResource(id = listBanner.txtDesc)
		)
	}

}

@Preview(showBackground = true)
@Composable
private fun BannerVerticalPreview() {
	MarketTheme {
		BannerVertical(
			listBanner = ListCardForYou(
				R.drawable.banner_vertikal1,
				R.string.txt_desc_first_banner
			)
		)
	}
}

@Composable
fun MainBannerVertical(modifier: Modifier = Modifier) {
	LazyRow(modifier = modifier.padding(horizontal = 8.dp, vertical = 4.dp)) {
		items(dummyListCardForYou) {
			BannerVertical(listBanner = it)
		}
	}
}

@Preview(showBackground = true)
@Composable
private fun MainBannerVerticalPreview() {
	MarketTheme {
		MainBannerVertical()
	}
}
