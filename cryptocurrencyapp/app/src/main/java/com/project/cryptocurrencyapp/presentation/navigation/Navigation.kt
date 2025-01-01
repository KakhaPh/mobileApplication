package com.project.cryptocurrencyapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.project.cryptocurrencyapp.presentation.screen.FirstScreen
import com.project.cryptocurrencyapp.presentation.screen.SplashScreen

@Composable
fun Navigation() {
    val  navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SplashScreen.routes
    ) {
        composable (route = Routes.SplashScreen.routes) {
            SplashScreen(navController = navController)
        }
        composable (route = Routes.FirstScreen.routes) {
            FirstScreen(navController = navController)
        }
    }
}