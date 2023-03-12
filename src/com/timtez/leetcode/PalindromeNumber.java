package com.timtez.leetcode;

public class PalindromeNumber {
    // https://leetcode.com/problems/palindrome-number/
    public static void main(String[] args) {
        System.out.println("Result: " + isPalindrome(121)); // true
    }
    public static boolean isPalindrome(int x) {
        String number = "" + x;
        StringBuilder sb = new StringBuilder(number);
        String reversed = sb.reverse().toString();
        return reversed.equals(number);
    }
}
