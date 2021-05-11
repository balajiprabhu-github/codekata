package com.balajiprabhu.daggerbasics

import com.balajiprabhu.daggerbasics.engine.Engine
import com.balajiprabhu.daggerbasics.wheels.Wheels
import javax.inject.Inject

class Car  {

    var wheels:Wheels
    var engine:Engine

    @Inject
    constructor(wheels: Wheels,engine: Engine) {
        this.wheels = wheels
        this.engine = engine
    }

    @Inject
    fun providesCarToCustomer(customer: Customer){
        customer.providesCar(this)
    }

    fun drive() {
        println("Car is driving...")
    }
}