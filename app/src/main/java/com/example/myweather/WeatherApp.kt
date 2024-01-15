package com.example.myweather

import android.app.Application
import com.example.myweather.di.ApplicationComponent
import com.example.myweather.di.DaggerApplicationComponent

class WeatherApp: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}