package settings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.questie.R
import components.QuestsRow
import settings.view_Model.SettingsViewModel

@Composable
fun SettingsScreen(
    navController: NavHostController,
    settingsViewModel: SettingsViewModel = viewModel()
) {
    val iconList = listOf(
        R.drawable.ic_user, // jesus
//        R.drawable.ic_home, // black male yellow hair
//        R.drawable.ic_family_tree, // white male yellow hair
//        R.drawable.ic_quest_report, // black female yellow hair
//        R.drawable.ic_user, // white female yellow hair
//        R.drawable.ic_home, // black male black hair
//        R.drawable.ic_family_tree, // white male black hair
//        R.drawable.ic_quest_report, // black female black hair
//        R.drawable.ic_user, // white female black hair
        R.drawable.ic_boy,
        R.drawable.ic_girl,
        R.drawable.ic_user,
    )

    val selectedIcon by settingsViewModel.selectedIcon

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.9f)
            .background(color = Color.White)
            .padding(start = 36.dp, end = 36.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 64.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Icon(
                painter = painterResource(id = selectedIcon),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .clickable {
                        navController.navigate("settings")
                    }
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            iconList.drop(1).forEach { iconRes ->
                Icon(
                    painter = painterResource(id = iconRes),
                    contentDescription = null,
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            settingsViewModel.updateSelectedIcon(iconRes)
                        }
                )
            }
        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 32.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            iconList.drop(5).forEach { iconRes ->
//                Icon(
//                    painter = painterResource(id = iconRes),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(32.dp)
//                        .clickable {
//                            selectedIcon = iconRes
//                        }
//                )
//            }
//        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(6) { index ->
                QuestsRow(title = "Screen $index", action = { navController.navigate("home") })
            }
        }
    }
}
