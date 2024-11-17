package com.example.leetcode.learn.arrays;

import java.util.Arrays;

/**
 * Replace Elements with Greatest Element on Right Side
 * <p>
 * <p>
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * Explanation:
 * <p>
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).<p>
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).<p>
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).<p>
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).<p>
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).<p>
 * - index 5 --> there are no elements to the right of index 5, so we put -1.<p>
 * Example 2:
 * <p>
 * Input: arr = [400]
 * Output: [-1]
 * Explanation: There are no elements to the right of index 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 104
 * 1 <= arr[i] <= 105
 */

public class Problem3259 {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                max = arr[i];
                arr[i] = -1;
//                System.out.println("max = " + max + ", arr = " + Arrays.toString(arr));
            } else if (arr[i] >= max) {
                var temp = max;
                max = arr[i];
                arr[i] = temp;
//                System.out.println("max = " + max + ", arr = " + Arrays.toString(arr));
            } else {
                arr[i] = max;
//                System.out.println("max = " + max + ", arr = " + Arrays.toString(arr));
            }
        }
        return arr;
    }
}
