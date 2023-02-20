package com.timtez.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntToRoman {
    public static void main(String[] args) {
//        int answer = romanToInt("MCMXCVII");
//        System.out.println(answer);
//        mapEntry();
        System.out.println(intToRomanPro(1648));
    }


    static void mapEntry() {
        Map<String, String> map = new HashMap<>();

        map.put("Robert C. Martin", "Clean Code");
        map.put("Joshua Bloch", "Effective Java");

        for (Map.Entry<String, String> book : map.entrySet()) {
            System.out.printf("key: %s, value: %s\n", book.getKey(), book.getValue());
        }
    }

    public static String intToRoman(int num) {
        //1997
        final String[] letters = {"M", "CM",  "D", "CD", "C", "XC", "L","XL", "X", "IX", "V", "IV", "I"};
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            sb.append(letters[i].repeat(num / values[i]));
            num = num % values[i];
        }
        return sb.toString();
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int totalNumber = 0;
        // used s.length() -1 bc of indexOutOfBoundsException. Which was accounted for by taking the value of the last character and adding to totalNumber;
        for (int i = 0; i < s.length()-1; i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i+1);

            if (map.get(currentChar) < map.get(nextChar))
                totalNumber -= map.get(currentChar);
            else
                totalNumber += map.get(currentChar);
        }
        totalNumber += map.get(s.charAt(s.length()-1));
        return totalNumber;
    }

    private static TreeMap<Integer, String> MAP;
    static {
        MAP = new TreeMap<>(Collections.reverseOrder());
        MAP.put(1, "I");
        MAP.put(4, "IV");
        MAP.put(5, "V");
        MAP.put(9, "IX");
        MAP.put(10, "X");
        MAP.put(40, "XL");
        MAP.put(50, "L");
        MAP.put(90, "XC");
        MAP.put(100, "C");
        MAP.put(400, "CD");
        MAP.put(500, "D");
        MAP.put(900, "CM");
        MAP.put(1000, "M");
    }
    public static String intToRomanPro(int n) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : MAP.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            while (n >= key) {
                sb.append(value);
                n -= key;
            }
        }
        return sb.toString();
    }
}
