package com.timtez.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {6, 5, 4, 3, 2, 1};

        array = mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int middle = arr.length / 2;

        // recursively divide a copy of array by half for each function call, until the array at the leaf node (left and right) is equal to 1, then return the array.
        // then merge the array.
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];

        int firstArrayPointer = 0;
        int secondArrayPointer = 0;
        int mergedArrayPointer = 0;

        while (firstArrayPointer < firstArray.length && secondArrayPointer < secondArray.length) {
            if (firstArray[firstArrayPointer] < secondArray[secondArrayPointer]) {
                mergedArray[mergedArrayPointer] = firstArray[firstArrayPointer];
                firstArrayPointer++;
            } else {
                mergedArray[mergedArrayPointer] = secondArray[secondArrayPointer];
                secondArrayPointer++;
            }
            mergedArrayPointer++;
        }

        // For cases when the elements are not yet finished in the array after merging, copy the remaining elements into the merged array.
        while (firstArrayPointer < firstArray.length) {
            mergedArray[mergedArrayPointer] = firstArray[firstArrayPointer];
            firstArrayPointer++;
            mergedArrayPointer++;
        }

        while (secondArrayPointer < secondArray.length) {
            mergedArray[mergedArrayPointer] = secondArray[secondArrayPointer];
            secondArrayPointer++;
            mergedArrayPointer++;
        }
        return mergedArray;
    }
}
