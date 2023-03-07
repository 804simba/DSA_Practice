package com.timtez.dcg;

public class NextPerfectSquare {
    public static void main(String[] args) {
        System.out.println("Result: " + nextPerfectSquare(121));
    }
    public static long nextPerfectSquare(int number) {
        // find the square root;
        long x = (long) Math.floor(Math.sqrt(number));
        if (x * x != number)
            return -1;
        x++;
        return x * x;
    }
}
