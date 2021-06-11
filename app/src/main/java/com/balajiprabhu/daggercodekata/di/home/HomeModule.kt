package com.balajiprabhu.daggercodekata.di.home

import com.balajiprabhu.daggercodekata.data.models.WeatherRepository
import com.balajiprabhu.daggercodekata.data.remote.WeatherService
import com.balajiprabhu.daggercodekata.view.adapter.WeatherListAdapter
import dagger.Module
import dagger.Provides

@Module
class HomeModule {

    @HomeScope
    @Provides
    fun providesWeatherListAdapter() : WeatherListAdapter = WeatherListAdapter()

    @HomeScope
    @Provides
    fun providesWeatherRepository(weatherService: WeatherService) : WeatherRepository = WeatherRepository(weatherService)

}