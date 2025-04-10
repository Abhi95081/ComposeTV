package com.techlads.composetv.features.home.navigation

sealed class NestedScreens(val title: String) {
    data object Home : NestedScreens("home")
    data object Search : NestedScreens("search")
    data object Movies : NestedScreens("movies")
    data object Songs : NestedScreens("songs")
    data object Favorites : NestedScreens("favourites")
    data object Settings : NestedScreens("settings")
}
