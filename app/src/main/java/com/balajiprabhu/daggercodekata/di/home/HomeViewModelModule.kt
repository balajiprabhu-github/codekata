package com.balajiprabhu.daggercodekata.di.home

import androidx.lifecycle.ViewModel
import com.balajiprabhu.daggercodekata.di.multibinding.ViewModelKey
import com.balajiprabhu.daggercodekata.viewmodel.HomeWeatherViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeWeatherViewModel::class)
    abstract fun providesHomeViewModel(homeWeatherViewModel: HomeWeatherViewModel): ViewModel

}
