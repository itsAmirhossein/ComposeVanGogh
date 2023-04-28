package com.amirhossein.composevangogh.ui.screen


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amirhossein.composevangogh.ui.components.home.HomeHeader
import com.amirhossein.composevangogh.ui.components.icons.HomeIconItem
import com.amirhossein.composevangogh.utils.Constant

@Composable
fun HomeScreen() {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = 12.dp,
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier
            .padding(16.dp)
            .wrapContentHeight(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
        ) {
            HomeHeader(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                title = "International",
                iconSize = 20.dp,
                textSize = 16.sp,
            )
            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxWidth(),
                columns = GridCells.Fixed(3),
            ) {
                items(
                    Constant.internationalIcons
                ) { icon ->
                    HomeIconItem(icon = icon, textSize = 14.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() = HomeScreen()
