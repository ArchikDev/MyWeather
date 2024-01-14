package com.example.myweather.data.network.api

import com.example.myweather.data.network.dto.CityDto
import com.example.myweather.data.network.dto.WeatherCurrentDto
import com.example.myweather.data.network.dto.WeatherForecastDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("current.json?key=1500abe38664452bbb382057231904")
    suspend fun loadCurrentWeather(
        @Query("q") query: String
    ): WeatherCurrentDto

    @GET("forecast.json?key=1500abe38664452bbb382057231904")
    suspend fun loadForecast(
        @Query("q") query: String,
        @Query("days") daysCount: Int = 4
    ): WeatherForecastDto

    @GET("search.json?key=1500abe38664452bbb382057231904")
    suspend fun searchCity(
        @Query("q") query: String
    ): List<CityDto>

}