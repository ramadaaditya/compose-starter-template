package com.ramada.composestartertemplate.ui.features.home

import androidx.navigation3.runtime.NavEntry
import com.ramada.composestartertemplate.ui.navigation.Route

fun homeNavEntry(
    onNavigateToDetail: (String) -> Unit
): NavEntry<Route> = NavEntry(Route.Home) {
    HomeRoute(onNavigateToDetail = onNavigateToDetail)
}
