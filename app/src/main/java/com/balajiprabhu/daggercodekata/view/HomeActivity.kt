package com.balajiprabhu.daggercodekata.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.balajiprabhu.daggercodekata.R
import com.balajiprabhu.daggercodekata.data.remote.NetworkUtil
import com.balajiprabhu.daggercodekata.data.models.WeatherRepository
import com.balajiprabhu.daggercodekata.databinding.ActivityHomeBinding
import com.balajiprabhu.daggercodekata.view.adapter.WeatherListAdapter
import com.balajiprabhu.daggercodekata.viewmodel.HomeWeatherViewModel
import com.balajiprabhu.daggercodekata.viewmodel.HomeWeatherViewModelFactory

class HomeActivity : AppCompatActivity() {

    private lateinit var homeWeatherViewModel: HomeWeatherViewModel

    lateinit var homeWeatherViewModelFactory: HomeWeatherViewModelFactory

    private val weatherListAdapter: WeatherListAdapter = WeatherListAdapter()
    private lateinit var weatherRepository: WeatherRepository
    private val networkUtil = NetworkUtil()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        weatherRepository = WeatherRepository(networkUtil)
        homeWeatherViewModelFactory = HomeWeatherViewModelFactory(weatherListAdapter, weatherRepository)

        homeWeatherViewModel = ViewModelProvider(this, homeWeatherViewModelFactory).get(HomeWeatherViewModel::class.java)


        val activityMainBinding: ActivityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        activityMainBinding.viewModel = homeWeatherViewModel
        lifecycle.addObserver(homeWeatherViewModel)

    }
}