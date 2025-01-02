package com.project.cryptocurrencyapp.presentation.viewmodel

data class AuthState(
    val isLoading: Boolean = false,
    val isLoggedIn: Boolean = false,
    val isRegisteredIn: Boolean = false,
    val error: String? = null,
    val currentUser: String? = null
)