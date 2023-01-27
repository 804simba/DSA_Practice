package com.timtez.algos;

public class MinMax {
    public static void main(String[] args) {
        int[] array = {1, 34, 55, 2, -6, 420};
        int len = array.length;
        System.out.println(minimumNum(array, len));

    }
    public static int minimumNum(int[] array, int n) {
        if (n == 1)
            return array[0];

//        n = array.length - 1;

        return Math.max(array[n - 1], minimumNum(array, n - 1));
    }

}
