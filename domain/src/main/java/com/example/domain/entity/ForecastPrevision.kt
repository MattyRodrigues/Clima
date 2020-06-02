package com.example.domain.entity

data class ForecastPrevision(
    val temp: Long?,
    val date: String?,
    val time: String?,
    val conditionCode: String?,
    val description: String?,
    val currently: String?,
    val cid: String?,
    val city: String?,
    val imgID: String?,
    val humidity: Long?,
    val windSpeedy: String?,
    val sunrise: String?,
    val sunset: String?,
    val conditionSlug: String?,
    val cityName: String?,
    val forecastResponse: List<ForecastElement>?
)