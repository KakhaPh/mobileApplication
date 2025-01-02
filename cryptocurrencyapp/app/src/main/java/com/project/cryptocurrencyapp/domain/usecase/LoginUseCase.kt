package com.project.cryptocurrencyapp.domain.usecase

import com.project.cryptocurrencyapp.domain.model.User
import com.project.cryptocurrencyapp.domain.repository.AuthRepository

class LoginUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(email: String, password: String): Result<User> =
        repository.login(email, password)
}