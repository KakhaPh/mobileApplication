package com.project.homework_4.presentation.navigation

sealed class Routes(val routes: String) {
    data object FirstScreen : Routes("FirstScreen")
    data object SecondScreen : Routes("SecondScreen")
    data object SplashScreen : Routes("SplashScreen")
}