package com.example.data.client

import android.content.Context
import com.example.data.mapper.Mapper
import com.example.data.source.remote.service.WetherService
import com.example.domain.entity.EmptyResponse
import com.example.domain.entity.Response
import com.example.domain.entity.SuccessResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitBuilder {
    inline fun <reified T> createClientByService() : T {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.hgbrasil.com/")
            .addConverterFactory(MoshiConverterFactory.create(moshiFactory()))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
        return retrofit.create(T::class.java)
    }

    fun moshiFactory(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    fun <T, O> retrofit2.Response<T>.converter(mapper: Mapper<T, O>): Response<O> {
        return SuccessResponse(mapper.transform(body()))
    }
}