package settings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.questie.R
import components.QuestsRow

@Composable
fun SettingsScreen(
    navController: NavHostController
) {
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
                    .align(Alignment.TopCenter)
                    .clickable(
                        onClick = {
                            navController.navigate("settings")
                        }
                    ),
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(6) { index ->
                QuestsRow(title = "Screen $index")
            }
        }
    }
}