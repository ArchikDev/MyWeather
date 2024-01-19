package com.example.myweather.presentation.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.example.myweather.presentation.details.DetailsComponent
import com.example.myweather.presentation.favourite.FavouriteComponent
import com.example.myweather.presentation.search.SearchComponent

interface RootComponent {

    val stack: Value<ChildStack<*, Child>>

    sealed interface Child {

        data class Favourite(val component: FavouriteComponent): Child

        data class Search(val component: SearchComponent): Child

        data class Details(val component: DetailsComponent): Child
    }
}