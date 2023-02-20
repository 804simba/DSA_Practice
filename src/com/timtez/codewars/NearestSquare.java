package com.timtez.codewars;

public class NearestSquare {
    // https://www.codewars.com/kata/5a805d8cafa10f8b930005ba/train/java

    public static void main(String[] args) {
        System.out.println(nearestSquare(111));
        System.out.println(optimizedNearestSquare(10000));
    }
    public static int nearestSquare(final int n) {
        int sq = (int) Math.sqrt(n);
        int lowerBound = (int)(n - Math.pow(sq, 2));
        int upperBound = (int)(Math.pow(sq+1, 2) - n);

        return lowerBound < upperBound ? (int)Math.pow(sq, 2) : (int)Math.pow(sq+1, 2);
    }

    public static int optimizedNearestSquare(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}
