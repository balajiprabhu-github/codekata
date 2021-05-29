package com.balajiprabhu.daggerbasics.di

import com.balajiprabhu.daggerbasics.engine.DieselEngine
import com.balajiprabhu.daggerbasics.engine.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DieselEngineModule {

    companion object{

        @Provides
        fun providesDieselEngine(dieselEngine: DieselEngine) : Engine = dieselEngine

    }
}