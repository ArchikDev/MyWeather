package com.example.myweather.domain.repository

import com.example.myweather.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}