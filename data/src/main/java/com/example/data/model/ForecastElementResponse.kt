package com.example.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class ForecastElementResponse (
    @Json(name = "date")val date: String,
    @Json(name = "weekday")val weekday: String,
    @Json(name = "max")val max: Long,
    @Json(name = "min")val min: Long,
    @Json(name = "description")val description: String,
    @Json(name = "condition")val condition: String
)