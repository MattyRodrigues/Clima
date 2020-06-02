package com.example.domain.repository

import com.example.domain.entity.Forecast
import com.example.domain.entity.Response

interface ForecastRespository {
    suspend fun getForecastData(city: String): Response<Forecast>
}