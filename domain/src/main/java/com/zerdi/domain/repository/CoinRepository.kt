package com.zerdi.domain.repository

import com.zerdi.domain.model.CoinDetailDto
import com.zerdi.domain.model.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}