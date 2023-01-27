package com.timtez.algos;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        reverse(s, start, end);
        System.out.println(s);
    }

    public static void reverse(char[] s, int start, int end) {
        if (start > end)
            return;

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverse(s, start + 1, end - 1);
    }
}

