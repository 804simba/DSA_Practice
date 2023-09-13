package com.simba.algos;

public class ReverseString {

    public static void main(String[] args) {
//        char[] s = {'h', 'e', 'l', 'l', 'o' };
//        reverseString(s);
        int res = countZeros(100203, 0);
        System.out.println(res);
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

    static int sum = 0;
    static void reverseNumber(int n) {
        if (n == 0)
            return;
        int lastDigit = n % 10;
        sum += lastDigit * 10 + n;

        reverseNumber(n / 10);
    }

    static int countZeros(int n, int count) {
        if (n == 0)
            return count;
        int lastNumber = n % 10;
        if (lastNumber == 0)
            return countZeros(n/10, count+1);
        else
            return countZeros(n/10, count);
    }
}

