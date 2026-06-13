package com.ramada.composestartertemplate.ui.features.profile

import androidx.navigation3.runtime.NavEntry
import com.ramada.composestartertemplate.ui.navigation.Route

fun profileNavEntry(): NavEntry<Route> = NavEntry(Route.Profile) {
    ProfileRoute()
}
