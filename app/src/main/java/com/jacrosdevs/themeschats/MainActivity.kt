package com.jacrosdevs.themeschats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.jacrosdevs.themeschats.enums.Themes
import com.jacrosdevs.themeschats.ui.apptheme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var themeSelected by rememberSaveable { mutableStateOf<Themes>(Themes.GREEN) }
            AppTheme(theme = themeSelected) {
                ChatScreen(changeTheme = {
                    themeSelected = it
                })
            }
        }
    }
}

