package com.simba.practice;

import java.util.*;

public class HasDuplicates {
    public static void main(String[] args) {
        boolean res = hasDuplicates("   ");
        if (res)
            System.out.println("Has duplicates.");
        else
            System.out.println("no duplicates.");
    }

    public static boolean hasDuplicates(String str) {
        int start = 0;
        int end = 1;

        String sortedString = sortString(str);
        while (start <= str.length()-2 && end <= str.length()-1) {
            if (sortedString.charAt(start) == sortedString.charAt(end))
                return true;
            start++; end++;
        }
        return false;
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
