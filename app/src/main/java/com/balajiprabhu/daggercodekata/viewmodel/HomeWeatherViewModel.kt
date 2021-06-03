package com.balajiprabhu.daggercodekata.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import com.balajiprabhu.daggercodekata.data.models.WeatherRepository
import com.balajiprabhu.daggercodekata.data.models.base.WeatherResponse
import com.balajiprabhu.daggercodekata.view.adapter.WeatherListAdapter
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.*
import javax.inject.Inject

class HomeWeatherViewModel @Inject constructor(
    val weatherListAdapter: WeatherListAdapter,
    private val weatherRepository: WeatherRepository) : ViewModel(), LifecycleObserver {

    private val cityList = listOf<String>("Coimbatore","Chennai","London","Delhi")

    private val homeWeatherItemViewModels = mutableListOf<HomeWeatherItemViewModel>()

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun getWeatherData() {
        cityList.forEach {
            weatherRepository.getWeatherNetworkData(it)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onError)
        }
    }

    private fun onSuccess(weatherResponse: WeatherResponse) {
        weatherResponse.let {
            val loc = Locale("", it.sys.country)
            val temp = (it.main.temp - 273.15).toInt()
            val homeWeatherItemViewModel = HomeWeatherItemViewModel(
                String.format("$temp%s",0x00B0.toChar()),
                it.name,
                loc.displayCountry,
                it.weather[0].icon
            )
            homeWeatherItemViewModels.add(homeWeatherItemViewModel)
        }

        homeWeatherItemViewModels.isNotEmpty().let {
            weatherListAdapter.setWeatherItemListData(homeWeatherItemViewModels)
        }
    }

    private fun onError(throwable: Throwable){
        println("Service failure: ${throwable.localizedMessage}")
    }

}