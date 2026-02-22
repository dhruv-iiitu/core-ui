/**
 * Created by Dhruv Sharma
 * Date: 22/02/26
 */

package com.dhruv.coreui.theme


import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class CoreColorScheme(
    val primary: Color,
    val onPrimary: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val success: Color,
    val error: Color,
    val warning: Color
)

val LightCoreColors = CoreColorScheme(
    primary = CoreColors.Primary,
    onPrimary = CoreColors.White,
    background = CoreColors.White,
    onBackground = CoreColors.Gray900,
    surface = CoreColors.Gray200,
    onSurface = CoreColors.Gray900,
    success = CoreColors.Success,
    error = CoreColors.Error,
    warning = CoreColors.Warning
)

val DarkCoreColors = CoreColorScheme(
    primary = CoreColors.PrimaryDark,
    onPrimary = CoreColors.White,
    background = CoreColors.Black,
    onBackground = CoreColors.White,
    surface = CoreColors.Gray900,
    onSurface = CoreColors.White,
    success = CoreColors.Success,
    error = CoreColors.Error,
    warning = CoreColors.Warning
)