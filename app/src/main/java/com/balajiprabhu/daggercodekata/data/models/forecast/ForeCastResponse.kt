package com.balajiprabhu.daggercodekata.data.models.forecast

import com.balajiprabhu.daggercodekata.data.models.forecast.City
import com.balajiprabhu.daggercodekata.data.models.forecast.DayForeCast

data class ForeCastResponse(
        val city: City,
        val cnt: Int,
        val cod: String,
        val list: List<DayForeCast>,
        val message: Int
)