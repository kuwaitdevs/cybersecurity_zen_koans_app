package com.kuwaitdevs.cybersecurityzenkoans.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val ZenDarkColorScheme = darkColorScheme(
    primary = SaffronDark,
    onPrimary = LotusWhite,
    primaryContainer = DeepMaroon,
    onPrimaryContainer = LotusWhite,
    secondary = TealDark,
    onSecondary = LotusWhite,
    secondaryContainer = MeditationBlue,
    onSecondaryContainer = LotusWhite,
    tertiary = GoldDark,
    onTertiary = MeditationBlue,
    background = MeditationBlue,
    onBackground = LotusWhite,
    surface = PurpleDark,
    onSurface = LotusWhite
)

private val ZenLightColorScheme = lightColorScheme(
    primary = SaffronOrange,
    onPrimary = LotusWhite,
    primaryContainer = SaffronLight,
    onPrimaryContainer = DeepMaroon,
    secondary = PeacefulTeal,
    onSecondary = LotusWhite,
    secondaryContainer = TealLight,
    onSecondaryContainer = MeditationBlue,
    tertiary = ZenGold,
    onTertiary = DeepMaroon,
    background = LotusWhite,
    onBackground = MeditationBlue,
    surface = PurpleLight,
    onSurface = WisdomPurple
)

@Composable
fun CybersecurityZenKoansTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false, // Disable dynamic color to use our custom Buddha theme
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> ZenDarkColorScheme
        else -> ZenLightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}