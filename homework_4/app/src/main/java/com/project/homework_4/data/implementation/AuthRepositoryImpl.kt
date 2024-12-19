package com.project.homework_4.data.implementation

import com.google.firebase.auth.FirebaseAuth
import com.project.homework_4.domain.model.User
import com.project.homework_4.domain.repository.AuthRepository
import kotlinx.coroutines.tasks.await

class AuthRepositoryImpl(
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
): AuthRepository {
    override suspend fun login(email: String, password: String): Result<User> = try {
        val result = auth.signInWithEmailAndPassword(email, password).await()
        result.user?.let { firebaseUser ->
            Result.success(User(firebaseUser.uid, firebaseUser.email ?: ""))
        } ?: Result.failure(Exception("Login failed"))
    } catch (e: Exception) {
        Result.failure(e)
    }

    override suspend fun register(email: String, password: String): Result<User> = try {
        val result = auth.createUserWithEmailAndPassword(email, password).await()
        result.user?.let { firebaseUser ->
            Result.success(User(firebaseUser.uid, firebaseUser.email ?: ""))
        } ?: Result.failure(Exception("Registration failed"))
    } catch (e: Exception) {
        Result.failure(e)
    }

    override suspend fun logout() {
        auth.signOut()
    }

    override fun getCurrentUser(): User? {
        return auth.currentUser?.let { User(it.uid, it.email ?: "") }
    }
}