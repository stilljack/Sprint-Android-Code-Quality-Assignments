package com.saucefan.stuff.calcm03assssssigned

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

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