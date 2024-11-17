package com.example.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem3259Test {

    @Test
    void testcase1() {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] expected = {18, 6, 6, 6, 1, -1};
        Problem3259 problem3259 = new Problem3259();
        int[] result = problem3259.replaceElements(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void testcase2() {
        int[] arr = {400};
        int[] expected = {-1};
        Problem3259 problem3259 = new Problem3259();
        int[] result = problem3259.replaceElements(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void testcase3() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 5, 5, 5, -1};
        Problem3259 problem3259 = new Problem3259();
        int[] result = problem3259.replaceElements(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void testcase4() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {4, 3, 2, 1, -1};
        Problem3259 problem3259 = new Problem3259();
        int[] result = problem3259.replaceElements(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void testcase5() {
        int[] arr = {17, 18, 5, 5, 6, 1};
        int[] expected = {18, 6, 6, 6, 1, -1};
        Problem3259 problem3259 = new Problem3259();
        int[] result = problem3259.replaceElements(arr);
        assertArrayEquals(expected, result);
    }

}
