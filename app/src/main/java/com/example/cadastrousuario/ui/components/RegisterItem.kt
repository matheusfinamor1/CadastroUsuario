package com.example.cadastrousuario.ui.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
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
fun ItemEmailRegisterPreview() {
    var textEmail by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = textEmail,
        onValueChange = { textEmail = it },
        label = { Text("Email") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemPasswordRegisterPreview(isPassword: Boolean) {
    var textPassword by remember {
        mutableStateOf("")
    }
    var textConfirmPassword by remember {
        mutableStateOf("")
    }

    if(isPassword) {
        OutlinedTextField(
            value = textPassword,
            onValueChange = { textPassword = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
        )
    }else{
        OutlinedTextField(
            value = textConfirmPassword,
            onValueChange = { textConfirmPassword = it },
            label = { Text("Confirm Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
        )
    }

}

