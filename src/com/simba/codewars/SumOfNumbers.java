package com.simba.codewars;

public class SumOfNumbers {
    // https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
    public static void main(String[] args) {
        System.out.println("Result:: " + sumOfNumbers(0, -1));
    }
    public static int sumOfNumbers(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        } else {
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            for (int i = min; i <= max; i++) {
                sum += min;
            }
        }
        return sum;
    }
}
