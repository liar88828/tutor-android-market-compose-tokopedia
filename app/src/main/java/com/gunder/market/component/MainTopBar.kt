package com.gunder.market.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainTopBar(modifier: Modifier = Modifier) {
	Column(modifier = Modifier.padding(16.dp)) {
		Row(
			modifier = Modifier.width(IntrinsicSize.Min),
			verticalAlignment = Alignment.CenterVertically,
			horizontalArrangement = Arrangement.SpaceBetween
//                .spacedBy(8.dp)
		) {
			OutlinedTextField(
				modifier = Modifier
                    .widthIn(min = 200.dp)
                    .padding(8.dp),
				value = "",
				onValueChange = {},
				leadingIcon = {
					Icon(
						imageVector = Icons.Outlined.Search,
						contentDescription = null
					)
				},
				placeholder = {
					Text(text = "Search Here...")
				}
			)

			Icon(
				imageVector = Icons.Outlined.Email,
				contentDescription = null,
				modifier = Modifier.size(24.dp)
			)
			Icon(
				imageVector = Icons.Outlined.ShoppingCart,
				contentDescription = null,
				modifier = Modifier.size(24.dp)
			)
			Icon(
				imageVector = Icons.Outlined.Notifications,
				contentDescription = null,
				modifier = Modifier.size(24.dp)
			)
			Icon(
				imageVector = Icons.Outlined.Menu,
				contentDescription = null,
				modifier = Modifier.size(24.dp)
			)
		}
		Row(
			modifier = Modifier.padding(top = 8.dp),
			horizontalArrangement = Arrangement.spacedBy(8.dp),
			verticalAlignment = Alignment.CenterVertically
		) {
			Icon(
				imageVector = Icons.Outlined.LocationOn,
				contentDescription = null,
				modifier = Modifier.size(18.dp)
			)
			Text(text = stringResource(R.string.text_dummy_addtress), fontSize = 12.sp)

            Icon(
                imageVector = Icons.Outlined.Person,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )

			Text(
				text = stringResource(R.string.txt_dummy_user), fontSize = 12.sp,
				fontWeight = FontWeight.Bold
			)

			Icon(
				imageVector = Icons.Outlined.KeyboardArrowDown,
				contentDescription = null,
				modifier = Modifier.size(18.dp)
			)
		}
	}
}

@Preview(showBackground = true)
@Composable
fun MainTopBarPreview() {
	MarketTheme {
		MainTopBar()
	}


}