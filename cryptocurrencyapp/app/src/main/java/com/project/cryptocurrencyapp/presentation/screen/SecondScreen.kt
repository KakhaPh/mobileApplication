package com.project.cryptocurrencyapp.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.project.cryptocurrencyapp.presentation.navigation.Routes
import com.project.cryptocurrencyapp.ui.theme.mainColor
import com.project.cryptocurrencyapp.ui.theme.whiteColor

@Composable
fun SecondScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Second Screen",
            style = MaterialTheme.typography.headlineMedium,
            color = mainColor
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.popBackStack()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = mainColor,
                contentColor = whiteColor
            )
        ) {
            Text("Go Back")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(Routes.LoginScreen.routes)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = mainColor,
                contentColor = whiteColor
            )
        ) {
            Text("Go to Login")
        }
    }
}