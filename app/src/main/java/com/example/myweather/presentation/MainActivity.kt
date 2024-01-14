package com.example.myweather.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myweather.data.network.api.ApiFactory
import com.example.myweather.presentation.ui.theme.MyWeatherTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val apiService = ApiFactory.apiService

        CoroutineScope(Dispatchers.Main).launch {
            val currentWeather = apiService.loadCurrentWeather("Moscow")
            val forecast = apiService.loadForecast("Moscow")
            val cities = apiService.searchCity("Moscow")

            Log.d("MainActivity",
                "Current: $currentWeather\n$forecast\n$cities")
        }

        setContent {
            MyWeatherTheme {

            }
        }
    }
}
