package com.example.myweather.domain.repository

import com.example.myweather.domain.entity.City
import com.example.myweather.domain.entity.Forecast
import com.example.myweather.domain.entity.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast

}