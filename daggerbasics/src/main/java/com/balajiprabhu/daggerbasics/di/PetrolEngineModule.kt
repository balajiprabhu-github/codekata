package com.balajiprabhu.daggerbasics.di

import com.balajiprabhu.daggerbasics.engine.Engine
import com.balajiprabhu.daggerbasics.engine.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    companion object{

        @Provides
        fun providesPetrolEngine(petrolEngine: PetrolEngine) : Engine = petrolEngine

    }

}