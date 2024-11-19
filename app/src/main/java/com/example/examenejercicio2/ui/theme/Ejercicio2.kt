package com.example.examenejercicio2.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SelectorColor() {
    var colorSeleccionado by remember { mutableStateOf(Color.Transparent) }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        ListadoColores(colores = listOf(Color.Red, Color.Green, Color.Blue, Color.Yellow, Color.Cyan))
        { color ->
            colorSeleccionado = color
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(colorSeleccionado)
        ) {

           }
    }
}

@Composable
fun ListadoColores(colores: List<Color>, colorSeleccion: (Color) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        colores.forEach { color ->
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color)
                    .clickable { colorSeleccion(color) }
            )
        }
    }
}

