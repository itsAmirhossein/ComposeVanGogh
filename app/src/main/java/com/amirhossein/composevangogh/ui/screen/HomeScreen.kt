package com.amirhossein.composevangogh.ui.screen


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amirhossein.composevangogh.model.HomeCardItem
import com.amirhossein.composevangogh.ui.components.home.HomeCard
import com.amirhossein.composevangogh.utils.Constant

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    items: List<HomeCardItem>
) {
    Column(
        modifier = Modifier
            .then(modifier)
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        items.forEach { item ->
            HomeCard(
                headerIconId = item.headerIconId,
                headerTitle = item.headerTitle,
                items = item.items,
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() =
    HomeScreen(items = Constant.homeCards)
