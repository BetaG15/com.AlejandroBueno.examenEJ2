package com.example.examenejercicio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.examenejercicio2.ui.theme.ExamenEjercicio2Theme
import com.example.examenejercicio2.ui.theme.SelectorColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenEjercicio2Theme {
                SelectorColor()
            }
        }
    }
}