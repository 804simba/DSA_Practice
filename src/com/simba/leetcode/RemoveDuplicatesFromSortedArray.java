package com.simba.leetcode;

import java.util.Arrays;

/**
 * @author SIMBA
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * */

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicatesFromSortedArray(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int uniqueCount = 1;
        int currentPositionInModifiedArray = 1;

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] != numbers[index - 1]) {
                numbers[currentPositionInModifiedArray] = numbers[index];
                uniqueCount++;
                currentPositionInModifiedArray++;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(numbers));
        return uniqueCount;
    }
    public static void main(String[] args) {
        System.out.println("Number of unique numbers: " + removeDuplicatesFromSortedArray(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
}
