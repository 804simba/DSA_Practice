package com.simba.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    // https://leetcode.com/problems/contains-duplicate-ii/
    public static void main(String[] args) {

    }
    public static boolean containsNearbyDuplicates(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        final Map<Integer, Integer> occurences = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(occurences.containsKey(nums[i])) {
                final int prevOccurence = occurences.get(nums[i]);
                if (i - prevOccurence <= k) {
                    return true;
                }
            }
            occurences.put(nums[i], i);
        }
        return false;
    }
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

}
