package com.timtez.decagon;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        firstNonRepeatingLetterPRO("stress");
    }

    public static void firstNonRepeatingLetterPRO(String s) {
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c);
                break;
            }
        }
        System.out.println("none");
    }

    public static void firstNonRepeatingLetter(String s) {
        //stress
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 0);
            }
        }
    }
}
