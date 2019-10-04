package com.saucefan.stuff.calcm03assssssigned

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths

class CalcViewModel : ViewModel() {

    companion object {
        var displayString = "0"
        //
        //previous entries and a ref to them
        var stack:MutableList<String> = mutableListOf<String>()
        var mapToStack= stack.associateBy {  Int to it }
        val displayStringLive: MutableLiveData<String> by lazy {
            MutableLiveData<String>()

        }
        val maths =Maths()
    }

    ///ahahahajajaja how bad can I fuck this up
    fun compute(): Boolean {
        //so we are going to need to pop out longs,
        //til we hit an operator.
        //then we need to pop out more longs,
        //til we hit the end or another operator.

        var stringToEval = displayStringLive.value
        var extracted: CharArray = stringToEval?.toCharArray() ?: CharArray(1)
        var strA = ""
        var strB = ""
        var final: Long = 0L
        var x: Long = 0L
        var y: Long = 0L

        for (i in extracted.indices) {
            if (extracted[i].isLetterOrDigit()) {
                strA += extracted[i]
             //   extracted.drop(i)
            } else {
                strA += ","
                strB += extracted[i]
             //   extracted.drop(i)
            }
        }


        var strSplit = strA.split(",").toTypedArray()
        var operands = strB.toCharArray()

        //if you got at least two values to work on lets work on em
        for (i in operands.indices) {

            //first check if it's a factorial (only one variable)
            if (operands[i].toString() == "!") {
                //check if final is empty, if not run factorial on final
                if (final != 0L) {
                    final = computeHelper("!", final)
                } else {
                    x = strSplit[0].toLong()
                    final = computeHelper("!", x)
                    strSplit.drop(0)
                }
            }
                //ok so not a factorial, is final empty?
                if (final != 0L) {
                    //is strsplit empty so we can get a y variable?
                    if (strSplit.isNotEmpty()) {
                        y = strSplit[0].toLong()
                        final = computeHelper(operands[i].toString(), final, y)
                    }
                    //if we get here we are out of strsplits and final is calculated as best it can be,
                    //so we clean up
                    else {
                        endComputer(final)
                        return true
                    }
                }
                //ok so final is empty, lets make sure we have at least two variables
                if (strSplit.size > 1) {
                    //cool, lets compute 'em
                    x = strSplit[0].toLong()
                    y = strSplit[1].toLong()
                    final = computeHelper(operands[i].toString(), x, y)
                    strSplit.drop(0)
                    strSplit.drop(0)
                }
// we done here
                else {
                    endComputer(final)
                    return true
                }
            }

        endComputer(final)
        return false
    }

    fun endComputer(final: Long) {

        stack.add(final.toString())
        setDisplayString(final.toString())
    }





    fun computeHelper(operand:String,x:Long,y:Long =0L):Long{

    var final:Long=0L
        when (operand) {
            "+" -> {
                final = maths.add(x, y)

            }
            "-" -> {
                final = maths.subtract(x, y)
            }
            "!" -> {
                final = maths.factorial(x)

            }
            "*" -> {
                final = maths.multiply(x, y)
            }
            "÷" -> {
                if (x != 0L && y != 0L) {
                    throw Exception("can't divide by zero!")
                }
                final = maths.divide(x, y)
            }

        }
            return final
    }




// oh god i hate using !!
    fun backspace() {
        if (displayStringLive.value == "0") {
            displayStringLive.value = "0"
        } else if (displayStringLive.value!!.length > 1) {
            displayStringLive.value= displayStringLive.value?.dropLast(1) ?: "0"
        } else {
            displayStringLive.value = "0"
        }
    }

    fun clear() {
        displayStringLive.value="0"
    }

fun setDisplayString(string:String) {
    displayStringLive.value=string
}
    fun getDisplayString():MutableLiveData<String> {
        if (displayStringLive.value.isNullOrEmpty()){
            displayStringLive.value= displayString
        }
        return displayStringLive
    }


    fun addToString(string: String) {
        //if this number is 0, replace
        if (displayStringLive.value=="0"){
            displayStringLive.value=string
            //else add it to the end of the string
        }else {
            displayStringLive.value = displayStringLive.value + string
        }
        }



    fun addToStack(string:String) {

    }



















}