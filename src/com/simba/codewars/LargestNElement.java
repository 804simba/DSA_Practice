package com.simba.codewars;

import java.util.Arrays;

import static java.util.stream.IntStream.of;

public class LargestNElement {
    public static void largestNElement(int[] arr, int n) {
        int[] result = new int[n];
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            result[n-i] = arr[arr.length - i];
        }
        System.out.println(Arrays.toString(result));
    }

    public static void largestNElementPro(int[] arr, int n) {
        Arrays.sort(arr);
        int[] res = Arrays.copyOfRange(arr, arr[arr.length - n], arr[arr.length - 1]);
        System.out.println(Arrays.toString(res));
    }

    public static void lNElements(int[] arr, int n) {
        int[] res = of(arr).sorted().skip(arr.length - n).toArray();
        System.out.println(res);
    }
}
