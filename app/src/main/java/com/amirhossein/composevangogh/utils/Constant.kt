package com.amirhossein.composevangogh.utils

import com.amirhossein.composevangogh.model.Icon
import com.amirhossein.composevangogh.ui.components.*

object Constant {
    val internationalIcons = listOf(
        Icon(
            title = "Instagram",
            action = { InstagramIcon() },
            url = "https://www.instagram.com/"
        ),
        Icon(
            title = "Facebook",
            action = { FacebookIcon() },
            url = "https://www.facebook.com/"
        ),
        Icon(
            title = "Messenger",
            action = { MessengerIcon() },
            url = "https://messenger.com/"
        ),
        Icon(
            title = "Google",
            action = { GoogleIcon() },
            url = "https://www.google.com/"
        ),
        Icon(
            title = "Google Photo",
            action = { GooglePhotosIcon() },
            url = "https://photos.google.com/login"
        ),
        Icon(
            title = "Youtube",
            action = { YoutubeIcon() },
            url = "https://www.youtube.com/"
        ),
        Icon(
            title = "Google Voice",
            action = { GoogleVoiceSearchIcon() },
            url = "https://voice.google.com/"
        ),
        Icon(
            title = "StackOverFlow",
            action = { StackOverFlowIcon() },
            url = "https://stackoverflow.com/"
        ),
        Icon(
            title = "Spotify",
            action = { SpotifyIcon() },
            url = "https://open.spotify.com/"
        ),
    )
}