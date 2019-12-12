package com.jws.samples.leetcode.algorithm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void twoSum() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{12, 2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, solution.twoSum(new int[]{22, 3, 11, 23}, 26));
        assertArrayEquals(new int[]{2, 3}, solution.twoSum(new int[]{2, 7, 11, 15}, 26));
        assertArrayEquals(new int[]{0, 0}, solution.twoSum(new int[]{3, 3, 3, 4}, 34));
        assertArrayEquals(new int[]{0, 0}, solution.twoSum(null, 34));
    }
}