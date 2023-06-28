package com.example.cadastrousuario.ui.components.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cadastrousuario.ui.components.ItemEmailRegisterPreview
import com.example.cadastrousuario.ui.components.ItemNameRegisterPreview
import com.example.cadastrousuario.ui.components.ItemPasswordRegisterPreview

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Register",
            fontSize = 28.sp,
            fontWeight = FontWeight(400)
        )
        Spacer(modifier = Modifier.padding(top = 24.dp))
        ItemNameRegisterPreview()
        Spacer(modifier = Modifier.padding(top = 32.dp))
        ItemEmailRegisterPreview()
        Spacer(modifier = Modifier.padding(top = 32.dp))
        ItemPasswordRegisterPreview(true)
        Spacer(modifier = Modifier.padding(top = 32.dp))
        ItemPasswordRegisterPreview(false)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    Surface {
        HomeScreen()
    }
}