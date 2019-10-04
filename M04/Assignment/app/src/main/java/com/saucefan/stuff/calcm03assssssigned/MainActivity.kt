package com.saucefan.stuff.calcm03assssssigned

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths
import kotlin.random.Random
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.ObservableProperty


// lets actually make this, why not
//this is a non trvial problem



class MainActivity : AppCompatActivity() {
lateinit var viewModel: CalcViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel= ViewModelProviders.of(this)[CalcViewModel::class.java]

            viewModel.getDisplayString().observe(this, Observer {
                tv_display.text=it
            })



        btn_add
        btn_multiply
        btn_factorial
        btn_divide


        btn_submit.setOnClickListener {
            //todo
        }


        //detete -- ie backspace, ie. delete last char
        btn_delete.setOnClickListener {
            viewModel.backspace()
        }


        //clear!
        btn_clear.setOnClickListener {
            viewModel.clear()
        }







        //eww numbers
        btn_one.setOnClickListener {
            viewModel.addToString("1")
        }
        btn_two.setOnClickListener {
            viewModel.addToString("2")
        }
        btn_three.setOnClickListener {
            viewModel.addToString("3")
        }
            btn_four.setOnClickListener {
                viewModel.addToString("4")
            }
            btn_five.setOnClickListener {
                viewModel.addToString("5")
            }

            btn_six.setOnClickListener {
                viewModel.addToString("6")
            }
                btn_seven.setOnClickListener {
                    viewModel.addToString("7")
                }
                btn_eight.setOnClickListener {
                    viewModel.addToString("8")
                }
                btn_nine.setOnClickListener {
                    viewModel.addToString("9")
                }


            }
        }

       /* for (i in 0..200) {
            println("$i:  "+m.factorial(i))
        }*/
      /*  for (i in 0..10000) {
            val x=Random.nextInt()
            val y = Random.nextInt()
            println("x=$x -- y=$y:  "+m.diffAbsValue(x,y))
        }*/


