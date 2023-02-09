package com.timtez.leetcode;

public class FindPositionOfElementInInfiniteSortedArray {
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

    /*
    * Since the array is an infinite array, we cannot use the length property to implement binary search.
    * The idea then is to use two pointers to get the range that the target falls between.
    * by increasing the start pointer by one, and the end pointer by (endIndex + 2 * (length of previous range));
    *
    * if we get to the point where target is less than end;
    * we then use binarySearch to get it's index. Because we not have the start and end positions for our search space.
    * */
    public static void main (String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(getRange(arr, target));
    }

    static int getRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + 2 * (end - start + 1);
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
