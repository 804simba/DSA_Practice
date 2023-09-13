package com.simba.leetcode;

import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumbers {
    public static void main(String[] args) {
        int result = findDuplicate(new int[] {1, 3, 4, 5, 4, 5, 5, 6});
        int result2 = findDuplicateTwo(new int[] {1, 3, 4, 5, 4, 5, 5, 6});
        System.out.println("result = " + result);
        System.out.println("result 2 = " + result2);
    }
    public static int findDuplicate(int[] nums) {
        final Map<Integer, Integer> frequencyMap = new HashMap<>();
        int duplicate = 0;
        for (int n : nums) {
            if (!frequencyMap.containsKey(n)) {
                frequencyMap.put(n, 1);
            } else {
                frequencyMap.put(n, frequencyMap.get(n) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicate = entry.getKey();
            }
        }

        return duplicate;
    }
    public static int findDuplicateTwo(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        int duplicate = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicate = entry.getKey();
            }
        }

        return duplicate;
    }
}
