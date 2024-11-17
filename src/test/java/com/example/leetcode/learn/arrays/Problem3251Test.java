package com.example.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem3251Test {

    @Test
    void testcase1() {
        Problem3251 problem3251 = new Problem3251();
        int[] arr = {2, 1};
        assertFalse(problem3251.validMountainArray(arr));
    }

    @Test
    void testcase2() {
        Problem3251 problem3251 = new Problem3251();
        int[] arr = {3, 5, 5};
        assertFalse(problem3251.validMountainArray(arr));
    }

    @Test
    void testcase3() {
        Problem3251 problem3251 = new Problem3251();
        int[] arr = {3, 5, 3};
        assertTrue(problem3251.validMountainArray(arr));
    }

    @Test
    void testcase4() {
        Problem3251 problem3251 = new Problem3251();
        int[] arr = {0, 3, 2, 1};
        assertTrue(problem3251.validMountainArray(arr));
    }

    @Test
    void testcase5() {
        Problem3251 problem3251 = new Problem3251();
        int[] arr = {0, 2, 3, 4, 5, 2, 1, 0};
        assertTrue(problem3251.validMountainArray(arr));
    }

    @Test
    void testcase6() {
        Problem3251 problem3251 = new Problem3251();
        int[] arr = {0, 2, 3, 3, 5, 2, 1, 0};
        assertFalse(problem3251.validMountainArray(arr));
    }

    @Test
    void testcase7() {
        Problem3251 problem3251 = new Problem3251();
        int[] arr = {3, 7, 6, 4, 3, 0, 1, 0};
        assertFalse(problem3251.validMountainArray(arr));
    }

}
