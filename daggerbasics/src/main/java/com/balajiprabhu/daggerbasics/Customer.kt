package com.balajiprabhu.daggerbasics

import javax.inject.Inject

class Customer @Inject constructor() {

    lateinit var car : Car

    fun providesCar(car: Car){
        this.car = car
        println("Car provided to the customer")
    }

}