package com.timtez.sorting;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 1, 8};
//        System.out.println(Arrays.toString(bubbleSort(array)));
        int[] res = bubbleSortRecursive(array);
        System.out.println(Arrays.toString(res));
    }

    public static int[] bubbleSort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
        return array;
    }
    public static void swap(int[] array, int currentValue, int prevValue) {
        int temp = array[currentValue];
        array[currentValue] = array[prevValue];
        array[prevValue] = temp;
        return;
    }

    public static int[] bubbleSortRecursive(int[] array) {
        boolean sorted = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                sorted = true;
            }
        }
        if (sorted == true)
            bubbleSortRecursive(array);

        return array;
    }
}
