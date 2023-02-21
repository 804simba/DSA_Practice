package com.timtez.codewars;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderPlease {
    // https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

    public static void main(String[] args) {
        String result = order("Th1is i4s a3 bo2y");
        System.out.println(result);
    }

    public static String order(String words) {
        Map<String, String> map = new TreeMap<>();
        String[] numberArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] word = words.split("\\s");
        for (String letter : word) {
            for (int i = 0; i < numberArray.length; i++) {
                if (letter.contains(numberArray[i])) {
                    map.put(numberArray[i], map.getOrDefault(numberArray[i], letter));
                }
            }
            System.out.println(map);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getValue());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
