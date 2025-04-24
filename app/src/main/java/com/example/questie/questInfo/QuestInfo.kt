package com.example.questie.questInfo

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.questie.R
import settings.view_Model.SettingsViewModel

@Composable
fun QuestInfo(
    navController: NavHostController,
    settingsViewModel: SettingsViewModel = viewModel()
) {
    val selectedIcon by remember { settingsViewModel.selectedIcon }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.9f)
            .background(color = Color.White)
            .padding(start = 36.dp, end = 36.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.2f)
                .padding(top = 64.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = null,
                modifier = Modifier
                    .height(32.dp)
                    .width(32.dp)
                    .align(Alignment.TopStart)
                    .clickable(
                        onClick = {
                            navController.navigate("homeScreen")
                        }
                    ),
            )
            Icon(
                painter = painterResource(id = selectedIcon),
                contentDescription = null,
                modifier = Modifier
                    .height(32.dp)
                    .width(32.dp)
                    .align(Alignment.TopEnd)
                    .clickable(
                        onClick = {
                            navController.navigate("settings")
                        }
                    ),
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .background(color = Color.LightGray),
            contentAlignment = Alignment.Center

        ) {
            Text(
                text = "Quest name text",
            )
        }
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            color = Color.Black
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
                .background(color = Color.LightGray)
        ) {
            Text(
                text = "Quest Details text",
            )
        }
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            color = Color.Black
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.2f)
                .background(color = Color.LightGray),
        ) {
            Text(
                text = "Quest reward/penalty: text",
            )
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Request approval", color = Color.White)
        }
    }
}
