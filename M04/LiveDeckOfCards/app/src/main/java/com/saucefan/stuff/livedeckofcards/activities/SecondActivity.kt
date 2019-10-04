package com.saucefan.stuff.livedeckofcards.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saucefan.stuff.livedeckofcards.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var intentcard =intent.getSerializableExtra("card")

        et_secondact.text=intentcard.toString()
    }
}
