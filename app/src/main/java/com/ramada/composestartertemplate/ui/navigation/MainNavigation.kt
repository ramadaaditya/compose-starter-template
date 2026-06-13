package com.ramada.composestartertemplate.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavEntry
import com.ramada.composestartertemplate.ui.features.detail.detailNavEntry
import com.ramada.composestartertemplate.ui.features.home.homeNavEntry
import com.ramada.composestartertemplate.ui.features.profile.profileNavEntry
import com.ramada.composestartertemplate.ui.features.search.searchNavEntry

@Composable
fun mainEntryProvider(
    onNavigateToDetail: (String) -> Unit
): (Route) -> NavEntry<Route> = { key ->
    when (key) {
        is Route.Home -> homeNavEntry(onNavigateToDetail)
        is Route.Search -> searchNavEntry(onNavigateToDetail)
        is Route.Profile -> profileNavEntry()
        is Route.Detail -> detailNavEntry(key)
    }
}
