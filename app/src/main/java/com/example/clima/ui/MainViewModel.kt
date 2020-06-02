package com.example.clima.ui

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import com.example.domain.entity.Forecast
import com.example.domain.entity.Response
import com.example.domain.entity.SuccessResponse
import com.example.domain.useCase.GetForecastData

class MainViewModel(private val useCase: GetForecastData) : ViewModel(){

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    suspend fun getData(){
        useCase.getForecastData("Campinas,SP").handlerGetData()
    }

    private fun Response<Forecast>.handlerGetData(){
        when(this){
            is SuccessResponse -> {
                print(body.toString() + "Validation body")
            }
        }
    }
}