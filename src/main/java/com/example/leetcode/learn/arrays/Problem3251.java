package com.example.leetcode.learn.arrays;

/**
 * Valid Mountain Array
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 * <p>
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 * <p>
 * Input: arr = [0,3,2,1]
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 104
 */

public class Problem3251 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        } else {
            int increasingTill = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                increasingTill = i;
                if (arr[i] >= arr[i + 1]) {
                    break;
                }
            }
            var increasingSortedArray = new int[increasingTill + 1];
            System.arraycopy(arr, 0, increasingSortedArray, 0, increasingTill + 1);
            if (increasingSortedArray.length < 2) {
                return false;
            }
            int decreasingFrom = increasingTill;
            var decreasingSortedArray = new int[arr.length - decreasingFrom];
            System.arraycopy(arr, decreasingFrom, decreasingSortedArray, 0, arr.length - decreasingFrom);
            if (decreasingSortedArray.length < 2) {
                return false;
            }
            for (int i = 0; i < decreasingSortedArray.length - 1; i++) {
                if (decreasingSortedArray[i] <= decreasingSortedArray[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
