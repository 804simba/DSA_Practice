package com.simba.algos;

public class Rotate {
    public static void rotate(int[] nums, int k) {
        rotateArray(nums, k % nums.length);
    }

    public static void rotateArray(int[] A, int k) {
        reverse(A, 0, A.length - 1);
        reverse(A, 0, k - 1);
        reverse(A, k, A.length - 1);
    }

    public static void reverse(int[] A, int from, int to) {
        while (to > from) {
            int temp = A[to];
            A[to] = A[from];
            A[from] = temp;
            from++;
            to--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        rotate(array, 3);
//        for (int index = 0; index < array.length; index++)
//            System.out.print(array[index] + " ");
        int answer = 3 % 7;
        System.out.println(answer);
    }
}
