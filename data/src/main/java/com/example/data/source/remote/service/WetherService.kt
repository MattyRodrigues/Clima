package com.example.data.source.remote.service

import com.example.data.model.ForecastResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WetherService {
        @GET("weather")
        fun getForecastDataByCityAsync(
                @Query("city") city: String,
                @Query("token") token: String = "a7d1e5f3"): Deferred<Response<ForecastResponse>>
}