package com.example.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem3250Test {

    @Test
    void testcase1() {
        int[] arr = {10, 2, 5, 3};
        assertTrue(new Problem3250().checkIfExist(arr));
    }

    @Test
    void testcase2() {
        int[] arr = {3, 1, 7, 11};
        assertFalse(new Problem3250().checkIfExist(arr));
    }

    @Test
    void testcase3() {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        assertFalse(new Problem3250().checkIfExist(arr));
    }

    @Test
    void testcase4() {
        int[] arr = {0, 0};
        assertTrue(new Problem3250().checkIfExist(arr));
    }

    @Test
    void testcase5() {
        int[] arr = {7,1,14,11};
        assertTrue(new Problem3250().checkIfExist(arr));
    }

}
