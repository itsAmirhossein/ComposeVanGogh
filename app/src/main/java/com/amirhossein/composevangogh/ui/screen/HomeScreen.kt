package com.amirhossein.composevangogh.ui.screen


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amirhossein.composevangogh.ui.components.FacebookIcon
import com.amirhossein.composevangogh.ui.components.InstagramIcons

@Composable
fun HomeScreen() {
    Row(modifier = Modifier.fillMaxSize()) {
        InstagramIcons()
        Spacer(modifier = Modifier.width(10.dp))
        FacebookIcon()
        Spacer(modifier = Modifier.width(10.dp))
    }
}