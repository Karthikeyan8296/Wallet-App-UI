package com.example.wallet.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.wallet.domain.items

@Composable
fun BottomNavigationBar() {

    NavigationBar {

        Row(modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)) {

            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(text = item.title, color = MaterialTheme.colorScheme.onBackground)
                    }
                )
            }
        }
    }
}