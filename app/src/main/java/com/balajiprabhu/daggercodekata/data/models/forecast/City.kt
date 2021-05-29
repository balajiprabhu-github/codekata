package com.balajiprabhu.daggercodekata.data.models.forecast

import com.balajiprabhu.daggercodekata.data.models.base.Coord

data class City(
    val coord: Coord,
    val country: String,
    val id: Int,
    val name: String,
    val population: Int,
    val sunrise: Int,
    val sunset: Int,
    val timezone: Int
)