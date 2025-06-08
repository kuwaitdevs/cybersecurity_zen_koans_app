package com.kuwaitdevs.cybersecurityzenkoans.ui.components

import android.content.Context
import android.graphics.Bitmap
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect as ComposeRect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import com.kuwaitdevs.cybersecurityzenkoans.data.KoanWithExplanation
import com.kuwaitdevs.cybersecurityzenkoans.util.ShareUtil
import android.graphics.Rect
import android.view.PixelCopy
import android.app.Activity
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.text.style.TextAlign
import androidx.core.graphics.createBitmap
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import android.content.Intent
import android.net.Uri
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.TextButton
import androidx.compose.ui.res.stringResource
import com.kuwaitdevs.cybersecurityzenkoans.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZenKoanApp(
    modifier: Modifier,
    koanWithExplanation: KoanWithExplanation?,
    showAnimation: Boolean,
    showShakeMessage: Boolean
) {
    val context = LocalContext.current
    val view = LocalView.current

    var koanCardBounds by remember { mutableStateOf<ComposeRect?>(null) }
    var showAboutSheet by remember { mutableStateOf(false) }

    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                                MaterialTheme.colorScheme.background,
                                MaterialTheme.colorScheme.secondary.copy(alpha = 0.1f)
                            )
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AnimatedVisibility(
                    visible = !showAnimation,
                    enter = fadeIn(animationSpec = tween(500)),
                    exit = fadeOut(animationSpec = tween(300))
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        koanWithExplanation?.let {
                            KoanCard(
                                koanWithExplanation = it,
                                modifier = Modifier.onGloballyPositioned { layoutCoordinates ->
                                    koanCardBounds = layoutCoordinates.boundsInRoot()
                                }
                            )
                        }
                    }
                }

                if (showShakeMessage) {
                    Text(
                        text = "Shake your device for a new koan",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.padding(top = 24.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }

            if (!showShakeMessage) {
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(24.dp)
                ) {
                    KoanFab(
                        modifier = Modifier,
                        onShareClick = {
                            shareKoanCardAsImage(context, view, koanCardBounds, koanWithExplanation)
                        },
                        onAboutClick = {
                            showAboutSheet = true
                        },
                        onLoadClick = {
                            // Handle Load click
                        }
                    )
                }
            }

            // Replace ModalBottomSheet with AlertDialog for About
            if (showAboutSheet) {
                AlertDialog(
                    onDismissRequest = { showAboutSheet = false },
                    title = {
                        Text(
                            text = stringResource(R.string.cyber_security_zen_koan),
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.primary
                        )
                    },
                    text = {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Version: ${1}",
                                style = MaterialTheme.typography.bodyMedium,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    },
                    confirmButton = {
                        Button(
                            onClick = {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/kuwaitdevs/cybersecurity_zen_koans_app"))
                                context.startActivity(intent)
                            }
                        ) {
                            Text("Source Code")
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = { showAboutSheet = false }) {
                            Text("Close")
                        }
                    }
                )
            }
        }
    }
}

// Helper function to capture the currently displayed KoanCard as an image and share it
fun shareKoanCardAsImage(context: Context, rootView: View, koanCardBounds: ComposeRect?, koanWithExplanation: KoanWithExplanation?) {
    if (koanCardBounds == null) return

    // Get KoanCard bounds in window (in pixels)
    val left = koanCardBounds.left.toInt()
    val top = koanCardBounds.top.toInt()
    val width = koanCardBounds.width.toInt()
    val height = koanCardBounds.height.toInt()
    val rect = Rect(left, top, left + width, top + height)

    // Create a bitmap of the KoanCard area
    val bitmap = createBitmap(width, height)

    val activity = context as? Activity ?: return
    try {
        PixelCopy.request(
            activity.window,
            rect,
            bitmap,
            { copyResult ->
                if (copyResult == PixelCopy.SUCCESS) {
                    ShareUtil.shareKoanCardImage(context, bitmap, koanWithExplanation)
                }
            },
            Handler(Looper.getMainLooper())
        )
    } catch (e: Exception) {
        // fallback: draw cache of the whole rootView and crop
        rootView.isDrawingCacheEnabled = true
        val fullBitmap = Bitmap.createBitmap(rootView.drawingCache)
        rootView.isDrawingCacheEnabled = false
        val cropped = Bitmap.createBitmap(fullBitmap, left, top, width, height)
        ShareUtil.shareKoanCardImage(context, cropped, koanWithExplanation)
    }
}

@Composable
fun AboutSheetContent(onSourceClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(28.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Cyber Security Koan App",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Version: ${1}",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "Developed by Kuwait Devs",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = 8.dp)
        )
        Button(
            onClick = onSourceClick,
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text("Source Code")
        }
    }
}