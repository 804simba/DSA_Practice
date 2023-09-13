package com.simba.leetcode;

import java.util.Arrays;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double res = findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] newArray = new int[len1 + len2];

        int x = 0;

        for (int element : nums1) {
            newArray[x] = element;
            x++;
        }

        for (int element : nums2) {
            newArray[x] = element;
            x++;
        }

        Arrays.sort(newArray);
        return binarySearch(newArray);
    }

    public static double binarySearch(int[] array) {
        int start = 0;
        int end = array.length;

        int middle = start + (end - start) / 2;

        if (array.length % 2 != 0)
            return array[middle];
        return (double)(array[middle] + array[middle-1])/2.0;
    }
}
