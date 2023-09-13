package com.simba.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopRental {
    // https://www.sololearn.com/Discuss/2975290/can-someone-pls-help-me-with-solution-to-this-coding-challenge
    public static void main(String[] args) {
        int[][] array = {{0,2},{1,4},{4,6},{0,4},{7,8},{9,11},{3,10}};
//        List<List<Integer>> lists = new ArrayList<>(Arrays.asList(array));
//        System.out.println("Count: " + laptopRental(List<List<>>));
        int[][] atWar = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println("Result: " + laptopRental(array));
//        System.out.println("Result: " + laptopRentals());
    }
    public static int laptopRental(int[][] intervals) {
        int numberOfLaptops = 0;
        List<Integer> list = new ArrayList<>();
        // [0, 0, 1, 2, 3, 4, 4, 4, 6, 7, 8, 9, 10, 11]

        // adds each integer into a new List.
        for (int i = 0; i < intervals.length; i++) {
            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
        }
        // sorts the list
        Collections.sort(list);
        System.out.println(list);

        // loops through the list and checks if the current iteration is equal to the next iteration
        // that signifies an overlap. So looking for overlaps, give us the minimum number of that is needed
        // to service all students within the given time intervals.
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                numberOfLaptops++;
            }
        }
        return numberOfLaptops;
    }
    public static int laptopRentals(List<List<Integer>> times) {
        List<Integer> start = new ArrayList<>(); // 0, 1, 3, 4, 6, 8, 10
        List<Integer> end = new ArrayList<>(); // 0, 2, 4, 4, 7, 9, 11

        for (int i = 0; i < times.size(); i++) {
            start.add(times.get(i).get(0));
            end.add(times.get(i).get(1));
        }
        Collections.sort(start);
        Collections.sort(end);

        int i = 0;
        int j = 0;

        int laptops = 0;
        int maxLaptops = 0;

        while (i < times.size() && j < times.size()) {
            if (start.get(i) < end.get(j)) {
                laptops++;
                i++;
                maxLaptops = Math.max(maxLaptops, laptops);
            } else {
                laptops--;
                j++;
            }
        }
        return maxLaptops;
    }
}
