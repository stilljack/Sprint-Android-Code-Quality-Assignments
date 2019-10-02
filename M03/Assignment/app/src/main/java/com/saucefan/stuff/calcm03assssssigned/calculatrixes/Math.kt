package com.saucefan.stuff.calcm03assssssigned.calculatrixes

import kotlin.math.absoluteValue

class Math() {


    fun getSquareSum(x: Int, y: Int): Int {

        //the sum of two numbers squared
        //or
        //"calculate the sum of squares of two numbers"
        return (x * x) + (y * y)

    }

    fun factorial(x: Int): Int {
        val sum = x
        if (x > 0) {
            for (i in x..1) {
                sum + x

            }
        }
        return sum
    }

    fun diffAbsValue(x: Int, y: Int): Int {
        val absX = x.absoluteValue
        val absY = y.absoluteValue
        if (absX >= absY) {
            return absX - absY
        }
        return absY - absX
    }

    fun palidrome(string: String): Boolean {
            val string = string.toCharArray()
            val reverse = string.reversed().toCharArray()
            for (i in string.indices) {
                if (string[i] != reverse[i]) {
                    return false
                }
            }
            return true

        }



}