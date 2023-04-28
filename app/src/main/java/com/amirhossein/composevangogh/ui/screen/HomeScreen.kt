package com.amirhossein.composevangogh.ui.screen


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.amirhossein.composevangogh.ui.components.*

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            InstagramIcons()
            FacebookIcon()
            MessengerIcon()
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            GoogleIcon()
            GooglePhotosIcon()
            YoutubeIcon()
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            GoogleVoiceSearchIcon()
            StackOverFlowIcon()
            SpotifyIcon()
        }
    }
}