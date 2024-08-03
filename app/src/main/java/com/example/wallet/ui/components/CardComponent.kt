package com.example.wallet.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wallet.data.CardItemsObject
import com.example.wallet.ui.theme.CardText

@Composable
fun CardComponent(cardData: CardItemsObject) {

    Box(modifier = Modifier.padding(start = 16.dp)) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(24.dp))
                .background(cardData.color)
                .width(250.dp)
                .height(160.dp)
                .clickable { }
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.SpaceBetween
        )
        {
            Image(
                painter = painterResource(id = cardData.logo),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = cardData.type,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.CardText
                ),
            )
            Text(
                text = cardData.Amount,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.CardText
                ),
            )
            Text(
                text = cardData.Serial,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.CardText
                ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardComponentPreview() {

}