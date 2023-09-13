package com.simba.algos;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 55, 67, 90, 400};
        int target = 2;
        int start = 0;
        int end = array.length - 1;
        int res = search(array, target, start, end);
        System.out.println(res);
    }

    static int search(int[] array, int target, int start, int end) {
        if (start > end)
            return - 1;

        int middle = start + (end - start) / 2;

        if (array[middle] == target)
            return middle;
        if (array[middle] > target)
            return search(array, target, start, middle - 1);

        return search(array, target, middle + 1, end);
    }
}
