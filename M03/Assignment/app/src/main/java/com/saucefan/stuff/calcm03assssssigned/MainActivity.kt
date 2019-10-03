package com.saucefan.stuff.calcm03assssssigned

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val m = Maths()
        for (i in 0..200) {
            println("$i:  "+m.factorial(i))
        }

    }
}
