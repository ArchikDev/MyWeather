package com.example.myweather.di

import android.content.Context
import com.example.myweather.data.local.db.FavouriteCitiesDao
import com.example.myweather.data.local.db.FavouriteDatabase
import com.example.myweather.data.network.api.ApiFactory
import com.example.myweather.data.network.api.ApiService
import com.example.myweather.data.repository.FavouriteRepositoryImpl
import com.example.myweather.data.repository.SearchRepositoryImpl
import com.example.myweather.data.repository.WeatherRepositoryImpl
import com.example.myweather.domain.repository.FavouriteRepository
import com.example.myweather.domain.repository.SearchRepository
import com.example.myweather.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindFavouriteRepository(imp: FavouriteRepositoryImpl): FavouriteRepository

    @ApplicationScope
    @Binds
    fun bindWeatherRepository(imp: WeatherRepositoryImpl): WeatherRepository

    @ApplicationScope
    @Binds
    fun bindSearchRepository(imp: SearchRepositoryImpl): SearchRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideApiService(): ApiService = ApiFactory.apiService

        @ApplicationScope
        @Provides
        fun provideFavouriteDatabase(context: Context): FavouriteDatabase {
            return FavouriteDatabase.getInstance(context)
        }

        @ApplicationScope
        @Provides
        fun provideFavouriteCitiesDao(database: FavouriteDatabase): FavouriteCitiesDao {
            return database.favouriteCitiesDao()
        }

    }

}