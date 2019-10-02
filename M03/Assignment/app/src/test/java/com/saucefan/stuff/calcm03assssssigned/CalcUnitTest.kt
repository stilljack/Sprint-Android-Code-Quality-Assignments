package com.saucefan.stuff.calcm03assssssigned

import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Calc
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.runners.Parameterized
import org.junit.runner.RunWith
import java.util.*
import kotlin.collections.ArrayList


class CalcUnitTest {
    val ezMaths =com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths()
    val ezCalc = Calc(ezMaths)

@Test
fun factorialTest() {
    val num1 = 5
    val expected = 120


    val math = mock(com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths::class.java)
    `when`(math.factorial(num1)).thenReturn(expected)
    val calc = Calc(math)

    //execute
    val sum = calc.factorial(num1)

    //check
    assertEquals(expected, sum)
}
@Test
fun differenceTest(){
    val num1 =20
    val num2 =10
    val expected =10


    val math = mock(com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths::class.java)
    `when`(math.diffAbsValue(num1,num2)).thenReturn(expected)
    val calc =Calc(math)

    //execute
    val sum=calc.difference(num1,num2)

    //check
    assertEquals(expected,sum)

}

    @Test
    fun getSquareSumTest() {
        val num1 =4
        val num2 =4
        val expected =32

        val math = mock(com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths::class.java)
        `when`(math.getSquareSum(num1,num2)).thenReturn(expected)
        val calc =Calc(math)


        //execute
        val sum=calc.getSquareSum(num1,num2)

        //check
        assertEquals(expected,sum)

}


}


@RunWith(Parameterized::class)
class MathUnitTest (private val fInput: Int, private val fExpected: Int) {
    val ezMath =com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths()
    val ezCalc = Calc(ezMath)

    //like ya had 20 bucks to pay the asian kid,
    //ezmath.

    @Test
    fun palindromeTest() {

        assertTrue {  ezMath.palidrome("bob")}
        assertTrue {  ezMath.palidrome("racecar")}
        assertFalse { ezMath.palidrome("sauce") }


        assertFalse { ezMath.palidrome("Moeeee") }

    }


    object Parameters {
        @Parameterized.Parameters
        fun parameters(): ArrayList<List<Int>> {
            return arrayListOf<List<Int>>(
                listOf<Int>(0, 0),
                listOf<Int>(1, 1),
                listOf<Int>(2, 2),
                listOf<Int>(3, 6),
                listOf<Int>(4, 24),
                listOf<Int>(5, 120),
                listOf<Int>(6, 720)
            )
        }
    }

    @Test
    fun sumsTest() {


        assertEquals(fExpected, ezMath.factorial(fInput))








    }

    @RunWith(Parameterized::class)
    inner class FibonacciTest(private val fInput: Int, private val fExpected: Int) {
        @Test
        fun test() {
            assertEquals(fExpected, ezMath.factorial(fInput))
        }
        }
    }
/*

object Fibonacci {
    @MathUnitTest.Parameters
    public fun data(): Collection<Array<Any>> {
        return Arrays.asList(
            arrayOf(
                arrayOf<Any>(0, 0),
                arrayOf<Any>(1, 1),
                arrayOf<Any>(2, 1),
                arrayOf<Any>(3, 2),
                arrayOf<Any>(4, 3),
                arrayOf<Any>(5, 5),
                arrayOf<Any>(6, 8)
            )
        )
    }
}


*/
