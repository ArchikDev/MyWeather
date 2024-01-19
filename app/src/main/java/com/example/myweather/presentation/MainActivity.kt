package com.example.myweather.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.defaultComponentContext
import com.example.myweather.WeatherApp
import com.example.myweather.data.network.api.ApiFactory
import com.example.myweather.domain.usecase.ChangeFavouriteStateUseCase
import com.example.myweather.domain.usecase.SearchCityUseCase
import com.example.myweather.presentation.root.RootComponentImpl
import com.example.myweather.presentation.root.RootContent
import com.example.myweather.presentation.ui.theme.MyWeatherTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var rootComponentFactory: RootComponentImpl.Factory

    override fun onCreate(savedInstanceState: Bundle?) {

        (applicationContext as WeatherApp).applicationComponent.inject(this)

        super.onCreate(savedInstanceState)

        setContent {
            RootContent(component = rootComponentFactory.create(defaultComponentContext()))
        }
    }
}
