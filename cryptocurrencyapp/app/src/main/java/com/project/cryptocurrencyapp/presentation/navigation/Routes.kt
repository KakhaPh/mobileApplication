package com.project.cryptocurrencyapp.presentation.navigation

sealed class Routes(val routes: String) {
    data object SplashScreen : Routes("SplashScreen")
    data object FirstScreen : Routes("FirstScreen")
    data object SecondScreen : Routes("SecondScreen")
    data object LoginScreen : Routes("LoginScreen")
    data object RegisterScreen : Routes("RegisterScreen")
}