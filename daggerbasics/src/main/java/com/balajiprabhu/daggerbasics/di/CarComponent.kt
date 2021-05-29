package com.balajiprabhu.daggerbasics.di

import com.balajiprabhu.daggerbasics.Car
import com.balajiprabhu.daggerbasics.MainActivity
import dagger.Component

@Component(modules = [DieselEngineModule::class,WheelModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}