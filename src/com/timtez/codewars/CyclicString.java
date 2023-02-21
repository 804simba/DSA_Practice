package com.timtez.codewars;

public class CyclicString {
    public static void main(String[] args) {
        int res = cyclicString("abaca");
        System.out.println("result: " + res);
    }

    public static int cyclicString(String s) {
        int n = s.length();
        // this checks the string for repeating characters, using the inner for loop
        // to index and search the substring to see if the character at i-l is equal to the
        // one at i;
        for (int L = 1; L <= n; L++) {
            boolean isCyclic = true;
            for (int i = L; i < n; i++) { if (s.charAt(i) != s.charAt(i-L)) { isCyclic = false; break; } }
            if (isCyclic) { return L; }
        }
        return n;
    }
}
