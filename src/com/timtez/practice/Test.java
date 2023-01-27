package com.timtez.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        int[] array = {1, 1, 1, 0};
//        int target = -100;
//        threeSumClosest(array, target);

        printTree(3);
    }

    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int front = 2;
        int back = 0;

        while (front < nums.length && back <= front) {
            int addedNum = nums[front - 2] + nums[front - 1] + nums[front];
            if (addedNum == target || addedNum / target == 0) {
                sum = addedNum;
            }
//            sum = Math.max(addedNum, sum);
            front++;
            back++;
        }
        return sum;
    }

    public static void printTree(int n) {
        for (int steps = 0; steps < n; steps++) {
            int end = n*2+1;
            for (int col = 0; col < end; col++) {
                if (col == 0 || col == end-1)
                    System.out.print("1");
                else {
                    for (int spaces = col; spaces < end; spaces++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

}

