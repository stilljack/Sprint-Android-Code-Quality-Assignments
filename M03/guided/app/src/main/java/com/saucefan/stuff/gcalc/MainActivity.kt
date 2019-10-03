package com.saucefan.stuff.gcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            shutUpAboutZelda()
        }

    }
    fun shutUpAboutZelda() {

        for (i in 0 until 20) {
            btn.performClick()
        }

    }
}
