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
import com.gunder.market.R
import com.gunder.market.model.ListCategory
import com.gunder.market.model.dummyListTopCategory
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainTopCategory(modifier: Modifier = Modifier, listTopCategory: ListCategory) {
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier.padding(horizontal = 16.dp),
		verticalArrangement = Arrangement.spacedBy(8.dp)
	) {
		Image(
			painter = painterResource(id = listTopCategory.imgTopCategory),
			contentDescription = null, modifier = Modifier.size(40.dp)
		)
		Text(text = stringResource(id = listTopCategory.txtTopCategory))
	}

}

@Preview(showBackground = true)
@Composable
fun MainTopCategoryPreview() {
	MarketTheme {
		MainTopCategory(
			listTopCategory = ListCategory(
				R.drawable.cicil, R.string.txt_credit,
			)
		)
	}
}

@Composable
fun MainCategoryTop() {
	LazyRow {
		items(dummyListTopCategory){
			MainTopCategory(listTopCategory =it)
		}
	}
}

@Preview(showBackground = true)
@Composable
fun MainCategoryTopPreview() {
	MarketTheme {
		MainCategoryTop()
	}
}