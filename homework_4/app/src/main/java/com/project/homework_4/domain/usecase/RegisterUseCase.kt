package com.project.homework_4.domain.usecase

import com.project.homework_4.domain.model.User
import com.project.homework_4.domain.repository.AuthRepository

class RegisterUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(email: String, password: String): Result<User> =
        repository.register(email, password)
}