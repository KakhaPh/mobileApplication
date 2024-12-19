package com.project.homework_4.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.project.homework_4.presentation.screens.FirstScreen
import com.project.homework_4.presentation.screens.LoginScreen
import com.project.homework_4.presentation.screens.RegisterScreen
import com.project.homework_4.presentation.screens.SecondScreen
import com.project.homework_4.presentation.screens.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SplashScreen.routes
    ) {
        composable(route = Routes.SplashScreen.routes) {
            SplashScreen(navController = navController)
        }

        composable(route = Routes.FirstScreen.routes) {
            FirstScreen(navController = navController)
        }

        composable(route = Routes.SecondScreen.routes) {
            SecondScreen(navController = navController)
        }

        composable(route = Routes.LoginScreen.routes) {
            LoginScreen(navController = navController)
        }

        composable(route = Routes.RegisterScreen.routes) {
            RegisterScreen(navController = navController)
        }
    }
}