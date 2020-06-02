package com.example.clima.di

import com.example.clima.ui.MainViewModel
import com.example.clima.di.DomainModule.ForecastUseCaseNamed
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

object AppModule {
    val viewModelModules = module {
        viewModel {
            MainViewModel(useCase = get(named(ForecastUseCaseNamed)))
        }
    }
}