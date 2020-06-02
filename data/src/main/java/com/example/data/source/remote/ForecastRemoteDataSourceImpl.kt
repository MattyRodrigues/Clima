package com.example.data.source.remote

import com.example.data.client.RetrofitBuilder.converter
import com.example.data.mapper.Mapper
import com.example.data.model.ForecastResponse
import com.example.data.source.remote.service.WetherService
import com.example.domain.entity.Forecast
import com.example.domain.entity.Response

class ForecastRemoteDataSourceImpl(
    private val servico: WetherService,
    private val mapper: Mapper<ForecastResponse, Forecast>
): ForecastRemoteDataSource {
    override suspend fun getForecastByCity(city: String): Response<Forecast> {
        return servico.getForecastDataByCityAsync(city).await().converter(mapper)
    }
}