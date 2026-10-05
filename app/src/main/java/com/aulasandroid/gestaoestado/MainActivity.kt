package com.aulasandroid.gestaoestado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aulasandroid.gestaoestado.ui.theme.GestaoEstadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestaoEstadoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JurosScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun JurosScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Hello mobile!",
        modifier = modifier
    )
}