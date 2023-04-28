package com.amirhossein.composevangogh.ui.components.icons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amirhossein.composevangogh.model.Icon
import com.amirhossein.composevangogh.ui.components.InstagramIcon

@Composable
fun HomeIconItem(icon: Icon, modifier: Modifier = Modifier, textSize: TextUnit = 15.sp) {
    Box(modifier = Modifier.wrapContentSize()) {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .then(modifier),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            icon.action?.invoke()
            Text(
                text = icon.title,
                style = TextStyle(fontSize = textSize),
                modifier = Modifier.padding(bottom = 16.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun IconItemPreview() = HomeIconItem(icon = Icon(title = "Instagram", action = { InstagramIcon() }))