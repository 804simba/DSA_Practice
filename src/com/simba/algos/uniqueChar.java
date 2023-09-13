package com.simba.algos;

import java.util.HashMap;
import java.util.Map;

public class uniqueChar {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("abbccdeef"));
    }

    static String uniqueCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                newString.append(c);
                map.put(c, 1);
            } else
                map.put(c, map.get(c + 1));
        }
        return newString.toString();
    }
}
