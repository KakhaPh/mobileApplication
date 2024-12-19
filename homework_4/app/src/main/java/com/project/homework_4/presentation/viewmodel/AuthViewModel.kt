package com.project.homework_4.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.project.homework_4.domain.usecase.LoginUseCase
import com.project.homework_4.domain.usecase.RegisterUseCase
import kotlinx.coroutines.launch

class AuthViewModel(
    private val loginUseCase: LoginUseCase,
    private val registerUseCase: RegisterUseCase
) : ViewModel() {

    var state by mutableStateOf(AuthState())
        private set

    fun login(email: String, password: String) {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true,
                error = null
            )

            try {
                loginUseCase(email, password)
                    .onSuccess {
                        state = state.copy(
                            isLoading = false,
                            isLoggedIn = true,
                            error = null
                        )
                    }
                    .onFailure { exception ->
                        state = state.copy(
                            isLoading = false,
                            error = exception.message ?: "Unknown error occurred"
                        )
                    }
            } catch (e: Exception) {
                state = state.copy(
                    isLoading = false,
                    error = e.message ?: "Unknown error occurred"
                )
            }
        }
    }

    fun register(email: String, password: String) {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true,
                error = null
            )

            try {
                registerUseCase(email, password)
                    .onSuccess {
                        state = state.copy(
                            isLoading = false,
                            isLoggedIn = true,
                            error = null
                        )
                    }
                    .onFailure { exception ->
                        state = state.copy(
                            isLoading = false,
                            error = exception.message ?: "Unknown error occurred"
                        )
                    }
            } catch (e: Exception) {
                state = state.copy(
                    isLoading = false,
                    error = e.message ?: "Unknown error occurred"
                )
            }
        }
    }

    fun clearError() {
        state = state.copy(error = null)
    }
}