package com.balajiprabhu.daggercodekata.data.models

import com.balajiprabhu.daggercodekata.data.Constants
import com.balajiprabhu.daggercodekata.data.models.base.WeatherResponse
import com.balajiprabhu.daggercodekata.data.remote.WeatherService
import io.reactivex.rxjava3.core.Observable

class WeatherRepository(private val weatherService: WeatherService) {
    fun getWeatherNetworkData(cityName:String) : Observable<WeatherResponse> {
        return weatherService.getWeatherResponse(cityName, Constants.APP_TOKEN).toObservable()
    }
}