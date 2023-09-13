package com.simba.leetcode;

import java.util.Stack;

/**
 * 1. Initialize an empty stack.
 * 2. for each character `c` in string:
 *  a. if `c` is an opening parentheses. push its index to the stack.
 *  b. if `c` is a closing parentheses:
 *      i. if the stack is not empty and the corresponding character whose index matches the index at the top of the stack is not an opening parentheses,
 *      pop it out of the stack, as we have found a balanced pair.
 *      ii. if the stack is empty or the top element is not an opening parentheses, push the index of `c` into the stack. Thus, we've seen an unbalanced
 *      pair of parentheses.
 *  c. After processing all characters in the string, we are left with a stack, containing the indices of unbalanced parenthesis. To find the length of the
 *  length of the longest valid substring, we pop the elements from the stack one by one and update the maximum length as the difference between the current
 *  eindex and the previous index on the stack. Finally, we return the maximum length.
 * */

public class LongestParentheses {
    public static void main(String[] args) {
        String brackets = ")()())";
        int result = longestParentheses(brackets);
        System.out.println("Result: " + result);
    }
    static int longestParentheses(String str) {
        if (str == null || str.length() < 2) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else {
                // current closing bracket...
                if (!stack.isEmpty() && str.charAt(stack.peek()) == '(') {
                    // balanced case, when we see a closing parentheses
                    stack.pop();
                } else {
                    // unbalanced parentheses push it to the stack
                    stack.push(i);
                }
            }
        }

        int maxLength = 0;
        int endTerminal = str.length();

        while (!stack.isEmpty()) {
            int startTerminal = stack.pop();
            maxLength = Math.max(maxLength, endTerminal - startTerminal - 1);
            endTerminal = startTerminal;
        }

        return Math.max(endTerminal, maxLength);
    }
}
