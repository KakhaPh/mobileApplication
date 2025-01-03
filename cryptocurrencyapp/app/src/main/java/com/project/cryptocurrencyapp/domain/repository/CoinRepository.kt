package com.project.cryptocurrencyapp.domain.repository

import com.project.cryptocurrencyapp.data.dto.CoinDetailDto
import com.project.cryptocurrencyapp.data.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}