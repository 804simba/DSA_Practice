package com.timtez.attendToLater;

import java.util.HashMap;
import java.util.Map;

public class ThreeSumWithMultiplicity {
    // https://leetcode.com/problems/3sum-with-multiplicity/description/

    // solution
    // https://leetcode.com/problems/3sum-with-multiplicity/solutions/181128/10-lines-super-super-easy-java-solution/
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int target = 8;
        int answer = threeSumMulti(arr, target);
        System.out.println(answer);
    }

    public static int threeSumMulti(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            res = (res + map.getOrDefault(target - A[i], 0)) % mod;
            System.out.println(res);

            for (int j = 0; j < i; j++) {
                int temp = A[i] + A[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
            System.out.println(map.toString());
        }
        return res;
    }
}
