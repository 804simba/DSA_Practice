package com.timtez.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/valid-parentheses/
public class IsValidParentheses {
    public static void main(String[] args) {
        String str = "(]";
        System.out.println(isValidParentheses(str));
    }
    public static boolean isValidParentheses(String s) {
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        Set<Character> expectedBrackets = new HashSet<>();

        for (char c : s.toCharArray()) {
            if(bracketMap.containsValue(c)) {
                // adds the opening bracket to the Set, waiting for a corresponding closing bracket.
                expectedBrackets.add(bracketMap.get(c));
            } else if(bracketMap.containsKey(c)) {
                // expectedBrackets.iterator().next() is retrieving the first element in the set of expected closing brackets.
                if (expectedBrackets.isEmpty() || c != expectedBrackets.iterator().next()) {
                    return false;
                }
                expectedBrackets.remove(c);
            }
        }
        return expectedBrackets.isEmpty();
    }
}
