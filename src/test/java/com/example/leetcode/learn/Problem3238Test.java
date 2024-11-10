package com.example.leetcode.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3238Test {

    @Test
    void sampleTest1() {
        Problem3238 problem = new Problem3238();
        int[] nums = {1, 1, 0, 1, 1, 1};
        assertEquals(3, problem.findMaxConsecutiveOnes(nums));
    }

    @Test
    void sampleTest2() {
        Problem3238 problem = new Problem3238();
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(2, problem.findMaxConsecutiveOnes(nums));
    }

}
