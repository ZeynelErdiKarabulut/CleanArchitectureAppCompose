package com.zerdi.data.remote.repository

import com.zerdi.data.remote.api.CoinPaprikaApi
import com.zerdi.domain.model.CoinDetailDto
import com.zerdi.domain.model.CoinDto
import com.zerdi.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}