/**
 * @author Cindy
 */

package com.cindy.Day01;
/*基础二分查找*/
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /*改动版的*/
    public static int binarySearch2(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /*平衡版的*/
    public static int binarySearch3(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (right - left > 1) {
            int mid = (left + right) >>> 1;
            if (arr[mid] > target){
                right = mid;
            }else {
                left = mid;
            }
        }
        if (arr[left] == target){
            return left;
        }
        return -1;
    }
}
