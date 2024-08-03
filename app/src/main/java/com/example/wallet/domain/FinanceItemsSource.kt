package com.example.wallet.domain

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Analytics
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.Savings
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.ui.graphics.Color
import com.example.wallet.data.FinanceListObject
import com.example.wallet.ui.theme.BlueStart
import com.example.wallet.ui.theme.GreenStart
import com.example.wallet.ui.theme.OrangeStart
import com.example.wallet.ui.theme.PurpleStart

val financeList = listOf<FinanceListObject>(
    FinanceListObject(
        icon = Icons.Rounded.StarHalf,
        title = "My\nBusiness",
        IconContainer = OrangeStart
    ),
    FinanceListObject(
        icon = Icons.Rounded.Wallet,
        title = "My\nWallet",
        IconContainer = BlueStart
    ),
    FinanceListObject(
        icon = Icons.Rounded.Analytics,
        title = "Finance\nAnalysis",
        IconContainer = PurpleStart
    ),
    FinanceListObject(
        icon = Icons.Rounded.MonetizationOn,
        title = "My\nTransaction",
        IconContainer = Color.Red
    ),
    FinanceListObject(
        icon = Icons.Rounded.Savings,
        title = "My\nSavings",
        IconContainer = GreenStart
    )
)