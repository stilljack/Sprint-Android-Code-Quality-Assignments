package com.saucefan.stuff.calcm03assssssigned.calculatrixes

import kotlin.math.absoluteValue

class Math(){


fun getSquare(x:Int,y:Int):Int {

    //the sum of two numbers squared
    //or
    //"calculate the sum of squares of two numbers"
return (x*x) + (y*y)

    }


    fun diffAbsValue(x:Int,y:Int):Int {
        val absX=x.absoluteValue
        val absY=y.absoluteValue
        if (absX>=absY){
            return absX -absY
        }
        return absY-absX
    }
}