package com.example.clima.di

import com.example.data.client.RetrofitBuilder.createClientByService
import com.example.data.repository.ForecastRepositoryImpl
import com.example.data.source.remote.ForecastRemoteDataSource
import com.example.data.source.remote.ForecastRemoteDataSourceImpl
import com.example.data.source.remote.service.WetherService
import com.example.domain.repository.ForecastRespository
import org.koin.dsl.module

object DataModule {

    val serviceModules = module {
        single{ createClientByService<WetherService>() }
    }

    val dataModules = module {
        single<ForecastRemoteDataSource> {
            ForecastRemoteDataSourceImpl(
                servico = get(),
                mapper = get()
            )
        }
    }

    val dataRepositories = module {
        single<ForecastRespository> {
            ForecastRepositoryImpl(forecastRemoteDataSource = get())
        }
    }
}