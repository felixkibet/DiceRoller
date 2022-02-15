package com.example.diceroller

import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertNotEquals(5, 2 + 2)
    }

    @Test
    fun generateNumber() {
        val dice = Dice(6)
        val rolledResult = dice.roll()

        assertTrue("Result in the range 1 to 6", rolledResult in 1..6)
    }
}