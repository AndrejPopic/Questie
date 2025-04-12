package com.example.questie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Quests",
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray,
        )
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(10) { index ->
                QuestsRow(displayText = "Quest $index")
            }
        }
    }
}

@Composable
fun QuestsRow(
    displayText: String,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.1f)
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .background(color = Color.Yellow)
    ) {
        Row(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        ) {
            Text(
                modifier = Modifier.fillMaxSize(0.9f),
                text = displayText,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
            )
            Text(
                text = "->",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
            )
        }
    }

}