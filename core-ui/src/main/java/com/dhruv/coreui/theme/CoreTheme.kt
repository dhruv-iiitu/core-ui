/**
 * Created by Dhruv Sharma
 * Date: 22/02/26
 */

package com.dhruv.coreui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*

private val LocalCoreColors = staticCompositionLocalOf {
    LightCoreColors
}

object CoreTheme {
    val colors: CoreColorScheme
        @Composable
        get() = LocalCoreColors.current
}

@Composable
fun CoreTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkCoreColors else LightCoreColors

    CompositionLocalProvider(
        LocalCoreColors provides colors
    ) {
        MaterialTheme {
            content()
        }
    }
}