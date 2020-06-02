package com.example.clima.di

import com.example.clima.di.DataModule.ForecastRespositoryNamed
import com.example.domain.useCase.GetForecastData
import com.example.domain.useCase.GetForecastDataImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module

object DomainModule {
    const val ForecastUseCaseNamed = "forecastUseCaseNamed"
    val domainModules = module {
        single<GetForecastData>(named(ForecastUseCaseNamed)) {
            GetForecastDataImpl(forecastRespository = get(named(ForecastRespositoryNamed))) }
    }
}