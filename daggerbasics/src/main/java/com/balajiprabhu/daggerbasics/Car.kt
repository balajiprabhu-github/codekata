package com.balajiprabhu.daggerbasics

import com.balajiprabhu.daggerbasics.engine.Engine
import com.balajiprabhu.daggerbasics.wheels.Wheels

class Car  {

    var wheels:Wheels
    var engine:Engine

    constructor(wheels: Wheels,engine: Engine){
        this.wheels = wheels
        this.engine = engine
    }

    fun drive(){
        println("Car is driving...")
    }
}