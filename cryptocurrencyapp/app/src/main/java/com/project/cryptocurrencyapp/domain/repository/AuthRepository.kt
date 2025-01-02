package com.project.cryptocurrencyapp.domain.repository

import com.project.cryptocurrencyapp.domain.model.User

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<User>
    suspend fun register(email: String, password: String): Result<User>
    suspend fun logout()
    fun getCurrentUser(): User?
}