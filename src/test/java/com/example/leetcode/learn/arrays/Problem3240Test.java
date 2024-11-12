package com.example.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem3240Test {

    @Test
    void testcase1() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        int[] result = new Problem3240().sortedSquares(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testcase2() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};
        int[] result = new Problem3240().sortedSquares(nums);
        assertArrayEquals(expected, result);
    }

}
