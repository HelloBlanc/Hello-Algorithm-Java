/**
 * @author Cindy
 */

package com.cindy.Day01;

public class BinarySearch3 {
    public static int leftMost(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target <= arr[mid]) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int rightMost(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target < arr[mid]) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left - 1;
    }
}
