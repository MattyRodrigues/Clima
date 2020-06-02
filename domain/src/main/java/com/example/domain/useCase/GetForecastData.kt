package com.example.domain.useCase

import com.example.domain.entity.Forecast
import com.example.domain.entity.Response

interface GetForecastData {
    suspend fun getForecastData(city: String): Response<Forecast>
}