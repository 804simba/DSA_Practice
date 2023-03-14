package com.timtez.decagon;

import java.util.ArrayList;
import java.util.List;

public class SplitInteger {
    public static void main(String[] args) {
        splitInteger(20, 6);
        // 20 / 6 = 3; 20 % 6 = 4;
    }

    public static void splitInteger(int num, int parts) {
        List<Integer> list = new ArrayList<>();
        int quotient = num / parts;
        int remainder = num % parts;

        for (int i = 0; i < parts; i++) {
            if (i < remainder) {
                list.add(quotient + 1);
            } else {
                list.add(quotient);
            }
        }
        System.out.println(list.stream().sorted().toList());
    }
}
