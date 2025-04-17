package com.example.questie.familyTree.view_model

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.questie.R

@Composable
fun FamilyTree(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.ic_user),
                contentDescription = null,
                modifier = Modifier
                    .height(32.dp)
                    .width(32.dp)
                    .align(Alignment.TopStart)
                    .clickable(
                        onClick = {
                            navController.navigate("settings")
                        }
                    ),
            )
        }
        Text(
            text = "Parents",
            style = MaterialTheme.typography.bodySmall,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 24.dp)
        )
        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)) {
            items(7) { index ->
                FamilyRow(title = "Parent $index")
            }
        }
        Text(
            text = "Children",
            style = MaterialTheme.typography.bodySmall,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 24.dp, top = 24.dp)
        )
        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()) {
            items(12) { index ->
                FamilyRow(title = "Child $index")
            }
        }
    }
}

@Composable
fun FamilyRow(
    title: String,
    action: () -> Unit = {},
) {
    Row(
        modifier = Modifier
            .clickable { action() }
            .defaultMinSize(minHeight = 55.dp)
            .height(IntrinsicSize.Min)
    ) {

        Row(
            modifier = Modifier
                .weight(0.85F)
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                color = Color.Black,
                fontSize = 15.sp,
                fontWeight = FontWeight(600)
            )
        }

        Box(
            modifier = Modifier
                .weight(0.15F)
                .fillMaxHeight(),
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = null,
                modifier = Modifier
                    .height(28.dp)
                    .width(28.dp)
                    .align(Alignment.CenterEnd),
            )
        }
    }

    HorizontalDivider(
        color = MaterialTheme.colorScheme.onTertiaryContainer
    )
}
