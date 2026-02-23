package com.dsa888.problems.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P001_TwoSumTest {

    private final P001_TwoSum sol = new P001_TwoSum();

    @Test
    void testBasicCase() {
        assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void testElementsNotAtStart() {
        assertArrayEquals(new int[]{1, 2}, sol.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void testDuplicates() {
        assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{3, 3}, 6));
    }
}
