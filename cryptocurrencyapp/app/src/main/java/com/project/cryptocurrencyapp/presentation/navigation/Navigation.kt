package com.project.cryptocurrencyapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.project.cryptocurrencyapp.presentation.screen.FirstScreen
import com.project.cryptocurrencyapp.presentation.screen.LoginScreen
import com.project.cryptocurrencyapp.presentation.screen.RegisterScreen
import com.project.cryptocurrencyapp.presentation.screen.SecondScreen
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
        composable (route = Routes.SecondScreen.routes) {
            SecondScreen(navController = navController)
        }
        composable (route = Routes.LoginScreen.routes) {
            LoginScreen(navController = navController)
        }
        composable (route = Routes.RegisterScreen.routes) {
            RegisterScreen(navController = navController)
        }
    }
}