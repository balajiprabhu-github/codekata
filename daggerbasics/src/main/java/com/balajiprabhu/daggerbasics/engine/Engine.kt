package com.balajiprabhu.daggerbasics.engine

class Engine {

    var block: Block
    var cylinder: Cylinder
    var sparkPlugs: SparkPlugs

    constructor(block: Block,cylinder: Cylinder,sparkPlugs: SparkPlugs){
        this.block = block
        this.cylinder = cylinder
        this.sparkPlugs = sparkPlugs
        startEngine()
    }

    fun startEngine(){
        println("Engine Started")
    }

}