package com.amirhossein.composevangogh.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun InstagramIcons(modifier: Modifier = Modifier) {
    val instagramColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
    Canvas(
        modifier =
        Modifier
            .size(100.dp)
            .padding(16.dp)
            .then(modifier)
    ) {
        drawRoundRect(
            brush = Brush.linearGradient(instagramColors),
            cornerRadius = CornerRadius(60f,60f),
            style = Stroke(width = 15f, cap = StrokeCap.Round),
        )
        drawCircle(
            brush = Brush.linearGradient(instagramColors),
            radius = 45f,
            style = Stroke(width = 15f, cap = StrokeCap.Round),
        )
        drawCircle(
            brush = Brush.linearGradient(instagramColors),
            radius = 13f,
            center = Offset(x = this.size.width * 0.8f , y = this.size.height * 0.2f)
        )
    }
}