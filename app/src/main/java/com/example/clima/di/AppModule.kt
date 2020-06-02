package com.example.clima.di

import com.example.clima.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppModule {
    val viewModelModules = module {
        viewModel {
            MainViewModel(useCase = get())
        }
    }
}