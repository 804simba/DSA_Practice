package com.timtez.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The idea is to remove overlapping intervals, which was done by sorting out the first integer in each list inside
 * the intervals 2D array.
 *
 * A new arrayList was used to store the lists of non-overlapping intervals
 * the currentInterval was used to store intervals that have been evaluated:
 * if the start time of the present time interval that is being iterated
 * over is less than the end time of the previous time interval, the
 * end time of the previous is then set as the maximum value between the present
 * interval end time and the previous interval end time;
 * else the currentInterval is overwritten to be the current interval being evaluated
 * and this interval is added to the arraylist.
 *
 * this arrayList is then returned.
 * */

public class MergeIntervals {
    // https://leetcode.com/problems/merge-intervals/

    public static void main(String[] args) {
        int[][] result = merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println("Result: " + Arrays.deepToString(result));
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 1) { return intervals; }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

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
