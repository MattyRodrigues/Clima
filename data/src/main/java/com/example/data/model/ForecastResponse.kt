package com.example.data.model

import com.example.data.model.ForecastPrevisionResponse
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ForecastResponse (
    @Json(name = "by") val by: String,
    @Json(name = "valid_key")val validKey: Boolean,
    @Json(name = "results")val forecastPrevisionResponse: ForecastPrevisionResponse,
    @Json(name = "execution_time")val executionTime: Long,
    @Json(name = "from_cache")val fromCache: Boolean
)