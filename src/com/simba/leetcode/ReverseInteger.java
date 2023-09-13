package com.simba.leetcode;

public class ReverseInteger {
    static int reverse(int x) {
        int finalNumber = 0;
        while(x!=0) {
            int lastDigit = x%10;
            int newNumber = finalNumber * 10 + lastDigit;
            if (newNumber / 10 != finalNumber) {
                return 0;
            }
            finalNumber = newNumber;
            x /= 10;
        }
        if (finalNumber < Integer.MIN_VALUE || finalNumber > Integer.MAX_VALUE) {
            return 0;
        }
        return finalNumber;
    }
    public static void main(String[] args) {
        int result = reverse(-96424351);
        System.out.println("Result: " + result);
    }
}
