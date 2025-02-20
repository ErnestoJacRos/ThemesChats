package com.jacrosdevs.themeschats.ui.apptheme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.jacrosdevs.themeschats.enums.Themes
import com.jacrosdevs.themeschats.ui.apptheme.themes.Green.darkGreenScheme
import com.jacrosdevs.themeschats.ui.apptheme.themes.Green.lightGreenScheme
import com.jacrosdevs.themeschats.ui.apptheme.themes.Ocean.darkOceanScheme
import com.jacrosdevs.themeschats.ui.apptheme.themes.Ocean.lightOceanScheme
import com.jacrosdevs.themeschats.ui.apptheme.themes.sunset.darkSunsetScheme
import com.jacrosdevs.themeschats.ui.apptheme.themes.sunset.lightSunsetScheme


//@RequiresApi(Build.VERSION_CODES.S) si dejamos esta anotacion ninguna perosna que no tenga
// api 31 no podra descar la app, se hace una validadcio
//
@Composable
fun AppTheme(
    //elegir un tema Green, Oceanm Suntset
    theme: Themes,
    //soloaplica para versines 12 de android
    //Api 31+
    isDynamiccolor: Boolean = false,
    isDarkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    // TODO: set colorScheme
    val colors: ColorScheme

    if (isDynamiccolor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {

        val contextLocal = LocalContext.current
        colors = if (isDarkMode) dynamicDarkColorScheme(contextLocal) else dynamicLightColorScheme(
            contextLocal
        )
    } else {
        colors = when(theme) {
            Themes.GREEN -> if (isDarkMode) darkGreenScheme else lightGreenScheme
            Themes.OCEAN -> if (isDarkMode) darkOceanScheme else lightOceanScheme
            Themes.SUNSET -> if (isDarkMode) darkSunsetScheme else lightSunsetScheme

        }
    }

    // TODO: set typography


    MaterialTheme(
        colorScheme = colors,
        content = content
    )

}