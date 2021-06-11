package com.balajiprabhu.daggerbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.balajiprabhu.daggerbasics.di.CarComponent
import com.balajiprabhu.daggerbasics.engine.Block
import com.balajiprabhu.daggerbasics.engine.Cylinder
import com.balajiprabhu.daggerbasics.engine.Engine
import com.balajiprabhu.daggerbasics.engine.SparkPlugs
import com.balajiprabhu.daggerbasics.wheels.Rims
import com.balajiprabhu.daggerbasics.wheels.Tires
import com.balajiprabhu.daggerbasics.wheels.Wheels
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car :Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val tires = Tires()
        val rims = Rims()
        val wheels = Wheels(tires, rims)
        val block = Block()
        val sparkPlugs = SparkPlugs()
        val cylinder = Cylinder()
        val engine = Engine(block, cylinder, sparkPlugs)*/

        //car = Car(wheels, engine)

        //car = DaggerCarComponent.create().getCar()
       // val carComponent : CarComponent = DaggerCarComponent.create()
        //carComponent.inject(this)

        car.drive()

    }
}