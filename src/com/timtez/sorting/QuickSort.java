//package com.timtez.sorting;
//
//public class QuickSort {
//    public static void main(String[] args) {
//        int[] array = {10, 16, 8, 12, 15, 6, 3, 9, 5};
//        quickSort(0, array.length - 1);
//    }
//
//    static void quickSort(int low, int high) {
//        if (low < high) {
//            int j = partition(low, high);
//            quickSort(low, j);
//            quickSort(j+1, high);
//        }
//    }
//
//    // first select a pivot element and look for its sorted position.
//    static int partition(int low, int high) {
//        int pivot = array[low];
//        int i = low; int j = high;
//
//        while (i < j) {
//            do {
//                i++;
//            } while(array[i] <= pivot);
//
//            do {
//                j++;
//            } while(array[i] > pivot);
//
//            if (i < j)
//                swap(array[i], array[j]);
//        }
//        swap(pivot, j);
//        return j;
//    }
//
//    static void swap(int i, int j) {
//        int temp = i;
//        i = j;
//        j = temp;
//    }
//}
