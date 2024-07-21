/**
 * @author Cindy
 */

package com.cindy.Day01;

public class Demo {
    public static int binarySearch(int[] arr, int target) {
        int left = 0,right =arr.length;
        while (right - left> 1){
            int mid = (left + right) >>> 1;
            if (target < arr[mid]){
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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 7));
        System.out.println(binarySearch(arr, 8));
        System.out.println(binarySearch(arr, 9));
    }
}
