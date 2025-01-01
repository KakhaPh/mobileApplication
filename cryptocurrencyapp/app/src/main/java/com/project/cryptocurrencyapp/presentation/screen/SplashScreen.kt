package com.project.cryptocurrencyapp.presentation.screen

import android.window.SplashScreen
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.project.cryptocurrencyapp.presentation.navigation.Routes
import com.project.cryptocurrencyapp.ui.theme.mainColor
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(2000L)
        navController.navigate(Routes.FirstScreen.routes) {
            popUpTo(Routes.SplashScreen.routes) { inclusive = true}
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Crypto Currency App",
            style = MaterialTheme.typography.headlineMedium,
            color = mainColor
        )
    }
}