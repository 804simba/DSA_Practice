package com.simba.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int target = 4;
        System.out.println("Result: " + Arrays.toString(twoSum(array, target)));
    }
    public static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int difference = target - array[i];
            if (map.containsKey(difference)) {
                return new int[]{ map.get(difference), i };
            } else {
                map.put(array[i], i);
            }
        }
        return null;
    }
}
