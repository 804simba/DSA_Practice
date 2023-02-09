package com.timtez.practice;

import java.util.*;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] res = arrayDiff(new int[]{1,2}, new int[]{1});
        System.out.println(Arrays.toString(res));
    }

    private static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    flag = true;
                break;
            }
            if (flag == false)
                list.add(i);
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = list.get(i);

        return res;
    }
}
