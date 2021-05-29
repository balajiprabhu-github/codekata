package com.balajiprabhu.daggercodekata.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.balajiprabhu.daggercodekata.data.models.WeatherRepository
import com.balajiprabhu.daggercodekata.view.adapter.WeatherListAdapter

class HomeWeatherViewModelFactory(
    private val weatherListAdapter: WeatherListAdapter,
    private val weatherRepository: WeatherRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass
            .getConstructor(WeatherListAdapter::class.java,WeatherRepository::class.java)
            .newInstance(weatherListAdapter,weatherRepository)
    }
}