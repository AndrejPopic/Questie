package settings.view_Model

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.questie.R

class SettingsViewModel : ViewModel() {
    private val _selectedIcon = mutableStateOf(R.drawable.ic_user)
    val selectedIcon: State<Int> = _selectedIcon

    fun updateSelectedIcon(iconRes: Int) {
        _selectedIcon.value = iconRes
    }
}