package com.timtez.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {
    public static void main(String[] args) {
        String result = highAndLow("1 9 3 4 -5");
        String result2 = highAndLow2("1 9 3 4 -5");
        System.out.println("Result: " + result);
        System.out.println("Result 2: " + result2);
    }
    public static String highAndLow(String numbers) {
        List<Integer> numbersList = new ArrayList<>();

        String[] numArray = numbers.split(" ");
        for (String s : numArray) {
            numbersList.add(Integer.parseInt(s));
        }

        Collections.sort(numbersList);
        StringBuilder sb = new StringBuilder();
        sb.append(numbersList.get(numbersList.size() - 1));
        sb.append(" ");
        sb.append(numbersList.get(0));
        return new String(sb);
    }
    public static String highAndLow2(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String s : array) {
            int value = Integer.parseInt(s);
            if (value < min) { min = value; }
            if (value > max) { max = value; }
        }
        return String.format("%d %d", max, min);
    }
}
