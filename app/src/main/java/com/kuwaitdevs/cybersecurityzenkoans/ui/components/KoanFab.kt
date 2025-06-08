package com.kuwaitdevs.cybersecurityzenkoans.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.kuwaitdevs.cybersecurityzenkoans.R

@Composable
fun KoanFab(
    modifier: Modifier,
    onShareClick: () -> Unit,
    onAboutClick: () -> Unit,
    onLoadClick: () -> Unit
){
    var bottomMenuExpanded = remember { mutableStateOf(false) }

    Box(
        modifier
    ) {
        FloatingActionButton(
            onClick = { bottomMenuExpanded.value = !bottomMenuExpanded.value },
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            elevation = FloatingActionButtonDefaults.elevation(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = stringResource(R.string.menu)
            )
        }

        DropdownMenu(
            expanded = bottomMenuExpanded.value,
            onDismissRequest = { bottomMenuExpanded.value = false },
            properties = PopupProperties(focusable = true),
            modifier = Modifier.padding(bottom = 10.dp)
        ) {
            DropdownMenuItem(
                text = { Text("Share") },
                onClick = {
                    bottomMenuExpanded.value = false
                    onShareClick()
                }
            )
            DropdownMenuItem(
                text = { Text(stringResource(R.string.about)) },
                onClick = {
                    bottomMenuExpanded.value = false
                    onAboutClick()
                }
            )
//            DropdownMenuItem(
//                text = { Text(stringResource(R.string.load_sczk)) },
//                onClick = {
//                    bottomMenuExpanded.value = false
//                    onLoadClick()
//                }
//            )
        }
    }
}