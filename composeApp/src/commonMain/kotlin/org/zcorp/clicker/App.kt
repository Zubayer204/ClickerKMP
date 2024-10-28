package org.zcorp.clicker

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import clicker.composeapp.generated.resources.Res
import clicker.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var totalClicked by mutableStateOf(0)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(50, 50, 55)),
                contentAlignment = Alignment.Center,
        ) {
            // Button with onClick that increments totalClicked variable
            Button(
                onClick = { totalClicked++ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent,
                    contentColor = Color.Transparent,
                ),
                elevation = null,
                modifier = Modifier.fillMaxSize(),
            ) {
                Text(
                    totalClicked.toString(),
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    color = Color.White,
                )
            }
        }
    }
}