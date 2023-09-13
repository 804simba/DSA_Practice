package com.simba.codewars;

public class CountDigits {
    public static void main(String[] args) {
        int result = countDigits(5750, 0);
        System.out.println("Result: " + result);
    }
    public static int countDigits(int n, int d) {
        int count = 0;

        // it uses a while loop to check each digit to see if it is
        // equal tp `d`, then it increase `d`;
        for (int i = 0; i <= n; i++) {
            int square = i*i;
            while (square > 0) {
                if (square % 10 == d) {
                    count++;
                }
                square /= 10;
            }
        }
        return count;
    }
}
