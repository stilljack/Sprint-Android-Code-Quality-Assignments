package com.saucefan.stuff.gcalc

class Calculator (private val math: Math) {


    fun add(a:Int,b:Int):Int {
        return math.addIntegers(a,b)
    }

    fun palindrome(string: String): Boolean {
        val string = string.toCharArray()
        val reverse = string.reversed().toCharArray()
        for (i in string.indices) {
            if (string[i] != reverse[i] ) {
                return false
            }
        }
        return true

    }

}