package com.example.mobileapplication

import android.os.Bundle
import android.util.Patterns
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileapplication.ui.theme.MobileApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    loginPage()
                }
            }
        }
    }
}

@Composable
fun loginPage() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("ელ.ფოსტა") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = password,
            onValueChange = {password = it},
            label = { Text("პაროლი") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                message = if(validateInputs(email, password)) {
                    "წარმატებული მცდელობა!"
                } else {
                    "წარუმატებელი მცდელობა!"
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("შესვლა")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = message,
            color = if(message == "წარმატებული მცდელობა!") {
                MaterialTheme.colorScheme.primary
            } else {
                MaterialTheme.colorScheme.error
            }
        )
    }
}

fun validateInputs(email: String, password: String):Boolean {
    return email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length >= 6
}

@Preview(showBackground = true)
@Composable
fun loginPagePreview() {
    MobileApplicationTheme {
        loginPage();
    }
}