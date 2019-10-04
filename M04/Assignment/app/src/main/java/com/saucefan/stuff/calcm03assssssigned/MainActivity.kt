package com.saucefan.stuff.calcm03assssssigned

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths
import kotlin.random.Random
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*



// lets actually make this, why not


class MainActivity : AppCompatActivity() {
lateinit var viewModel: CalcViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel= ViewModelProviders.of(this)[CalcViewModel::class.java]




btn_nine.setOnClickListener {
    tv_display.text="9"
}


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
