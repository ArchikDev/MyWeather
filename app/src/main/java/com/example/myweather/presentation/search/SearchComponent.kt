package com.example.myweather.presentation.search

import com.example.myweather.domain.entity.City
import com.example.myweather.presentation.details.DetailsStore
import kotlinx.coroutines.flow.StateFlow

interface SearchComponent {

    val model: StateFlow<SearchStore.State>

    fun onClickBack()

    fun changeSearchQuery(query: String)

    fun onClickSearch()

    fun onClickCity(city: City)
}