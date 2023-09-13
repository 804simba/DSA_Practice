package com.simba.algos;

import java.util.Arrays;

public class PrintTriangle {
    public static void main(String[] args) {

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

    public static void printRightTriangleRecursive(int row, int col) {
        /*
        PRINTS:
            ****
            ***
            **
            *
        */

        /* Remember that any recursive call always returns to the function that called it.
           if a function isn't done executing, it waits in the stack and subsequent statements after that function
           are not executed until it pops out of the stack.

         */
        if (row == 0)
            return;
        if (col < row) {
            System.out.print("*");
            printRightTriangleRecursive(row, col+1);
        } else {
            System.out.println();
            printRightTriangleRecursive(row-1, 0);
        }
    }

    public static void printRightTriangleRecursive2(int row, int col) {
        /*
        PRINTS:
         *
         **
         ***
         ****
         */

        if (row == 0)
            return;
        if (col < row) {
            printRightTriangleRecursive2(row, col+1);
            System.out.print("*");
        } else {
            printRightTriangleRecursive2(row-1, 0);
            System.out.println();
        }
    }
}
