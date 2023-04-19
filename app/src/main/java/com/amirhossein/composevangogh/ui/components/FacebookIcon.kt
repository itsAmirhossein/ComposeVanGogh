package com.amirhossein.composevangogh.ui.components

import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun FacebookIcon(modifier: Modifier = Modifier) {
    val assetManager = LocalContext.current.assets
    val paint = Paint().apply {
        textAlign = Paint.Align.CENTER
        textSize = 200f
        color = Color.White.toArgb()
        typeface = Typeface.createFromAsset(assetManager,"fonts/FACEBOLF.OTF")
    }
    Canvas(
        modifier =
        Modifier
            .size(100.dp)
            .padding(16.dp)
            .then(modifier)
    ) {
        drawRoundRect(
            color= Color(0xFF1776d1),
            cornerRadius = CornerRadius(36f,36f),
        )
        drawContext.canvas.nativeCanvas.drawText("f",center.x + 25 , center.y + 90 , paint)
    }
}