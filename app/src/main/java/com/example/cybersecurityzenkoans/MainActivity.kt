package com.example.cybersecurityzenkoans

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.cybersecurityzenkoans.ui.theme.CybersecurityZenKoansTheme
import com.example.cybersecurityzenkoans.ui.theme.MeditationBlue
import com.example.cybersecurityzenkoans.ui.theme.ZenGold
import kotlin.math.abs

class MainActivity : ComponentActivity(), SensorEventListener {

    private lateinit var sensorManager: SensorManager
    private var accelerometer: Sensor? = null
    private var lastUpdate: Long = 0
    private var lastX = 0.0f
    private var lastY = 0.0f
    private var lastZ = 0.0f
    private val SHAKE_THRESHOLD = 800

    // Current koan state with animation flag
    private var currentKoan by mutableStateOf("Shake to receive a Cybersecurity Zen Koan")
    private var showAnimation by mutableStateOf(false)

    // List of cybersecurity zen koans
    private val koans = listOf(
        "The strongest firewall is useless against a user who clicks 'Allow'.",
        "The best password is one that even you cannot remember, yet never forget.",
        "In the realm of cybersecurity, paranoia is not a disorder but a prerequisite.",
        "A secure system is not one that cannot be breached, but one that knows it has been breached.",
        "The hacker sees not a wall, but a door with a thousand locks, each waiting to be picked.",
        "The master makes their system secure by making it honest with itself about its vulnerabilities.",
        "Trust, but verify. Then verify again.",
        "The wisest security expert knows that perfect security does not exist.",
        "In cyberspace, what appears as a small crack can become the grand canyon.",
        "The enemy that you know is less dangerous than the vulnerability you don't.",
        "Security is not a product, but a process that walks alongside vigilance.",
        "A system is only as secure as its most careless user.",
        "Obscurity is not security, yet many confuse the shadow for the fortress.",
        "The code is only as secure as the weakest developer's understanding.",
        "When you encrypt your data, you do not protect it from theft, but from understanding."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize sensor manager and accelerometer
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        enableEdgeToEdge()
        setContent {
            CybersecurityZenKoansTheme {
                // Explicitly pass the current koan as state to ensure recomposition
                val currentKoanState = remember { mutableStateOf(currentKoan) }
                currentKoanState.value = currentKoan

                ZenKoanApp(
                    koan = currentKoanState.value,
                    showAnimation = showAnimation
                )
            }
        }
    }

    override fun onResume() {
        super.onResume()
        accelerometer?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(this)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event?.sensor?.type == Sensor.TYPE_ACCELEROMETER) {
            val currentTime = System.currentTimeMillis()
            if ((currentTime - lastUpdate) > 100) {
                val diffTime = currentTime - lastUpdate
                lastUpdate = currentTime

                val x = event.values[0]
                val y = event.values[1]
                val z = event.values[2]

                val speed = abs(x + y + z - lastX - lastY - lastZ) / diffTime * 10000

                if (speed > SHAKE_THRESHOLD) {
                    // Shake detected, show a new random koan with animation
                    showAnimation = true
                    currentKoan = koans.random()
                    Log.d("Shake", "Device shaken, new koan displayed: $currentKoan")

                    // Reset animation flag after a short delay
                    android.os.Handler(mainLooper).postDelayed({
                        showAnimation = false
                    }, 500)
                }

                lastX = x
                lastY = y
                lastZ = z
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        // Not needed for this implementation
    }
}

@Composable
fun ZenKoanApp(koan: String, showAnimation: Boolean) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Background gradient
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

            // Zen circle logo at the top
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 64.dp)
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(MeditationBlue),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_cyber_zen),
                    contentDescription = "Zen Cybersecurity Logo",
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                )
            }

            // Content
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Animated koan card
                AnimatedVisibility(
                    visible = !showAnimation,
                    enter = fadeIn(animationSpec = tween(500)),
                    exit = fadeOut(animationSpec = tween(300))
                ) {
                    // Use key to force recomposition when koan changes
                    Box(modifier = Modifier.fillMaxWidth()) {
                        KoanCard(koan = koan)
                    }
                }

                // Instructions text
                Text(
                    text = "Shake for wisdom",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(top = 24.dp)
                )
            }
        }
    }
}

@Composable
fun KoanCard(koan: String) {
    // For debugging
    Log.d("KoanCard", "Displaying koan: $koan")

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.9f),
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Divider with zen symbol
            Text(
                text = "☯",
                style = MaterialTheme.typography.headlineLarge,
                color = ZenGold,
            )

            // Koan text
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        fontWeight = FontWeight.Bold
                    )) {
                        append(""")
                    }
                    withStyle(style = SpanStyle(
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )) {
                        append(koan)
                    }
                    withStyle(style = SpanStyle(
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        fontWeight = FontWeight.Bold
                    )) {
                        append(""")
                    }
                },
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            // Divider with zen symbol
            Text(
                text = "☯",
                style = MaterialTheme.typography.headlineLarge,
                color = ZenGold,
            )
        }
    }
}