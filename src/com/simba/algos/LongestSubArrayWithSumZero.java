package com.simba.algos;

import java.util.*;

public class LongestSubArrayWithSumZero {

    public static int longestSubArrayWithSumZero(int[] arr) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            // add the current array int to sum;
            // if map contains the sum, get the key and minus the current index from it to get the length of the zero sum substring.
            // compare the maxLength value from the difference and update it.
            // else put the sum and the index in the map
            sum += arr[i];
            if (sumMap.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - sumMap.get(sum));
            } else
                sumMap.put(sum, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Length of the longest subarray with sum 0: " + longestSubArrayWithSumZero(arr));
    }
}
