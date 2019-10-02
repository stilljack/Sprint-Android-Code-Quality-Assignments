package com.saucefan.stuff.calcm03assssssigned.calculatrixes

class Calc(private val maths:Maths) {



fun getSquareSum(x:Int,y:Int):Int{
    return maths.getSquareSum(x,y)
}
    fun factorial(x:Int):Int {
        return maths.factorial(x)
    }
    fun difference (x:Int,y:Int):Int {

        return maths.diffAbsValue(x,y)

    }
}