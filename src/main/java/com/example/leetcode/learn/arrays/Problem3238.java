package com.example.leetcode.learn.arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 * <p>
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */

public class Problem3238 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int ones = 0;
        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
            if (ones > maxOnes) {
                maxOnes = ones;
            }
            if (num == 0) {
                ones = 0;
            }
        }
        return maxOnes;
    }
}
