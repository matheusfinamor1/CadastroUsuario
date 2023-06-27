package com.example.cadastrousuario.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ItemNameRegisterPreview() {
    var textName by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = textName,
        onValueChange = { textName = it },
        label = { Text("Name") }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ItemAgeRegisterPreview() {
    var textAge by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = textAge,
        onValueChange = { textAge = it },
        label = { Text("Age") }
    )
}

