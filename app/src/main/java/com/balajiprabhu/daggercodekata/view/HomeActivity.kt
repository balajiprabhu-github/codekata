package com.balajiprabhu.daggercodekata.view

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.balajiprabhu.daggercodekata.R
import com.balajiprabhu.daggercodekata.databinding.ActivityHomeBinding
import com.balajiprabhu.daggercodekata.viewmodel.HomeWeatherViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class HomeActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var homeWeatherViewModel: HomeWeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityMainBinding: ActivityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        activityMainBinding.viewModel = homeWeatherViewModel
        lifecycle.addObserver(homeWeatherViewModel)

    }
}