package com.example.wallet.data

import androidx.compose.ui.graphics.vector.ImageVector

data class CurrenciesListObject(
    val icon: ImageVector,
    val currency: String,
    val buy: Float,
    val sell: Float
)
