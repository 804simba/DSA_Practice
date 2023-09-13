package com.simba.codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOneArray {
    public static void main(String[] args) {
        // [1, 2, 3]
        int[] ans = plusOneArray(new int[]{9, 9, 9, 9});
        System.out.println(Arrays.toString(ans));
        System.out.println(223 % 100);
    }

    public static int[] plusOneArray(int[] array) {
        int res = 0;
        for (int n : array) {
            res = (res * 10) + n;
        }
        res += 1;
        ArrayList<Integer> list = new ArrayList<>();

        char[] cArray = Integer.toString(res).toCharArray();

        for (int i = 0; i < cArray.length; i++) {
            list.add(Integer.parseInt(String.valueOf(cArray[i])));
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
