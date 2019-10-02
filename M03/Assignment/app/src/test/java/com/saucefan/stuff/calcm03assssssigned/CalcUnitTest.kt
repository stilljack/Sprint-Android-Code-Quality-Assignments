package com.saucefan.stuff.calcm03assssssigned

import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Calc
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class MathUnitTest {

    val ezMath =com.saucefan.stuff.calcm03assssssigned.calculatrixes.Math()
    val ezCalc = Calc(ezMath)
    //like ya had 20 bucks to pay the asian kid,
    //ezmath.

    @Test
    fun palindromeTest() {
        assertTrue {  ezMath.palidrome("bob")}
        assertTrue {  ezMath.palidrome("racecar")}

        assertFalse { ezMath.palidrome("sauce") }
    }






}