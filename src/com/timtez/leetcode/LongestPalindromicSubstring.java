package com.timtez.leetcode;

public class LongestPalindromicSubstring {
//    https://leetcode.com/problems/longest-palindromic-substring/description/

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcaacrr"));
    }
    public static String longestPalindrome(String s) {
        String maxPalindromicSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            String oddCentre = expandPointers(s, i, i);
            String evenCentre = expandPointers(s, i, i+1);
            if (oddCentre.length() > maxPalindromicSubstring.length())
                maxPalindromicSubstring = oddCentre;
            if (evenCentre.length() > maxPalindromicSubstring.length())
                maxPalindromicSubstring = evenCentre;
        }
        return maxPalindromicSubstring;
    }

    private static String expandPointers(String s, int left, int right) {
        for (; left >= 0 && right < s.length(); left--, right++) {
            if (s.charAt(left) != s.charAt(right))
                break;
        }
        return s.substring(left+1, right);
    }
}
