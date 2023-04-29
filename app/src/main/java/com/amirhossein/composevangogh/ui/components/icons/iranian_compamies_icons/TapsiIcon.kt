package com.amirhossein.composevangogh.ui.components.icons.iranian_compamies_icons

import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TapsiIcon(modifier: Modifier = Modifier) {
    Canvas(
        modifier =
        Modifier
            .size(80.dp)
            .padding(16.dp)
            .then(modifier)
    ) {
        drawRoundRect(
            color= Color(0xFFff5722),
            cornerRadius = CornerRadius(36f,36f),
        )

        drawRect(
            color = Color.White,
            topLeft = Offset(size.width * .375f, size.height * .32f),
            Size(size.width * .45f, size.height * .13f)
        )

        drawRect(
            color = Color.White,
            topLeft = Offset(size.width * .175f, size.height * .55f),
            Size(size.width * .65f, size.height * .13f)
        )
    }
}

@Preview
@Composable
fun TapsiIconPreview() = TapsiIcon()