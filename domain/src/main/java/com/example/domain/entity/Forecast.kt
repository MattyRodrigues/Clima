package com.example.domain.entity

data class Forecast (
    val by: String?,
    val validKey: Boolean?,
    val forecastPrevisionResponse: ForecastPrevision?,
    val executionTime: Long?,
    val fromCache: Boolean?
)