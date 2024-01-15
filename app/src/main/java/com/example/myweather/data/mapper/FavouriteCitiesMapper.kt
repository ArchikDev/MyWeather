package com.example.myweather.data.mapper

import com.example.myweather.data.local.model.CityDbModel
import com.example.myweather.domain.entity.City

fun City.toDbModel(): CityDbModel = CityDbModel(id, name, country)

fun CityDbModel.toEntity(): City = City(id, name, country)

fun List<CityDbModel>.toEntities(): List<City> = map { it.toEntity() }