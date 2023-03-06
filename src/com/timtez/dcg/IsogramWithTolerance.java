package com.timtez.dcg;

import java.util.HashMap;
import java.util.Map;

public class IsogramWithTolerance {
    public static void main(String[] args) {
        String s = "aa bb cc dd ee";
        int k = 4;
        System.out.println("Result: " + isogramWithTolerance(s, k));
//        System.out.println("Result: " + iwt(s, k));
    }

    public static boolean isogramWithTolerance(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        char[] characterArray = s.toCharArray();
        boolean result = true;
        for (char eachChar : characterArray) {
            if (map.containsKey(eachChar) && map.get(eachChar) <= k) {
                map.put(eachChar, map.get(eachChar) + 1);
            } else if (map.containsKey(eachChar) && map.get(eachChar) > k) {
                result = false;
                break;
            } else {
                map.put(eachChar, 1);
            }
        }
        System.out.println(map);
        return result;
    }
    public static boolean iwt(String s, int k) {
        // did not work.
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int count = 0;
        for (Integer entry : map.values()) {
            if (entry > k) {
                count++;
            }
        }
        return k > count;
    }
}
