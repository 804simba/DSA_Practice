package com.timtez.leetcode;

import java.util.Arrays;

public class SortEvenAndOddIndicesIndependently {
    public static void main(String[] args) {
        int[] answer = sortEvenAndOdd(new int[]{36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34});
        System.out.println(answer.toString());
    }
    public static int[] sortEvenAndOdd(int[] array) {
        int arrayLength = array.length;
        int[] oddArray = new int[arrayLength / 2];
        int[] evenArray = new int[arrayLength / 2];

        int j = 0; int k = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0)
                evenArray[j++] = array[i];
            else
                oddArray[k++] = array[i];
        }

        Arrays.sort(oddArray); Arrays.sort(evenArray);

        j = 0; k = oddArray.length - 1;
        for (int i = 0; i < arrayLength; i++) {
            if (i % 2 == 0)
                array[i] = evenArray[j++];
            else
                array[i] = oddArray[k--];
        }
        return array;
    }
}
