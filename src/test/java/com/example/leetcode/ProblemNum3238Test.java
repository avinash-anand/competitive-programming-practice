package com.example.leetcode;

import com.example.leetcode.learn.ProblemNum3238;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemNum3238Test {

    @Test
    void sampleTest1() {
        ProblemNum3238 problem = new ProblemNum3238();
        int[] nums = {1, 1, 0, 1, 1, 1};
        assertEquals(3, problem.findMaxConsecutiveOnes(nums));
    }

    @Test
    void sampleTest2() {
        ProblemNum3238 problem = new ProblemNum3238();
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(2, problem.findMaxConsecutiveOnes(nums));
    }

}
