package components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.questie.R

@Composable
fun BottomNav(
    navController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.08f)
                .background(color = Color.LightGray)
                .padding(bottom = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            Box {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 48.dp)
                        .height(32.dp)
                        .width(32.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("homeScreen")
                            }
                        ),
                )
            }

            VerticalDivider(
                modifier = Modifier.height(24.dp),
                color = MaterialTheme.colorScheme.onTertiaryContainer
            )

            Box {
                Icon(
                    painter = painterResource(id = R.drawable.ic_family_tree),
                    contentDescription = null,
                    modifier = Modifier
                        .height(32.dp)
                        .width(32.dp)
                        .clickable(
                            onClick = {
                                navController.navigate("familyTree")
                            }
                        ),
                )
            }

            VerticalDivider(
                modifier = Modifier.height(24.dp),
                color = MaterialTheme.colorScheme.onTertiaryContainer
            )

            Box {
                Icon(
                    painter = painterResource(id = R.drawable.ic_quest_report),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 48.dp)
                        .height(32.dp)
                        .width(32.dp)
                        .clickable(
                            onClick = { /*TODO*/ }
                        ),
                )
            }
        }
    }
}