package com.example.clima.di

import com.example.clima.di.DataModule.dataModules
import com.example.clima.di.DataModule.dataRepositories
import com.example.clima.di.DataModule.serviceModules
import com.example.clima.di.DomainModule.domainModules
import com.example.clima.di.MapperModule.mapperModules
import org.koin.core.module.Module

object AppComponent {
    fun getAllModules(): List<Module> = listOf(*getDomainModules(), *getDataModules(), *getMapperModules(), *getViewModelModules())

    private fun getViewModelModules(): Array<Module>{
        return arrayOf(AppModule.viewModelModules)
    }

    private fun getMapperModules(): Array<Module>{
        return arrayOf(mapperModules)
    }

    private fun getDomainModules(): Array<Module> {
        return arrayOf(domainModules)
    }

    private fun getDataModules(): Array<Module> {
        return arrayOf(
            serviceModules,
            dataModules,
            dataRepositories
        )
    }
}