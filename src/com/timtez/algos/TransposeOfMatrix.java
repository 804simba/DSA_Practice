package com.timtez.algos;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] answer = transposeMatrix(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
        for (int[] array : answer) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int[][] transposedMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            int j = 0;
            while (j < n) {
                transposedMatrix[i][j] = matrix[j][i];
                j++;
            }
        }
        return transposedMatrix;
    }
}
