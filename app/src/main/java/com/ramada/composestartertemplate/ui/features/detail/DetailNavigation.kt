package com.ramada.composestartertemplate.ui.features.detail

import androidx.navigation3.runtime.NavEntry
import com.ramada.composestartertemplate.ui.navigation.Route

fun detailNavEntry(route: Route.Detail): NavEntry<Route> = NavEntry(route) {
    DetailRoute(id = route.id)
}
