package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.model.ListTopMenu
import com.gunder.market.model.dummyListTopMenus
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainTopMenu(modifier: Modifier = Modifier, listTopMenu: ListTopMenu) {
	Row(
		modifier = Modifier
			.padding(8.dp)
			.height(IntrinsicSize.Max),
		horizontalArrangement = Arrangement.spacedBy(8.dp),
		verticalAlignment = Alignment.CenterVertically

	) {
		Image(
			painter = painterResource(id = listTopMenu.imgTopBar),
			contentDescription = null, modifier = Modifier.size(40.dp)
		)
		Column {
			Text(
				text = stringResource(id = listTopMenu.txtTopBar),
				fontSize = 14.sp
			)
			Text(
				text = stringResource(id = listTopMenu.descTopBar),
				fontSize = 14.sp, fontWeight = FontWeight.Bold
			)
		}
		VerticalDivider(modifier = Modifier
			.width(1.dp)
			.height(40.dp))
	}

}

@Preview(showBackground = true)
@Composable
fun TopMenuPreview(modifier: Modifier = Modifier) {
	MarketTheme {
		MainTopMenu(
			listTopMenu =
			ListTopMenu(R.drawable.gopay, R.string.txt_gopay, R.string.txt_dummy_gopay),
		)
	}
}

@Composable
fun MainTopMenu() {
	LazyRow(modifier = Modifier.padding(4.dp)) {
		items(dummyListTopMenus) {
			MainTopMenu(listTopMenu = it)
		}
	}
}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreviews() {
	MarketTheme {
		MainTopMenu()
	}
}

