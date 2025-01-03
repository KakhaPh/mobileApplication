package com.project.cryptocurrencyapp.data.implemenatation

import com.project.cryptocurrencyapp.data.CoinPaprikaApi
import com.project.cryptocurrencyapp.data.dto.CoinDetailDto
import com.project.cryptocurrencyapp.data.dto.CoinDto
import com.project.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryIml @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}