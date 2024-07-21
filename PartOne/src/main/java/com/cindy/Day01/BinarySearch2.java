/**
 * @author Cindy
 */

package com.cindy.Day01;

public class BinarySearch2 {
    /*基础版二分查找*/
    public static int binarySearch1(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (arr[mid] > target) {
                j = mid - 1;
            } else if (arr[mid] < target) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /*改动版二分查找*/
    public static int binarySearch2(int[] arr, int target) {
        int i = 0, j = arr.length;
        while (i < j) {
            int mid = (i + j) >>> 1;
            if (arr[mid] > target) {
                j = mid;
            } else if (arr[mid] < target) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /*平衡版*/
    public static int binarySearchThe(int[] arr, int target) {
        int i = 0, j = arr.length;
        while (j - i > 1) {
            int mid = (i + j) >>> 1;
            if (arr[mid] > target) {
                j = mid;
            }else {
                i = mid;
            }
        }
        if (arr[i] == target){
            return i;
        }
        return -1;
    }

    /*如果有重复, 返回最左边查询的*/
    public static int binarySearch4(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        int condition = -1; /*记录候选位置*/
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (arr[mid] > target) {
                j = mid - 1;
            }else if (arr[mid] < target) {
                i = mid + 1;
            }else {
                condition = mid;
                j = mid - 1;
            }
        }
        return condition;
    }

    /*如果有重复, 返回最右边查询的*/
    public static int binarySearch5(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        int condition = -1; /*记录候选位置*/
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (arr[mid] > target) {
                j = mid - 1;
            }else if (arr[mid] < target) {
                i = mid + 1;
            }else {
                condition = mid;
                i = mid + 1;
            }
        }
        return condition;
    }

    /*如果有重复, 返回最左边查询的,返回值为插入位置*/
    public static int binarySearch6(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        int condition = -1; /*记录候选位置*/
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (arr[mid] >= target) {
                j = mid - 1;
            }else {
                i = mid + 1;
            }
        }
        return i;
    }

    /*如果有重复, 返回最右边查询的*/
    public static int binarySearch7(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        int condition = -1; /*记录候选位置*/
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (arr[mid] > target) {
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return i - 1;
    }
}
