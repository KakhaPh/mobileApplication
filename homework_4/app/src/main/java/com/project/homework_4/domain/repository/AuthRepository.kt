package com.project.homework_4.domain.repository

import com.project.homework_4.domain.model.User

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<User>
    suspend fun register(email: String, password: String): Result<User>
    suspend fun logout()
    fun getCurrentUser(): User?
}