package com.example.data.mapper

import com.example.data.model.ForecastElementResponse
import com.example.data.model.ForecastPrevisionResponse
import com.example.data.model.ForecastResponse
import com.example.domain.entity.Forecast
import com.example.domain.entity.ForecastElement
import com.example.domain.entity.ForecastPrevision

class ForecastResponseToForecastMapper(
    private val forecastPrevisonMapper: Mapper<ForecastElementResponse, ForecastElement>) : Mapper<ForecastResponse, Forecast>(){
    override fun transform(item: ForecastResponse?): Forecast =
        Forecast(
            by = item?.by,
            validKey = item?.validKey,
            executionTime = item?.executionTime,
            forecastPrevisionResponse = ForecastPrevision(
                    temp = item?.forecastPrevisionResponse?.temp,
                    date = item?.forecastPrevisionResponse?.date,
                    time = item?.forecastPrevisionResponse?.time,
                    conditionCode = item?.forecastPrevisionResponse?.conditionCode,
                    description = item?.forecastPrevisionResponse?.description,
                    currently = item?.forecastPrevisionResponse?.currently,
                    cid = item?.forecastPrevisionResponse?.cid,
                    city = item?.forecastPrevisionResponse?.city,
                    imgID = item?.forecastPrevisionResponse?.imgID,
                    humidity = item?.forecastPrevisionResponse?.humidity,
                    windSpeedy = item?.forecastPrevisionResponse?.windSpeedy,
                    sunrise = item?.forecastPrevisionResponse?.sunrise,
                    sunset = item?.forecastPrevisionResponse?.sunset,
                    conditionSlug = item?.forecastPrevisionResponse?.conditionSlug,
                    cityName = item?.forecastPrevisionResponse?.cityName,
                    forecastResponse = item?.forecastPrevisionResponse?.forecastResponse?.map { forecastPrevisonMapper.transform(it) }),
            fromCache = item?.fromCache
        )
}