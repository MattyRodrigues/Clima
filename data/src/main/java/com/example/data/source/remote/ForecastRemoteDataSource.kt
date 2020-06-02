package com.example.data.source.remote

import com.example.domain.entity.Forecast
import com.example.domain.entity.Response

interface ForecastRemoteDataSource{
    suspend fun getForecastByCity(city: String) : Response<Forecast>
}