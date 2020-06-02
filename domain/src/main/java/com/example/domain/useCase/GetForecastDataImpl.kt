package com.example.domain.useCase

import com.example.domain.entity.Forecast
import com.example.domain.entity.Response
import com.example.domain.repository.ForecastRespository

class GetForecastDataImpl(private val forecastRespository: ForecastRespository) : GetForecastData {
    override suspend fun getForecastData(city: String): Response<Forecast> {
        return forecastRespository.getForecastData(city)
    }
}