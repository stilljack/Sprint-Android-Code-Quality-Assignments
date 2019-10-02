package com.saucefan.stuff.calcm03assssssigned

import com.saucefan.stuff.calcm03assssssigned.calculatrixes.Calc
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

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



class MathUnitTest {
    val ezMath =com.saucefan.stuff.calcm03assssssigned.calculatrixes.Maths()
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