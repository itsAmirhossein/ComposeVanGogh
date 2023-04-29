package com.amirhossein.composevangogh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.amirhossein.composevangogh.ui.screen.HomeScreen
import com.amirhossein.composevangogh.ui.theme.ComposeVanGoghTheme
import com.amirhossein.composevangogh.utils.Constant
import com.amirhossein.composevangogh.utils.changeStatusBarColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            changeStatusBarColor(color = Color.White)
            ComposeVanGoghTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black.copy(alpha = .03f)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    )
                    {
                        HomeScreen(
                            items = Constant.homeCards
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeVanGoghTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black.copy(alpha = .05f)
        ) {
            Box(modifier = Modifier.fillMaxSize())
            {

                HomeScreen(items = Constant.homeCards)
            }
        }
    }
}