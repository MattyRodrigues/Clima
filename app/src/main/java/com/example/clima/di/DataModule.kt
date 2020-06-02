package com.example.clima.di

import com.example.data.client.RetrofitBuilder.createClientByService
import com.example.data.repository.ForecastRepositoryImpl
import com.example.data.source.remote.ForecastRemoteDataSource
import com.example.data.source.remote.ForecastRemoteDataSourceImpl
import com.example.data.source.remote.service.WetherService
import com.example.domain.repository.ForecastRespository
import org.koin.core.qualifier.named
import org.koin.dsl.module

object DataModule {
    const val ForecastServiceNamed = "forecastServiceNamed"
    const val ForecastRespositoryNamed = "forecastRespositoryNamed"
    const val ForecastDataNamed = "forecastDataNamed"

    val serviceModules = module {
        single(named(ForecastServiceNamed)){ createClientByService<WetherService>() }
    }

    val dataModules = module {
        single<ForecastRemoteDataSource>(named(ForecastDataNamed)) {
            ForecastRemoteDataSourceImpl(
                servico = get(named(ForecastServiceNamed)),
                mapper = get(named(MapperModule.ForecastMapperNamed))
            )
        }
    }

    val dataRepositories = module {
        single<ForecastRespository>(named(ForecastRespositoryNamed)){
            ForecastRepositoryImpl(forecastRemoteDataSource = get(named(ForecastDataNamed)))
        }
    }
}