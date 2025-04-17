package components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
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
import com.example.questie.R

@Composable
fun QuestsRow(
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