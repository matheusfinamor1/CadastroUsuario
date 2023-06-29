package com.example.cadastrousuario.ui.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ItemNameRegisterPreview(modifier: Modifier = Modifier) {
    var textName by rememberSaveable {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = textName,
        onValueChange = { textName = it },
        label = { Text("Name") },
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ItemEmailRegisterPreview(modifier: Modifier = Modifier) {
    var textEmail by rememberSaveable {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = textEmail,
        onValueChange = { textEmail = it },
        label = { Text("Email") },
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemPasswordRegisterPreview(isPassword: Boolean, modifier: Modifier = Modifier) {
    var textPassword by rememberSaveable {
        mutableStateOf("")
    }
    var textConfirmPassword by rememberSaveable {
        mutableStateOf("")
    }

    if (isPassword) {
        OutlinedTextField(
            value = textPassword,
            onValueChange = { textPassword = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = modifier
        )
    } else {
        OutlinedTextField(
            value = textConfirmPassword,
            onValueChange = { textConfirmPassword = it },
            label = { Text("Confirm Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = modifier
        )
    }

}

