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

fun setDisplayString(string:String) {
    displayStringLive.value=string
}
    fun getDisplayString():MutableLiveData<String> {
        if (displayStringLive.value.isNullOrEmpty()){
            displayStringLive.value= displayString
        }
        return displayStringLive
    }


    fun addToString() {

    }



    fun addToStack(string:String) {

    }



















}