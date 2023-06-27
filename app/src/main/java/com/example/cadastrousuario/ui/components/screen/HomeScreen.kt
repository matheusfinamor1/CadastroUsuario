package com.example.cadastrousuario.ui.components.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cadastrousuario.ui.components.ItemAgeRegisterPreview
import com.example.cadastrousuario.ui.components.ItemNameRegisterPreview

@Composable
fun HomeScreen() {
    Column(modifier = Modifier) {
        ItemNameRegisterPreview()
        ItemAgeRegisterPreview()
    }
}