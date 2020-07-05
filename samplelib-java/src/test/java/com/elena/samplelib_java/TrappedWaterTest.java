package com.elena.samplelib_java;

import org.junit.Assert;
import org.junit.Test;

public class TrappedWaterTest {

    private int[] emptyArray = {};
    private int[] oneValue = {5};
    private int[] twoValues = {5, 7};
    private int[] example1 = {3, 0, 2, 0, 4};
    private int[] example2 = {3, 0, 1};
    private int[] example3 = {1, 0, 0, 0, 1};
    private int[] example4 = {0, 0, 8, 0, 0};

    private TrappedWater trappedWater = new TrappedWater();

    @Test
    public void whenEmptyArray_thenReturn_0() {
        Assert.assertEquals(0, trappedWater.calculateTrappedWater(emptyArray));
    }

    @Test
    public void whenOneValue_thenReturn_0() {
        Assert.assertEquals(0, trappedWater.calculateTrappedWater(oneValue));
    }

    @Test
    public void whenTwoValues_thenReturn_0() {
        Assert.assertEquals(0, trappedWater.calculateTrappedWater(twoValues));
    }

    @Test
    public void whenExample1_thenReturn_7() {
        Assert.assertEquals(7, trappedWater.calculateTrappedWater(example1));
    }
    @Test
    public void whenExample2_thenReturn_1() {
        Assert.assertEquals(1, trappedWater.calculateTrappedWater(example2));
    }

    @Test
    public void whenExample3_thenReturn_3() {
        Assert.assertEquals(3, trappedWater.calculateTrappedWater(example3));
    }

    @Test
    public void whenExample4_thenReturn_0() {
        Assert.assertEquals(0, trappedWater.calculateTrappedWater(example4));
    }
}