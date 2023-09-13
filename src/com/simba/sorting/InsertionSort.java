package com.simba.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 2, 7, 9, 50};
//        insertionSort(array);
        insertionSortRecursive(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSortRecursive(int[] array) {
        boolean sorted = false;

        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i - 1;
            if (currentValue < array[j]) {
                array[j+1] = array[j];
                j--;
                sorted = true;
            }
            array[j+1] = currentValue;
        }
        if (sorted == true)
            insertionSortRecursive(array);
        return;
    }
    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // 2nd element in the array during the first iteration.
            int currentVal = array[i];
            // index variable (j) used to track and push previous values in the array to the front.
            // if they are greater than the current value we are trying to insert in the array.
            int j = i - 1;
            while (j >= 0 && array[j] > currentVal) {
                array[j+1] = array[j];
                // decrementing j allows us to check for previous array elements, as the index keeps
                // till we hit zero
                j--;
            }
            //inserts the value at the correct index.
            array[j+1] = currentVal;
        }
    }
}
