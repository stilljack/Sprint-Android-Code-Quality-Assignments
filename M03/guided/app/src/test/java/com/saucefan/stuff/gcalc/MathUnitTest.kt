package com.saucefan.stuff.gcalc

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertFalse
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MathUnitTest {
        val math =Math()
        val calc =Calculator(math)
    @Test
    fun palindromeTest() {
        assertTrue {  calc.palindrome("bob")}
        assertTrue {  calc.palindrome("racecar")}
        assertFalse { calc.palindrome("sauce") }
    }



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
    fun testCalcAddIntegers() {
        //initial conditions
        val num1 =20
        val num2 =10
        val expected =210
        val math:Math = mock(Math::class.java)
        `when`(math.addIntegers(num1,num2)).thenReturn(expected)
        val calc =Calculator(math)
        //execute
        val sum=math.addIntegers(num1,num2)

        //check
        assertEquals(200,sum)




    }

    @Test
    fun testMultiplyIntegers() {
        //initial conditions
        val num1 =3655555555
        val num2 =5266666662
        val expected =num1*num2
        val math:Math = Math()

        //execute

        val sum=math.multiplyIntegers(num1,num2)

        //check
        assertEquals(expected,sum)




    }



}