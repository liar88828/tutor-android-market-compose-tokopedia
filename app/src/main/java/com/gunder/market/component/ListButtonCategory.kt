package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.model.ListBottomCategory
import com.gunder.market.model.dummyListBottomCategory
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun ListButtonCategory(
	modifier: Modifier = Modifier,
	listBottomCategory: ListBottomCategory
) {
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
		verticalArrangement = Arrangement.spacedBy(8.dp)
	) {
		Image(
			painter = painterResource(id = listBottomCategory.imgBottomCategory),
			contentDescription = null,
			modifier = Modifier.size(40.dp)
		)
		Text(text = stringResource(id = listBottomCategory.txtBottomCategory), fontSize = 12.sp)
	}
}

@Preview(showBackground = true)
@Composable
private fun ListButtonCategoryPreview() {
	MarketTheme {
		ListButtonCategory(
			listBottomCategory = ListBottomCategory(
				R.drawable.play,
				R.string.txt_category_sport,
			)
		)
	}
}

@Composable
fun MainCategoryBottom(modifier: Modifier = Modifier) {
	LazyRow() {
		items(dummyListBottomCategory) {
			ListButtonCategory(listBottomCategory = it)
		}
	}

}

@Preview(showBackground = true)
@Composable
private fun MainCategoryBottomPreview() {

	MarketTheme {
		MainCategoryBottom()
	}
}