package com.example.clima.di

import com.example.domain.useCase.GetForecastData
import com.example.domain.useCase.GetForecastDataImpl
import org.koin.dsl.module

object DomainModule {

    val domainModules = module {
        single<GetForecastData> {
            GetForecastDataImpl(forecastRespository = get()) }
    }
}