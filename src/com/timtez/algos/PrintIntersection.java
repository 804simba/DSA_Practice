package com.timtez.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintIntersection {
    public static void printIntersection(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : arr1) {
            if (!map.containsKey(number))
                map.put(number, 1);
            else
                map.put(number, map.get(number) + 1);
        }
        Arrays.sort(arr2);

        for (int number : arr2) {
            // number is used as the key to search the Map.
            if (map.containsKey(number)) {
                int value = map.get(number);
                if (value > 0) {
                    System.out.println("key: " + number);
                    /* we are decrementing the counts so to keep track of the number of times the intersection elements exist.
                    * For example, if the first array has [1, 2, 2, 3] and the second array has [2, 2, 3, 3], the intersection should be [2, 2, 3].
                    * If we did not decrement the values in the hashmap, the result would be [2, 2, 3, 3] instead, which is incorrect.
                    * */
                    map.put(number, map.get(number) - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        printIntersection(new int[]{2, 6, 8, 5, 4, 3}, new int[]{2, 4, 3, 7});
    }
}
