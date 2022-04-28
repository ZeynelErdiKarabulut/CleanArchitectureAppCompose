package com.zerdi.data.remote.extensions

import com.zerdi.data.remote.model.Coin
import com.zerdi.data.remote.model.CoinDetail
import com.zerdi.domain.model.CoinDetailDto
import com.zerdi.domain.model.CoinDto

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        team = team
    )
}

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}