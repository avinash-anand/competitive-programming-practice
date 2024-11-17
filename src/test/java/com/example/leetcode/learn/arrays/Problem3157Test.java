package com.example.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem3157Test {

    @Test
    void testcase1() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expectedNums = {1, 3, 12, 0, 0};
        new Problem3157().moveZeroes(nums);
        assertArrayEquals(expectedNums, nums);
    }

    @Test
    void testcase2() {
        int[] nums = {0};
        int[] expectedNums = {0};
        new Problem3157().moveZeroes(nums);
        assertArrayEquals(expectedNums, nums);
    }

}
