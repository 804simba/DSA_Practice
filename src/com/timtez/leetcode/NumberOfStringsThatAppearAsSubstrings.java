package com.timtez.leetcode;

public class NumberOfStringsThatAppearAsSubstrings {
    // https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println("Result: " + numOfStrings(patterns, word));
        // Output: 3
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String str : patterns) {
            if (word.contains(str)) {
                count++;
            }
        }
        return count;
    }
}
