package com.timtez.codewars;

public class NarcissticNumber {
    // https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java

    public static void main(String[] args) {
        isNarcissisticNumber(153); // 1 + 125 + 27 = 153
        isNarcissisticNumberPro(153);
    }

    public static void isNarcissisticNumber(int n) {
        String nToString = n + "";
        int nCount = nToString.length();

        int sum = 0;
        for (int i = 0; i < nCount; i++) {
            sum += Math.pow(nToString.charAt(i) - '0', nCount);
        }
        System.out.println(sum);
    }

    public static void isNarcissisticNumberPro(int n) {
        String nToString = String.valueOf(n);
        char[] nCharsArr = nToString.toCharArray();

        int sum = 0;
        for (char c : nCharsArr) {
            sum += Math.pow(Integer.parseInt(String.valueOf(c)), nToString.length());
        }
        System.out.println(sum);
    }
}
