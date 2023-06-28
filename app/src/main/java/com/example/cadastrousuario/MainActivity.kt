package com.example.cadastrousuario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.cadastrousuario.ui.components.screen.HomeScreen
import com.example.cadastrousuario.ui.theme.CadastroUsuarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    CadastroUsuarioTheme {
        Surface {
            HomeScreen()
        }
    }
}

