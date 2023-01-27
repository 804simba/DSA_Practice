package com.timtez.algos;

import java.util.Arrays;

public class PrintTriangle {
    public static void main(String[] args) {
        printArrayOfTriangle(4);
    }
    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = i; space < n; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < i+1; star++) {
                System.out.print("*");
            }

            if (i > 0) {
                int addStars = 0;
                while (addStars < i) {
                    System.out.print("*");
                    addStars++;
                }
            }
            System.out.println();
        }
    }

    public static void printTriangle2(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = row; spaces < n; spaces++) {
                System.out.print(" ");
            }
            // 2 * any number + 1 gives you an odd number;
            for (int stars = 0; stars < 2*row+1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printArrayOfTriangle(int n) {
        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            res[i] = " ".repeat(n-i-1) + "*".repeat(2*i+1) + " ".repeat(n-i-1);
        }
        System.out.println(Arrays.toString(res));
    }

    public static void printHollowTriangle(int n) {
        for(int row = 0; row < n; row++) {
            for(int spaces = row; spaces < n; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < 2*row+1; stars++) {
                if(stars == 0 || stars == 2*row)
                    System.out.print("*");
                else if (row == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
