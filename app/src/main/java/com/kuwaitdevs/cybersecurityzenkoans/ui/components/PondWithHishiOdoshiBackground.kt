package com.kuwaitdevs.cybersecurityzenkoans.ui.components

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate


// too cute to delete hishi-odoshi
@Composable
fun PondWithHishiOdoshiBackground(modifier: Modifier = Modifier) {
    // Animation for the hishi-odoshi rocking
    val transition = rememberInfiniteTransition(label = "hishi-odoshi")
    val angle by transition.animateFloat(
        initialValue = -20f,
        targetValue = 25f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 3200
                -20f at 0
                25f at 1200 // fill
                25f at 1700 // pause
                -20f at 2200 // drop
                -20f at 3200
            },
            repeatMode = RepeatMode.Restart
        ),
        label = "hishi-odoshi-angle"
    )

    Box(modifier = modifier) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height

            // Draw pond (ellipse)
            drawOval(
                color = Color(0xFFB3E5FC),
                topLeft = androidx.compose.ui.geometry.Offset(w * 0.1f, h * 0.65f),
                size = androidx.compose.ui.geometry.Size(w * 0.8f, h * 0.25f)
            )
            // Draw pond highlights
            drawOval(
                color = Color(0x66FFFFFF),
                topLeft = androidx.compose.ui.geometry.Offset(w * 0.25f, h * 0.75f),
                size = androidx.compose.ui.geometry.Size(w * 0.5f, h * 0.08f)
            )

            // Draw stones around pond
            for (i in 0..5) {
                val angleStone = Math.PI * (0.7 + i * 0.12)
                val rx = (w * 0.4f * Math.cos(angleStone)).toFloat()
                val ry = (h * 0.12f * Math.sin(angleStone)).toFloat()
                drawOval(
                    color = Color(0xFF888888),
                    topLeft = androidx.compose.ui.geometry.Offset(w * 0.5f + rx - 24, h * 0.85f + ry - 12),
                    size = androidx.compose.ui.geometry.Size(48f, 24f)
                )
            }

            // Draw bamboo base (vertical support)
            drawRoundRect(
                color = Color(0xFFBCA869),
                topLeft = androidx.compose.ui.geometry.Offset(w * 0.68f, h * 0.52f),
                size = androidx.compose.ui.geometry.Size(16f, 80f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(8f, 8f)
            )

            // Draw hishi-odoshi (bamboo fountain, animated)
            val pivotX = w * 0.68f + 8f
            val pivotY = h * 0.52f + 16f
            rotate(angle, pivot = androidx.compose.ui.geometry.Offset(pivotX, pivotY)) {
                // Bamboo tube
                drawRoundRect(
                    color = Color(0xFFBCA869),
                    topLeft = androidx.compose.ui.geometry.Offset(pivotX - 12f, pivotY - 12f),
                    size = androidx.compose.ui.geometry.Size(120f, 24f),
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(12f, 12f)
                )
                // Tube end (cut)
                drawCircle(
                    color = Color(0xFF8D7B4B),
                    center = androidx.compose.ui.geometry.Offset(pivotX + 108f, pivotY),
                    radius = 14f
                )
                // Water drop (when at max angle)
                if (angle > 20f) {
                    drawCircle(
                        color = Color(0xFF2196F3),
                        center = androidx.compose.ui.geometry.Offset(pivotX + 120f, pivotY + 18f),
                        radius = 6f
                    )
                }
            }
        }
    }
}