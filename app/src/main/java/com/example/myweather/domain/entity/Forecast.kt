package com.example.myweather.domain.entity

data class Forecast( // Прогноз
    val currentWeather: Weather,
    val upcoming: List<Weather> // Погода на несколько дней
)
