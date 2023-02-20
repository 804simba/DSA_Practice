package com.timtez.arraysops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysOps {
    public static void main(String[] args) {
        int[] array = new int[5];
        int i = 0;
        for (int c : array) {
            array[i] = i+2;
            i++;
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = {1, 2, 7, 3, 9, 6, 7};
        int[][] arrays = {{1, 2, 7, 3, 9, 6, 7}, {1, 2, 7, 3, 9, 6, 7}};
        copyOfRange(array2);
        System.out.println("Deep to string: " + Arrays.deepToString(arrays));
        Arrays.fill(array2, 1, 6, 0);
        System.out.println("Filled array: " + Arrays.toString(array2));
        Arrays.fill(array2, 10);
        System.out.println("Filled array with one value: " + Arrays.toString(array2));

        // Find array mismatch
        int[] arr1 = {1, 8, 3, 5};
        int[] arr2 = {1, 8, 3, 5, 7};
        System.out.println("Mismatch index: " + Arrays.mismatch(arr1, arr2));

        // Arrays prefix
        int[] numbers = {10, 20, 30, 40};
        IntBinaryOperator op = Integer::sum;
        Arrays.parallelPrefix(numbers, op);
        System.out.println("New array with summed values: " + Arrays.toString(numbers));

        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(numbersCopy));

        // square all even numbers inside an array, and leave odd numbers as they are.
        int[] allNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntUnaryOperator g = e ->
        {
            if (e % 2 == 0) {
                return e * e;
            } else {
                return e;
            }
        };
        // the array and the functional operators are passed as arguments.
        Arrays.parallelSetAll(allNumbers, g);
        System.out.println("New array:");
        Arrays.stream(allNumbers).forEach(n -> System.out.print(n + " "));
        System.out.println();
        // Parallel sort
        int[] allNumberCopy = Arrays.copyOf(allNumbers, allNumbers.length);
        Arrays.parallelSort(allNumberCopy);
        System.out.println("Parallel sorted array: " + Arrays.toString(allNumberCopy));

        int[] unsortedArray = {20, 1, 5, 70, 3};
        Arrays.sort(unsortedArray, 0, 3);
        System.out.println("Sorted array from index 0 to before index 3: " + Arrays.toString(unsortedArray));

        Integer[] unsortedArray2 = {100, 6, 49, 1, 12};
        Arrays.sort(unsortedArray2, Comparator.reverseOrder());
        System.out.println("Sorted Integer array in reverse order: " + Arrays.toString(unsortedArray2));

        Integer[] bsarray = {1, 4, 6, 8, 90, 500, 4587};
        Integer key = 500;
        Integer result = Arrays.binarySearch(bsarray, key);
        System.out.println("Result of BS: " + result);
    }

    private static void copyOfRange(int[] array) {
        int[] newArray = new int[4];
        newArray = Arrays.copyOfRange(array, 1, 4);
        System.out.println("copied array: " + Arrays.toString(newArray));
    }
}
