package com.example.leetcode.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem3253Test {

    @Test
    void testcase1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        new Problem3253().merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testcase2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        new Problem3253().merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testcase3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        new Problem3253().merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

}
