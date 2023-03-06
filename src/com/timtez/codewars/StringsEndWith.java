package com.timtez.codewars;

public class StringsEndWith {
    // https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java
    public static void main(String[] args) {
        String str = "Hello";
        String ending = "llo";
        System.out.println("Result :" + solution(str, ending));
    }
    public static boolean solution(String str, String ending) {
        if (str == null || ending == null || ending.length() > str.length()) {return false;}
        else {
            return str.endsWith(ending);
        }
    }
}
