package com.balajiprabhu.daggerbasics.wheels

class Wheels {

    var tires: Tires
    var rims: Rims

    constructor(tires: Tires,rims: Rims){
        this.tires = tires
        this.rims = rims
        checkWheels()
    }

    private fun checkWheels(){
        println("Wheels ready to move")
    }
}