package com.timtez.decagon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindOutlier {
    // given an arraylist you are to return the only odd or even number.
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(122000, 2, 10, 3));
        System.out.println("result1: " + findOutlier(integers));
//        System.out.println("result2: " + findOutlierBrute(integers));
    }
    public static int findOutlier(List<Integer> integers) {
        int countOdd = 0;
        int countEven = 0;
        int lastOdd = 0;
        int lastEven = 0;

        for (Integer i : integers) {
            if (i % 2 == 0) {
                countEven++;
                lastEven = i;
            } else {
                countOdd++;
                lastOdd = i;
            }
        }
        System.out.println(lastEven + " " + lastOdd);
        int result = (countOdd > countEven) ? lastEven : lastOdd;

        return result;
    }
//    public static int findOutlierBrute(List<Integer> integers) {
//        int countOdd = 0;
//        int countEven = 0;
//        for (Integer i : integers) {
//            if (i % 2 == 0) {
//                countEven++;
//            }
//            countOdd++;
//        }
//        Collections.sort(integers);
//        int result = 0;
//        if (countOdd > countEven) {
//            for (Integer i : integers) {
//                if (i % 2 == 0) {
//                    result += i;
//                }
//            }
//        } else if (countEven > countOdd) {
//            for (Integer i : integers) {
//                if (i % 2 != 0) {
//                    result += i;
//                }
//            }
//        }
//        return result;
//    }
}
