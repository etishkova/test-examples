package com.elena.samplelib_kotlin

import org.junit.Assert
import org.junit.Test

class TrappedWaterTest {

    private val emptyArray: IntArray = intArrayOf()
    private val oneValue: IntArray = intArrayOf(5)
    private val twoValues: IntArray = intArrayOf(5, 7)
    private val example1: IntArray = intArrayOf(3, 0, 2, 0, 4)
    private val example2: IntArray = intArrayOf(3, 0, 1)
    private val example3: IntArray = intArrayOf(1, 0, 0, 0, 1)
    private val example4: IntArray = intArrayOf(0, 0, 8, 0, 0)

    private val trappedWater = TrappedWater()

    @Test
    fun `when empty return 0`() {
        Assert.assertEquals(0, trappedWater.calculateTrappedWater(emptyArray))
    }

    @Test
    fun `when one value return 0`() {
        Assert.assertEquals(0, trappedWater.calculateTrappedWater(oneValue))
    }

    @Test
    fun `when two values return 0`() {
        Assert.assertEquals(0, trappedWater.calculateTrappedWater(twoValues))
    }

    @Test
    fun `when example1 returns 7`() {
        Assert.assertEquals(7, trappedWater.calculateTrappedWater(example1))
    }

    @Test
    fun `when example2 returns 1`() {
        Assert.assertEquals(1, trappedWater.calculateTrappedWater(example2))
    }

    @Test
    fun `when example3 returns 3`() {
        Assert.assertEquals(3, trappedWater.calculateTrappedWater(example3))
    }

    @Test
    fun `when example4 returns 0`() {
        Assert.assertEquals(0, trappedWater.calculateTrappedWater(example4))
    }
}