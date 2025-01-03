package com.project.cryptocurrencyapp.domain.usecase

import com.project.cryptocurrencyapp.common.Resource
import com.project.cryptocurrencyapp.data.dto.toCoin
import com.project.cryptocurrencyapp.domain.model.Coin
import com.project.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke() : Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "an unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<List<Coin>>("Couldn't connect! Check your internet connection!"))
        }
    }
}