package com.simba.decagon;

public class HasUniqueChars {
    public static void main(String[] args) {
        if (hasUniqueChars("abbc")) {
            System.out.println("has unique characters.");
        } else {
            System.out.println("does not.");
        }
    }
    public static boolean hasUniqueChars(String s) {
        return s.chars().distinct().count() == s.length();
    }
}
