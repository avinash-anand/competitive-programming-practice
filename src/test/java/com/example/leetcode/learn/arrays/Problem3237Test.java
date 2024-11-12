package com.example.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3237Test {

    @Test
    void testCase1() {
        int[] nums = {12, 345, 2, 6, 7896};
        int expected = 2;
        int actual = new Problem3237().findNumbers(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testCase2() {
        int[] nums = {555, 901, 482, 1771};
        int expected = 1;
        int actual = new Problem3237().findNumbers(nums);
        assertEquals(expected, actual);
    }

}
