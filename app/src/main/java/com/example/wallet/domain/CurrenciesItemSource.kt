package com.example.wallet.domain

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyBitcoin
import androidx.compose.material.icons.rounded.CurrencyExchange
import androidx.compose.material.icons.rounded.CurrencyLira
import androidx.compose.material.icons.rounded.CurrencyPound
import androidx.compose.material.icons.rounded.CurrencyRuble
import androidx.compose.material.icons.rounded.CurrencyRupee
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import com.example.wallet.data.CurrenciesListObject

val CurrenciesList = listOf<CurrenciesListObject>(
    CurrenciesListObject(
        currency = "USD",
        buy = 27.53f,
        sell = 27.4f,
        icon = Icons.Rounded.AttachMoney
    ),
    CurrenciesListObject(
        currency = "EUR",
        buy = 32.45f,
        sell = 32.3f,
        icon = Icons.Rounded.Euro
    ),
    CurrenciesListObject(
        currency = "GBP",
        buy = 37.75f,
        sell = 37.6f,
        icon = Icons.Rounded.CurrencyPound
    ),
    CurrenciesListObject(
        currency = "JPY",
        buy = 0.25f,
        sell = 0.24f,
        icon = Icons.Rounded.CurrencyYen
    ),
    CurrenciesListObject(
        currency = "AUD",
        buy = 20.11f,
        sell = 20.0f,
        icon = Icons.Rounded.CurrencyLira
    ),
    CurrenciesListObject(
        currency = "CAD",
        buy = 21.89f,
        sell = 21.7f,
        icon = Icons.Rounded.CurrencyRuble
    ),
    CurrenciesListObject(
        currency = "CHF",
        buy = 29.67f,
        sell = 29.5f,
        icon = Icons.Rounded.CurrencyYen
    ),
    CurrenciesListObject(
        currency = "CNY",
        buy = 4.25f,
        sell = 4.2f,
        icon = Icons.Rounded.CurrencyExchange
    ),
    CurrenciesListObject(
        currency = "INR",
        buy = 0.36f,
        sell = 0.35f,
        icon = Icons.Rounded.CurrencyRupee
    ),
    CurrenciesListObject(
        currency = "BRL",
        buy = 5.32f,
        sell = 5.25f,
        icon = Icons.Rounded.CurrencyBitcoin
    ),
    CurrenciesListObject(
        currency = "ZAR",
        buy = 1.52f,
        sell = 1.5f,
        icon = Icons.Rounded.AttachMoney
    )

)