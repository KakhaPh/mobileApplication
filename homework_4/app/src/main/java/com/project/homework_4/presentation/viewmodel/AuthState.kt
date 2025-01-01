package com.project.homework_4.presentation.viewmodel

data class AuthState(
    val isLoading: Boolean = false,
    val isLoggedIn: Boolean = false,
    val isRegisteredIn: Boolean = false,
    val error: String? = null,
    val currentUser: String? = null
)