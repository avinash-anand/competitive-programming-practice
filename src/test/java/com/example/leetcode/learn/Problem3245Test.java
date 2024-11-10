package com.example.leetcode.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem3245Test {

    @Test
    void testcase1() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        new Problem3245().duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testcase2() {
        int[] arr = {1, 2, 3};
        int[] expected = {1, 2, 3};
        new Problem3245().duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }

}
