package com.example.myweather.data.mapper

import com.example.myweather.data.network.dto.CityDto
import com.example.myweather.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }