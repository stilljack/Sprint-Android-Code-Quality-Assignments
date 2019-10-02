package com.saucefan.stuff.calcm03assssssigned.calculatrixes

class Calc(val math:Math) {



fun getSquareSum(x:Int,y:Int):Int{
    return math.getSquareSum(x,y)
}

    fun factorial(x:Int):Int {
        return math.factorial(x)
    }
    fun difference (x:Int,y:Int):Int {

        return math.diffAbsValue(x,y)

    }
}