package com.saucefan.stuff.calcm03assssssigned

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val m = Maths()
       /* for (i in 0..200) {
            println("$i:  "+m.factorial(i))
        }*/
      /*  for (i in 0..10000) {
            val x=Random.nextInt()
            val y = Random.nextInt()
            println("x=$x -- y=$y:  "+m.diffAbsValue(x,y))
        }*/
    }
}
