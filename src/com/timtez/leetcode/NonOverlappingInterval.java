package com.timtez.leetcode;

import java.util.Arrays;
import java.util.List;

public class NonOverlappingInterval {
    // https://leetcode.com/problems/non-overlapping-intervals/solutions/481758/easy-to-understand-java-solution/
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println("Result: " + eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) { return 0;}
        // sorting the array based on their respective start times..
        Arrays.sort(intervals, (fArray, sArray) -> Integer.compare(fArray[0], sArray[0]));
        List<Integer> myList = Arrays.stream(intervals)
                .map(x -> x[1])
                .toList();
        System.out.println("Array: " + myList);
        // the end time of the first interval
        int lastEndtime = intervals[0][1];
        int numberOfOverlaps = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (lastEndtime > intervals[i][0]) {
                numberOfOverlaps++;
                lastEndtime = Math.min(intervals[i][1], lastEndtime);
            } else {
                lastEndtime = intervals[i][1];
            }
        }
        return numberOfOverlaps;
    }
}
