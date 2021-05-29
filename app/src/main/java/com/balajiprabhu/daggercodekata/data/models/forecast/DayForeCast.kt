package com.balajiprabhu.daggercodekata.data.models.forecast

import com.balajiprabhu.daggercodekata.data.models.base.Clouds

data class DayForeCast(
    val clouds: Clouds,
    val dt: Int,
    val dt_txt: String,
    val main: Main,
    val pop: Int,
    val sys: Sys,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)