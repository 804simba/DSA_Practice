package com.simba.leetcode;

import java.util.Arrays;

public class ValidAnagram {
    // https://leetcode.com/problems/valid-anagram/description/
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Result: " + isAnagram(s, t));
        // Input: s = "anagram", t = "nagaram"
        // Output: true
    }
    public static boolean isAnagram(String s, String t) {
        char[] charArrayOne = s.toCharArray();
        char[] charArrayTwo = t.toCharArray();
        Arrays.sort(charArrayOne);
        Arrays.sort(charArrayTwo);

        String newS = new String(charArrayOne);
        String newT = new String(charArrayTwo);

        StringBuilder sb = new StringBuilder(s);
        return newS.equals(newT);
    }
}
