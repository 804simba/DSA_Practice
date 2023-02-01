package com.timtez.algos;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        splitArray(new int[] {7, 2, 1, 2, 4, 5});
    }

    static void splitArray(int[] array) {
        int middle = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }

    public static void printNumberTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            int count = 0;
            while (count < row) {
                System.out.print(count+1 + " ");
                count++;
            }
            System.out.println();
        }
    }
}
