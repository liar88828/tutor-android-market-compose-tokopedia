package com.gunder.market.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
	var count by remember {
		mutableIntStateOf(0)
	}

	fun increment(): Unit {
		count++
	}
	StateFulComponent(count, onChange = { increment() })

}

@Composable
fun StateFulComponent(count: Int, onChange: () -> Unit) {
	Column {
		Text(text = "count number $count")
		Button(onClick = onChange) {
			Text(text = "Tambah Data")
		}
	}
}

@Preview(showBackground = true)
@Composable
private fun MainSateFulComponent() {
	MarketTheme {
		MainScreen()
	}

}