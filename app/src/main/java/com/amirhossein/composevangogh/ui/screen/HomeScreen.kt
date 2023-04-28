package com.amirhossein.composevangogh.ui.screen


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amirhossein.composevangogh.ui.components.*

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        InstagramIcons()
        FacebookIcon()
        MessengerIcon()
        GoogleIcon()
        GooglePhotosIcon()
        YoutubeIcon()
    }
}