package com.example.data.repository

import com.example.data.source.remote.ForecastRemoteDataSource
import com.example.domain.entity.Forecast
import com.example.domain.entity.Response
import com.example.domain.repository.ForecastRespository

class ForecastRepositoryImpl(private val forecastRemoteDataSource: ForecastRemoteDataSource): ForecastRespository {
    override suspend fun getForecastData(city: String): Response<Forecast> {
        return forecastRemoteDataSource.getForecastByCity(city = city)
    }
}