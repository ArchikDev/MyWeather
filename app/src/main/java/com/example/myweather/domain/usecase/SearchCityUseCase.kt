package com.example.myweather.domain.usecase

import com.example.myweather.domain.repository.SearchRepository
import javax.inject.Inject

class SearchCityUseCase @Inject constructor(
    private val repository: SearchRepository
) {

    suspend operator fun invoke(query: String) = repository.search(query)
}
