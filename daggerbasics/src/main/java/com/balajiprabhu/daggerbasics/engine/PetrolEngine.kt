package com.balajiprabhu.daggerbasics.engine

import javax.inject.Inject

class PetrolEngine : Engine {

    var block: Block
    var cylinder: Cylinder
    var sparkPlugs: SparkPlugs

    @Inject
    constructor(block: Block,cylinder: Cylinder,sparkPlugs: SparkPlugs){
        this.block = block
        this.cylinder = cylinder
        this.sparkPlugs = sparkPlugs
        startEngine()
    }

    override fun startEngine() {
        println("Petrol Engine started")
    }
}