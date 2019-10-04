package com.saucefan.stuff.calcm03assssssigned

import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel() {

    companion object {
        var displayString = ""
        var stack:MutableList<String> = mutableListOf<String>()
        var mapToStack= stack.associateBy {  Int to it }

    }

fun setDisplayString(string:String) {
    displayString=string
}

    fun getDisplayString(string:String):String {
        return displayString
    }


}