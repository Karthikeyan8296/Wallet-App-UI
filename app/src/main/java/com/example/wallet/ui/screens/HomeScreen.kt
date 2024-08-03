package com.example.wallet.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wallet.ui.components.BottomNavigationBar
import com.example.wallet.ui.components.CardSection
import com.example.wallet.ui.components.CurrenciesSection
import com.example.wallet.ui.components.FinanceSection
import com.example.wallet.ui.components.TopBarSection

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }

    ) {
        Column(modifier = Modifier.fillMaxSize().padding(it)) {

            TopBarSection()
            CardSection()
            Spacer(modifier = Modifier.height(28.dp))
            FinanceSection()
            Spacer(modifier = Modifier.height(28.dp))
            CurrenciesSection()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}