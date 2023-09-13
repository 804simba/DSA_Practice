package com.simba.codewars;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    // https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
    public static void main(String[] args) {
        duplicateCount("indivisibility");
    }
    public static void duplicateCount(String text) {
        Map<Character, Integer> map =  new HashMap<>();
        String newText = text.toLowerCase();
        for (char c : newText.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
