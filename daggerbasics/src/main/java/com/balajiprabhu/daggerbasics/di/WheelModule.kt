package com.balajiprabhu.daggerbasics.di

import com.balajiprabhu.daggerbasics.wheels.Rims
import com.balajiprabhu.daggerbasics.wheels.Tires
import com.balajiprabhu.daggerbasics.wheels.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    companion object {

        @Provides
        fun providesTires() = Tires()

        @Provides
        fun providesRims() = Rims()

        @Provides
        fun providesWheels(tires: Tires,rims: Rims): Wheels = Wheels(tires,rims)

    }
}