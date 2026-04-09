package com.simba.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tim Olisaeloka Ngonadi
 * @date 09/04/2026
 */
public class TwoSum {
    /**
     * The trick is:
     * Check complement before inserting the current number.
     * This prevents using the same element twice.
     * */
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            System.out.println("complement: " + complement);
            if (numMap.containsKey(complement)) {
                System.out.println("numMap: " + numMap);
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        System.out.println("numMap: " + numMap);
        return new int[]{};
    }
}
