package com.timtez.algos;

public class FirstNNums {
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }

    static void printNumbers(int n) {
        if (n < 1)
            return;
        System.out.println(n);
        printNumbers(n - 1);
    }
}
