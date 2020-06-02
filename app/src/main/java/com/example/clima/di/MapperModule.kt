package com.example.clima.di

import com.example.data.mapper.ForecastElementResponseToForecastElementMapper
import com.example.data.mapper.ForecastResponseToForecastMapper
import com.example.data.mapper.Mapper
import com.example.data.model.ForecastElementResponse
import com.example.data.model.ForecastResponse
import com.example.domain.entity.Forecast
import com.example.domain.entity.ForecastElement
import org.koin.core.qualifier.named
import org.koin.dsl.module

object MapperModule {
    private const val ForecastElementMapperNamed = "forecastElementMapperNamed"

    val mapperModules = module{
        single<Mapper<ForecastResponse, Forecast>> {
            ForecastResponseToForecastMapper(forecastPrevisionMapper = get(named(ForecastElementMapperNamed))) }

        single<Mapper<ForecastElementResponse, ForecastElement>>(named(ForecastElementMapperNamed)) {
            ForecastElementResponseToForecastElementMapper()
        }
    }
}