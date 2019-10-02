package com.saucefan.stuff.gcalc

import junit.framework.Assert.assertEquals
import org.junit.Test

class MathUnitTest {

    @Test
    fun testAddIntegers() {
        //initial conditions
        val num1 =1
        val num2 =5
        val expected =6
        val math:Math = Math()

        //execute
        val sum=math.addIntegers(num1,num2)

        //check
        assertEquals(expected,sum)




    }

    @Test
    fun testMultiplyIntegers() {
        //initial conditions
        val num1 =3
        val num2 =5
        val expected =6
        val math:Math = Math()

        //execute

        val sum=math.multiplyIntegers(num1,num2)

        //check
        assertEquals(15,sum)




    }



}