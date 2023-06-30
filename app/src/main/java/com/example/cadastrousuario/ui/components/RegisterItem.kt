package com.example.cadastrousuario.ui.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private var textName: String = ""
private var textEmail: String = ""
private var password: String = ""
private var passwordConfirm: String = ""


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemNameRegisterPreview(modifier: Modifier = Modifier) {
    var itemTextName by rememberSaveable {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = itemTextName,
        onValueChange = { itemTextName = it },
        label = { Text("Nome") },
        modifier = modifier
    )
    textName = itemTextName
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ItemEmailRegisterPreview(modifier: Modifier = Modifier) {
    var itemTextEmail by rememberSaveable {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = itemTextEmail,
        onValueChange = { itemTextEmail = it },
        label = { Text("Email") },
        modifier = modifier
    )
    textEmail = itemTextEmail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemPasswordRegisterPreview(isPassword: Boolean, modifier: Modifier = Modifier) {
    var itemTextPassword by rememberSaveable {
        mutableStateOf("")
    }
    var itemTextConfirmPassword by rememberSaveable {
        mutableStateOf("")
    }

    if (isPassword) {
        OutlinedTextField(
            value = itemTextPassword,
            onValueChange = { itemTextPassword = it },
            label = { Text("Senha") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = modifier
        )
        password = itemTextPassword
    } else {
        OutlinedTextField(
            value = itemTextConfirmPassword,
            onValueChange = { itemTextConfirmPassword = it },
            label = { Text("Confirme a senha") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = modifier
        )
        passwordConfirm = itemTextConfirmPassword
    }


}

@Preview(showBackground = true)
@Composable
fun ItemFABPreview() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 24.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        FloatingActionButton(
            onClick = {
                verifyPasswordField(context)
            },
            modifier = Modifier
                .align(alignment = Alignment.BottomEnd)
                .padding(all = 24.dp)
        ) {
            Icon(imageVector = Icons.Filled.Check, contentDescription = null)
        }
    }
}

fun verifyPasswordField(context: Context) {
    if (password.isBlank()
        || passwordConfirm.isBlank()
        || textName.isBlank()
        || textEmail.isBlank()
    ) {
        Toast.makeText(context, "Há campo(s) vazio(s)!", Toast.LENGTH_LONG).show()
    } else if (password != passwordConfirm) {
        Toast.makeText(context, "Senhas diferentes!", Toast.LENGTH_LONG).show()
    } else {
        Toast.makeText(context, "Cadastro feito com sucesso!", Toast.LENGTH_LONG).show()
    }
}


