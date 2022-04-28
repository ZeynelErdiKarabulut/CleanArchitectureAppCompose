package com.zerdi.cleanarchitectureappcompose.presentation.coin_list

import com.zerdi.data.remote.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
