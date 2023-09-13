package com.simba.leetcode;

import java.util.*;

// https://leetcode.com/problems/valid-parentheses/

/**
 * We can use a stack to store characters of the string.
 * Then we can do two things:
 * 1. if char is open bracket (i.e. '(' or '{' or '[') then push it in stack.
 * 2. if char is closed bracket therefore we can check the following conditions:
 *
 *    1: if '{' is before '}'.
 *    2: if '(' is before ')'.
 *    3: if '[' is before ']'.
 *
 *    If any condition is false then return false.
 * */
class IsValidParentheses {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValidParentheses(str));
    }
    public static boolean isValidParenthesesPro(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static boolean isValidParentheses(String s) {
        Stack<Character> bracketsStack = new Stack<>();
        for (char ch : s.toCharArray()) {
            switch(ch) {
                case '(':
                case '[':
                case '{':
                    bracketsStack.push(ch);
                    break;
                case ')':
                    if (bracketsStack.isEmpty() || bracketsStack.pop() != '(') { return false; }
                    break;
                case ']':
                    if (bracketsStack.isEmpty() || bracketsStack.pop() != '[') { return false; }
                    break;
                case '}':
                    if (bracketsStack.isEmpty() || bracketsStack.pop() != '{') { return false; }
                    break;
            }
        }
        return bracketsStack.isEmpty();
    }
}
