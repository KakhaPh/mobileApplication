package com.project.cryptocurrencyapp.presentation.navigation

sealed class Routes(val routes: String) {
    data object SplashScreen : Routes("SplashScreen")
    data object FirstScreen : Routes("FirstScreen")
    data object SecondScreen : Routes("SecondScreen")
    data object LoginScreen : Routes("LoginScreen")
    data object RegisterScreen : Routes("RegisterScreen")
    data object CoinListScreen : Routes("CoinListScreen")
    data object CoinDetailScreen : Routes("CoinDetailScreen/{coinId}")

    // Helper function for creating the route with parameters
    fun CoinDetailScreen.createRoute(coinId: String): String {
        return "CoinDetailScreen/$coinId"
    }
}