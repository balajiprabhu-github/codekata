package com.balajiprabhu.daggercodekata.di

import com.balajiprabhu.daggercodekata.di.home.HomeModule
import com.balajiprabhu.daggercodekata.di.home.HomeScope
import com.balajiprabhu.daggercodekata.di.home.HomeViewModelModule
import com.balajiprabhu.daggercodekata.view.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @HomeScope
    @ContributesAndroidInjector(modules = [HomeViewModelModule::class, HomeModule::class])
    abstract fun contributesHomeActivity(): HomeActivity

}