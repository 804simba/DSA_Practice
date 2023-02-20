package com.timtez.algos;

public class LeftAndRightRotateString {
    public static void main(String[] args) {
        String input = "Geeks4Geeks";
        String rrs = rightRotateString(input, 2);
        String lrs = leftRotateString(input, 2);
        System.out.println("Right rotated string: " + rrs);
        System.out.println("Left rotated string: " + lrs);
    }

    public static String rightRotateString(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static String leftRotateString(String s, int n) {
        return rightRotateString(s, s.length() - n);
    }
}
