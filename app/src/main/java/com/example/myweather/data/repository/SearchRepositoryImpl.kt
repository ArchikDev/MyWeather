package com.example.myweather.data.repository

import com.example.myweather.data.mapper.toEntities
import com.example.myweather.data.network.api.ApiService
import com.example.myweather.domain.entity.City
import com.example.myweather.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}