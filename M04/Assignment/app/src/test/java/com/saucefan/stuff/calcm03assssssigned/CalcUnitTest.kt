package com.saucefan.stuff.calcm03assssssigned

import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Calc
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class CalcUnitTest {
    val ezMaths =com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths()
    val ezCalc = Calc(ezMaths)

fun factorialTest() {
    val num1 = 5L
    val expected = 120L


    val math = mock(com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths::class.java)
    `when`(math.factorial(num1)).thenReturn(expected)
    val calc = Calc(math)

    //execute
    val sum = calc.factorial(num1)

    //check
    assertEquals(expected, sum)
}

fun differenceTest(){
    val num1 =20L
    val num2 =10L
    val expected =10L


    val math = mock(com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths::class.java)
    `when`(math.diffAbsValue(num1,num2)).thenReturn(expected)
    val calc =Calc(math)

    //execute
    val sum=calc.difference(num1,num2)

    //check
    assertEquals(expected,sum)

}


    fun getSquareSumTest() {
        val num1 =4L
        val num2 =4L
        val expected =32L

        val math = mock(com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths::class.java)
        `when`(math.getSquareSum(num1,num2)).thenReturn(expected)
        val calc =Calc(math)


        //execute
        val sum=calc.getSquareSum(num1,num2)

        //check
        assertEquals(expected,sum)

}


}



class MathUnitTest () {
    val ezMath = com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths()
    val ezCalc = Calc(ezMath)

    //like ya had 20 bucks to pay the asian kid,
    //ezmath.


    fun palindromeTest() {

        assertTrue { ezMath.palidrome("bob") }
        assertTrue { ezMath.palidrome("racecar") }
        assertFalse { ezMath.palidrome("sauce") }


        assertFalse { ezMath.palidrome("Moeeee") }

    }



   /* val testCases = mapOf(
        61888.123 to ">50 km",
        38777.23 to "38.8 km",
        16984.44 to "17.0 km",
        987.98 to "988 m"
    )*/


}


class MathUnitTestParams : Spek({
    val ezMath = com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths()
    val testCases = mapOf(
        5L to 120L,
        1L to 1L,
        3L to 6L,
        6L to 720L
    )
    test("this"){
        assertEquals(120L, ezMath.factorial(5L))
    }
    describe("distance converter") {



        testCases.forEach { value, expectedValue ->
            it("$value") {
                assertEquals(expectedValue, ezMath.factorial(value))
            }
        }
    }
})

class MathAbsTestParams : Spek({
    val ezMath = com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths()
    val testCases = mapOf(
        listOf<Long>(100,-100) to 0L,
        listOf<Long>(0,-100) to 100L,
        listOf<Long>(-100,100) to 0L,
        listOf<Long>(50,-75) to 25L
    )
    test("single factorial test"){
        assertEquals(120, ezMath.factorial(5))
    }
    describe("category for the test cases") {



        testCases.forEach { value, expectedValue ->
            it("${value[0]} +${value[1]}, $expectedValue") {
                assertEquals(expectedValue, ezMath.diffAbsValue(value[0],value[1]))
            }
        }
    }
})


/*
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


*/*/
