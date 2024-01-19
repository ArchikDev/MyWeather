package com.example.myweather.presentation.root

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.example.myweather.presentation.details.DetailsContent
import com.example.myweather.presentation.favourite.FavouriteContent
import com.example.myweather.presentation.search.SearchContent
import com.example.myweather.presentation.ui.theme.MyWeatherTheme

@Composable
fun RootContent(component: RootComponent) {
    MyWeatherTheme {
        Children(
            stack = component.stack
        ) {
            when (val instance = it.instance) {
                is RootComponent.Child.Details -> {
                    DetailsContent(component = instance.component)
                }
                is RootComponent.Child.Favourite -> {
                    FavouriteContent(component = instance.component)
                }
                is RootComponent.Child.Search -> {
                    SearchContent(component = instance.component)
                }
            }
        }
    }
}