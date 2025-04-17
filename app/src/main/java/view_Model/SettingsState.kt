package view_Model

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.questie.R

data class SettingsList(
    val icon: Painter? = null,
    val id: String,
    val title: String,
)

@Composable
fun rememberSettingsState(): SettingsState {
    return SettingsState(
        settings = listOf(
            SettingsList(
                icon = painterResource(id = R.drawable.ic_user),
                id = "HR",
                title = "Hrvatski"
            ),
            SettingsList(
                icon = painterResource(id = R.drawable.ic_user),
                id = "EN",
                title = "English"
            )
        )
    )
}

