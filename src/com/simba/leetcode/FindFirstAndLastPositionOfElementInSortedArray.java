package com.simba.leetcode;


// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FindFirstAndLastPositionOfElementInSortedArray {
    /*
    * Input: nums = [5,7,7,8,8,10], target = 8, Output: [3,4];
    *
    * The idea is when you search the array and get the target, keep searching to the left
    * and the to the right till you get the first and last occurrences of the target, then
    * return the index. That's why we used two (2) binary searches;
    *
    * The bruteForce approach would be to use two pointers, one at the start and one at the end of the array.
    * if we see the first and last instances matching the target we return their index.
    * */

    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10}; int target = 8;
        int[] ans = getFirstAndLastOccurrence(array, target);
        System.out.println(ans);
    }

    // more elegant solution;
    public static int[] getFirstAndLastOccurrence(int[] array, int target) {
        int[] result = {-1, -1};

        result[0] = search(array, target, true);
        result[1] = search(array, target, false);
        return result;
    }

    public static int search(int[] array, int target, boolean findFirstOccurence) {
        int index = -1;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (array[middle] > target)
                end = middle - 1;
            else if (array[middle] < target)
                start = middle + 1;
            else {
                // potential answer, no we search either left or right;
                index = middle;
                if (findFirstOccurence)
                    end = middle - 1; // search left
                else
                    start = middle + 1; // search right
            }
        }
        return index;
    }

    // this is a longer solution but same idea.
    public int[] searchRange(int[] array, int target) {
        int[] res = new int[2];
        res[0] = getFirstOccurrence(array, target);
        res[1] = getLastOccurrence(array, target);
        return res;
    }

    int getFirstOccurrence(int[] array, int target) {
        int index = -1;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (array[middle] > target)
                end = middle - 1;
            else if (array[middle] < target)
                start = middle + 1;
            else {
                index = middle;
                end = middle - 1;
            }
        }
        return index;
    }

    int getLastOccurrence(int[] array, int target) {
        int index = -1;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (array[middle] > target)
                end = middle - 1;
            else if (array[middle] < target)
                start = middle + 1;
            else {
                index = middle;
                start = middle + 1;
            }
        }
        return index;
    }
}
