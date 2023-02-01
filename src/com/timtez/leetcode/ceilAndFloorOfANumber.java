package com.timtez.leetcode;

public class ceilAndFloorOfANumber {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int target = 7;
        System.out.println(floorOfANumber(array, target, 0, array.length));
    }

    static int ceilOfANumber(int[] array, int target) {
        int start = 0;
        int end = array.length;

        int result = 0;

        // if the array is empty return -1;
        if (end == 0)
            return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                return array[mid];
            else if (array[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        // return the next number that is greater than target. At this point the while loop condition for the while loop has been violated.
        return start;
    }

    static int floorOfANumber(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;
        // if the last element is smaller than or equal to target return that value.
        if (arr[end] <= target)
            return arr[end];

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return arr[mid];
        // if target is between mid and mid-1
        else if (mid > 0 && arr[mid-1] <= target && target < arr[mid])
            return arr[mid-1];
        else if (arr[mid] > target)
            return floorOfANumber(arr, target, start, mid-1);
        else
            return floorOfANumber(arr, target, mid+1, end);
    }
}
