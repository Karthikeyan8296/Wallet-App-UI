package com.example.wallet.ui.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.wallet.domain.carditems

@Composable
fun CardSection(modifier: Modifier = Modifier) {
    LazyRow {
        items(carditems){cardData->
            CardComponent(cardData)
        }
    }
}