package com.balajiprabhu.daggercodekata.data.remote

import com.balajiprabhu.daggercodekata.data.models.base.WeatherResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET(value = "/data/2.5/weather")
    fun getWeatherResponse(
        @Query("q") query: String,
        @Query("appid") appId: String
    ) : Single<WeatherResponse>

}