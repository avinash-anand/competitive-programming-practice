package com.example.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3247Test {

    @Test
    void test1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2};
        int k = new Problem3247().removeElement(nums, val);
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i], "Element at index " + i + " should be " + expectedNums[i] + " but was " + nums[i]);
        }
    }

    @Test
    void test2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 1, 3, 0, 4};
        int k = new Problem3247().removeElement(nums, val);
        assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        Arrays.sort(expectedNums);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

}
