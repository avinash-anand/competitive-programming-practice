package com.example.leetcode.learn;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 * <p>
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 * <p>
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 9
 */


public class Problem3245 {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length && j < arr.length; i++, j++) {
            temp[j] = arr[i];
            if (arr[i] == 0 && j + 1 < arr.length) {
                j++;
                temp[j] = 0;
            }
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}
