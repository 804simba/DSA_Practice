package com.simba.leetcode;

public class RearrangeArrayElementsBySign {
    // https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

    /*
    *  We are using two pointers to insert the respective numbers in a new array.
    *  if the number is positive, we add it at the first index and increase the pointer by 2 positions.
    * Likewise for the negative numbers.
    * */
    public int[] rearrangeArray(int[] nums) {
        int lengthOfArray = nums.length;
        int pointerOne = 0;
        int pointerTwo = 1;
        int index = 0;
        int[] array = new int[nums.length];

        while (index < lengthOfArray) {
            if (nums[index] > 0) {
                array[pointerOne] = nums[index];
                pointerOne += 2;
            } else if (nums[index] < 0) {
                array[pointerTwo] = nums[index];
                pointerTwo += 2;
            }
            index++;
        }
        return array;
    }
}
