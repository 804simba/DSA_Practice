package com.timtez.codewars;

import java.util.HashMap;
import java.util.Map;

public class CyclicString {
    public static void main(String[] args) {
        int res = cyclicString("cabca");
        System.out.println("result: " + res);
    }

    public static int cyclicString(String s) {
        int n = s.length();
        for (int L = 1; L <= n; L++) {
            boolean isCyclic = true;
            for (int i = L; i < n; i++) {
                if (s.charAt(i) != s.charAt(i-L)) {
                    isCyclic = false;
                    break;
                }
            }
            if (isCyclic) {
                return L;
            }
        }
        return n;
    }
}
