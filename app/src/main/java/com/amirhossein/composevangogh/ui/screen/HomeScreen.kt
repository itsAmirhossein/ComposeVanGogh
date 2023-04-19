package com.amirhossein.composevangogh.ui.screen


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.amirhossein.composevangogh.ui.components.InstagramIcons

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        InstagramIcons()
    }
}