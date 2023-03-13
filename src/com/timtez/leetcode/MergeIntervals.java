package com.timtez.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    // https://leetcode.com/problems/merge-intervals/
    public static void main(String[] args) {
        int[][] result = merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println("Result: " + Arrays.deepToString(result));
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 1) { return intervals; }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println("Sorted: " + Arrays.deepToString(intervals));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
