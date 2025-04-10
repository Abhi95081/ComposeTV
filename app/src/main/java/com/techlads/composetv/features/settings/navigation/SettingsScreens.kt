package com.techlads.composetv.features.settings.navigation

sealed class SettingsScreens(val title: String) {
    data object Profile : SettingsScreens("profile")
    data object AboutMe : SettingsScreens("about_me")
}
