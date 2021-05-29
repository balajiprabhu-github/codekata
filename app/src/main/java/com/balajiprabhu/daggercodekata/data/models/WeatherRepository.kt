package com.balajiprabhu.daggercodekata.data.models

import com.balajiprabhu.daggercodekata.data.Constants
import com.balajiprabhu.daggercodekata.data.remote.NetworkUtil
import com.balajiprabhu.daggercodekata.data.models.base.WeatherResponse
import io.reactivex.rxjava3.core.Observable

class WeatherRepository(private val networkUtil: NetworkUtil) {
    fun getWeatherNetworkData(cityName:String) : Observable<WeatherResponse> {
        return networkUtil.providesAppClient().getWeatherResponse(cityName, Constants.APP_TOKEN).toObservable()
    }
}