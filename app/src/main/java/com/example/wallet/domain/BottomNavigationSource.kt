package com.example.wallet.domain

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import com.example.wallet.data.BottomNavigationItemsObject

val items = listOf(
    BottomNavigationItemsObject(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigationItemsObject(
        title = "wallet",
        icon = Icons.Rounded.Wallet
    ),
    BottomNavigationItemsObject(
        title = "Notifications",
        icon = Icons.Rounded.Notifications
    ),
    BottomNavigationItemsObject(
        title = "Account",
        icon = Icons.Rounded.AccountCircle
    )
)