package com.example.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3248Test {

    @Test
    void testcase1() {
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2};
        int k = new Problem3248().removeDuplicates(nums);
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void testcase2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};
        int k = new Problem3248().removeDuplicates(nums);
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void testcase3() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] expectedNums = {1};
        int k = new Problem3248().removeDuplicates(nums);
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void testcase4() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = new Problem3248().removeDuplicates(nums);
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }


}
