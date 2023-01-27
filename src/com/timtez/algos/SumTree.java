package com.timtez.algos;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTree {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        sumFunc(array);
    }

    public static void sumFunc(int[] array) {
        if (array.length < 1)
            return;

        int[] temp = new int[array.length - 1];

        for (int index = 0; index < array.length - 1; index++) {
           int x = array[index] + array[index + 1];
           temp[index] = x;
        }

        sumFunc(temp);

        System.out.println(Arrays.toString(array));
    }
}

