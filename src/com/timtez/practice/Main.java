package com.timtez.practice;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }
        private static int[] twoSum(int[] nums, int target) {
            // check for the difference between the target and each element in the
            // array, if we have never seen it, add it and its index to the Hashmap
            // as key value pairs; else if the Hashmap contains it return an array
            // of the value of the corresponding key and the current iteration
            // index;
            // int[] array = {-3, 2, 3, 3, 6, 8, 15};
            //        int[] answer = twoSum(array, 6);
            HashMap<Integer, Integer> seen = new HashMap<>();
            int[] result = new int[2];

            for (int index = 0; index < nums.length; index++) {
                int diff = target - nums[index];
                if (seen.containsKey(diff)) {
                    return new int[] {seen.get(diff), index};
                } else {
                    seen.put(nums[index], index);
                }
            }
            return new int[] {0, 0};
        }

        private static void addZeroes(int[] nums) {
            // Using the two pointer method, one pointer keeps track of the non-zero values
            // While the other traverses through each element of the array, if it encounters
            // a non-zero value, it pushes it to the array using the lastIndexOfNoneZero as
            // the position where to place it in the array. Then increments its value.
            int lastIndexOfNoneZero = 0;

            for (int currentNum = 0; currentNum < nums.length; currentNum++) {
                if (nums[currentNum] != 0)
                    // push that non-zero value to the after the non-zero value
                    // and increase the lastIndexOfNoneZero
                    nums[lastIndexOfNoneZero++] = nums[currentNum];
            }

            // add zeros to the rest of the array, from the last index of the non-zero value
            for (int zeros = lastIndexOfNoneZero; zeros <= nums.length; zeros++)
                nums[zeros] = 0;
        }

//        private int firstBadVersion(int n) {
//            int start = 0;
//            int end = n;
//            int mid;
//
//            while (start <= end) {
//                mid = start + (end - start) / 2;
//            // BINARY SEARCH
//                if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
//                    return mid;
//                } else if (isBadVersion(mid) == false) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//            return -1;
//        }
}