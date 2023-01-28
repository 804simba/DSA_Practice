package com.timtez.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] array = {2, 1, 8, -1};
//        System.out.println(Arrays.toString(bubbleSort(array)));
//        bubbleSortRecursive2(array, 0, array.length-1);
        selectionSort(array, 0, array.length, 0);
        System.out.println(Arrays.toString(array));
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

    public static void bubbleSortRecursive2(int[] array, int col, int row) {
        if (row == 0)
            return;
        if (col < row) {
            if (array[col] > array[col+1]) {
                int temp = array[col];
                array[col] = array[col+1];
                array[col+1] = temp;
            }
            bubbleSortRecursive2(array, col+1, row);
        } else {
            bubbleSortRecursive2(array, 0, row-1);
        }
    }

    public static void selectionSort(int[] array, int col, int row, int max) {
        /*
	   Assumption: the first element in the array is the max.
	   check for the maximum between the elements and set
	   the max by calling next function again; else leave max as is.

	   After transversing the entire array, we the swap the maximum value
	   with the last element in the array.
	   Then we call the function again, this time decrementing row by one.
	   */
        if (row == 0)
            return;
        if (col < row) {
            if (array[col] > array[max])
                selectionSort(array, col+1, row, col);
            else
                selectionSort(array, col+1, row, max);
        } else {
            int temp = array[max];
            array[max] = array[row-1];
            array[row-1] = temp;
            selectionSort(array, 0, row-1, 0);
        }
    }
}
