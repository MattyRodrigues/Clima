package com.example.data.mapper

import com.example.data.model.ForecastElementResponse
import com.example.domain.entity.ForecastElement

class ForecastElementResponseToForecastElementMapper: Mapper<ForecastElementResponse, ForecastElement>() {
    override fun transform(item: ForecastElementResponse?): ForecastElement =
        ForecastElement(
            date = item?.date,
            condition = item?.condition,
            max = item?.max,
            min = item?.min,
            description = item?.description,
            weekday = item?.weekday)
}