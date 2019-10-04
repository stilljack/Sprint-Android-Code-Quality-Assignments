package com.saucefan.stuff.calcm03assssssigned.calculatrixes

import kotlin.math.absoluteValue

class Maths() {


    fun add(x:Long,y:Long): Long {

        return x+y
    }

    fun subtract (x:Long,y:Long):Long {
        return x-y
    }

    fun divide (x:Long,y:Long):Long {

        return x.div(y)
    }

    fun multiply (x:Long,y:Long):Long {
        return x*y

    }

    fun getSquareSum(x: Long, y: Long): Long {

        //the sum of two numbers squared
        //or
        //"calculate the sum of squares of two numbers"
        return (x * x) + (y * y)

    }

    fun factorial(x: Long): Long {
        var sum = x
        if (x > 0) {
            for (i in x-1 downTo 1) {
                sum *= i
            }
        }
        return sum
    }

    fun diffAbsValue(x: Long, y: Long): Long {
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