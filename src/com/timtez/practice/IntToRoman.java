package com.timtez.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntToRoman {
    public static void main(String[] args) {
        int answer = romanToInt("MCMXCVII");
        System.out.println(answer);
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
}
