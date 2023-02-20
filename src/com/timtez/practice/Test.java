package com.timtez.practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // customer Integer wrapper class
        IntegerContainer myIntegerWrapper1 = new IntegerContainer(12);
        IntegerContainer myIntegerWrapper2 = new IntegerContainer(10);
        swap(myIntegerWrapper1, myIntegerWrapper2);
        System.out.println(myIntegerWrapper1.getMyInteger());
        System.out.println(myIntegerWrapper2.getMyInteger());
    }

    public static void swap(IntegerContainer k, IntegerContainer l) {
        IntegerContainer temp = k;
        k = l;
        l = temp;
        System.out.printf("k: %s l: %s\n", k, l);
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

