package com.example.cadastrousuario.presentation.ui.components.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cadastrousuario.presentation.ui.components.ItemEmailRegisterPreview
import com.example.cadastrousuario.presentation.ui.components.ItemFABPreview
import com.example.cadastrousuario.presentation.ui.components.ItemNameRegisterPreview
import com.example.cadastrousuario.presentation.ui.components.ItemPasswordRegisterPreview

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 24.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxHeight()
                .fillMaxWidth()
        ) {

            Text(
                text = "Register",
                fontSize = 28.sp,
                fontWeight = FontWeight(400),
                modifier = Modifier.align(CenterHorizontally)
            )
            Spacer(modifier = Modifier.padding(top = 24.dp))
            ItemNameRegisterPreview(modifier = Modifier.align(CenterHorizontally))
            Spacer(modifier = Modifier.padding(top = 32.dp))
            ItemEmailRegisterPreview(modifier = Modifier.align(CenterHorizontally))
            Spacer(modifier = Modifier.padding(top = 32.dp))
            ItemPasswordRegisterPreview(true, modifier = Modifier.align(CenterHorizontally))
            Spacer(modifier = Modifier.padding(top = 32.dp))
            ItemPasswordRegisterPreview(
                false,
                modifier = Modifier
                    .align(CenterHorizontally)
                    .padding(bottom = 24.dp)
            )
        }
        ItemFABPreview()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    Surface {
        HomeScreen()
    }
}