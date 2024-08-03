package com.example.wallet.domain

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.wallet.R
import com.example.wallet.data.CardItemsObject
import com.example.wallet.ui.theme.BlueEnd
import com.example.wallet.ui.theme.BlueStart
import com.example.wallet.ui.theme.GreenEnd
import com.example.wallet.ui.theme.GreenStart
import com.example.wallet.ui.theme.OrangeEnd
import com.example.wallet.ui.theme.OrangeStart
import com.example.wallet.ui.theme.PurpleEnd
import com.example.wallet.ui.theme.PurpleStart

fun getGradient(
    startColor: Color,
    endColor: Color
):Brush{
    return Brush.horizontalGradient(
        colors = listOf(startColor,endColor)
    )
}

val carditems = listOf<CardItemsObject>(
    CardItemsObject(
        logo = R.drawable.ic_visa,
        type = "Savings",
        Amount = "$6.37",
        Serial = "2356 0293 8340 2458",
        color = getGradient(PurpleStart, PurpleEnd)
    ),
    CardItemsObject(
        logo = R.drawable.ic_mastercard,
        type = "Business",
        Amount = "$2,345",
        Serial = "1234 5678 9012 3456",
        color = getGradient(BlueStart, BlueEnd)
    ),

    CardItemsObject(
        logo = R.drawable.ic_visa,
        type = "Credit",
        Amount = "$12,789",
        Serial = "9876 5432 1098 7654",
        color = getGradient(OrangeStart, OrangeEnd)
    ),

    CardItemsObject(
        logo = R.drawable.ic_mastercard,
        type = "Savings",
        Amount = "$563.92",
        Serial = "6543 2109 8765 4321",
        color = getGradient(GreenStart, GreenEnd)
    ),

)




