package com.timtez.dcg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SJF {
    public static void main(String[] args) {
        List<Integer> jobs = Arrays.asList(3,10,20,1,2);
        System.out.println(sjf(jobs, 1));
    }
    public static int sjf(List<Integer> jobs, int index) {

        // otherwise set totalTime = the first job to run's time.
        // if the current job in the pool is less than the total time of the first task
        // or equal to the first task index && it's index is less than  the first task's index
        // accumulate total Time.
        int firstJobTime = jobs.get(index);
        int totalTime = 0;

        for (int i = 0; i < jobs.size(); i++) {
            int currentJobTime = jobs.get(i);
            if (firstJobTime > currentJobTime || (firstJobTime == currentJobTime && i < index)) {
                totalTime += currentJobTime;
            }
        }
        return totalTime;
    }
}
