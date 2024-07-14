package com.gunder.market

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.component.MainCardCategory
import com.gunder.market.component.MainCategoryBottom
import com.gunder.market.component.MainCategoryTop
import com.gunder.market.component.MainImageCategory
import com.gunder.market.component.MainImageCategoryGrid
import com.gunder.market.component.MainTopBar
import com.gunder.market.component.MainTopMenu
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
	Scaffold(
		topBar = {
			MainTopBar()
		},
		bottomBar = {
//            BottomBar()
		})
	{ paddingValues ->
		Column(
			modifier = modifier
				.verticalScroll(rememberScrollState())
				.padding(paddingValues)
		) {
//        your code compose here
//			MainTopBar()
			MainTopMenu()
			MainCategoryTop()
			MainCardCategory()
			MainCategoryBottom()
			MainImageCategory()
//			MainImageCategoryGrid()
//            MainCategoryTop()
//            MainCategoryCard()
//            MainCategoryBottom()
//            MainImageCategory()
//            MainVerticalBanner()
		}
	}

}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreview() {
	MarketTheme {
		MarketApp()
	}
}

