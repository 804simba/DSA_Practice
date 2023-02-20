package com.timtez.codewars;

// https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java
public class BouncingBalls {
    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5));
    }
    public static int bouncingBall(double h, double bounceFactor, double window) {
        if (h > 0 && bounceFactor > 0 && bounceFactor < 1 && window < h) {
            int numberOfBounces = 1;
            double currentHeight = h * bounceFactor;
            while (currentHeight > window) {
                numberOfBounces += 2;
                currentHeight *= bounceFactor;
            }
            return numberOfBounces;
        }
        return -1;
    }
}
