package com.project.cryptocurrencyapp.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.project.cryptocurrencyapp.ui.theme.backgroundColor
import com.project.cryptocurrencyapp.ui.theme.mainColor
import com.project.cryptocurrencyapp.ui.theme.whiteColor

@Composable
fun FirstScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Crypto Currency App",
            style = MaterialTheme.typography.headlineMedium,
            color = mainColor
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Button(
            onClick = {
                // Handle button click
            },
        ) {
            Text(
                text = "Second Screen",
                color = whiteColor // Set custom text color
            )
        }
    }
}
