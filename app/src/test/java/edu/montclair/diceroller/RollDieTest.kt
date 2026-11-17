package edu.montclair.diceroller

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RollDieTest {

    @Test
    fun rollDie_alwaysReturnsValueBetweenOneAndSix() {
        repeat(1000) {
            val roll = rollDie()
            assertTrue("Roll was $roll", roll in 1..6)
        }
    }

    @Test
    fun rollDie_canLandOnEveryFace() {
        val faces = mutableSetOf<Int>()
        repeat(1000) { faces.add(rollDie()) }
        assertEquals(setOf(1, 2, 3, 4, 5, 6), faces)
    }
}
