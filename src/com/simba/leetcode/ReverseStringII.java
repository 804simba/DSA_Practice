package com.simba.leetcode;


public class ReverseStringII {
    // https://leetcode.com/problems/reverse-string-ii/description/
    public static void main(String[] args) {
        String string = "abcdefg";
        //badc
        int k = 2;
        System.out.println("Reverse String >>" + reverseString(string, k));
        System.out.println("Reverse String 2 >>" + reverseString2(string, k));
    }
    public static String reverseString2(String string, int k) {
        // reversed only 2*k characters...
        char[] strCharArray = string.toCharArray();
        int len = string.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= len-1; i += 2*k) {
            StringBuilder temp = new StringBuilder();
            if (i+k-1 <= len-1) {
                String s = string.substring(i, i+k);
                temp.append(s).reverse();
                sb.append(temp);
            } else {
                String s2 = string.substring(i, len);
                temp.append(s2).reverse();
                sb.append(temp);
            }
        }
        return sb.toString();
    }
    public static String reverseString(String string, int k) {
        char[] strCharArray = string.toCharArray();
        int length = strCharArray.length;

        for (int i = 0; i <= length-1; i += 2*k) {
            if (i+k- 1 <= length-1) {
                reverseK(i, i+k-1, strCharArray);
            } else {
                // for fewer than k characters left (edge case);
                reverseK(i, length-1, strCharArray);
            }
        }
        return new String(strCharArray);
    }
    public static void reverseK(int i, int j, char[] strCharArray) {
        while (i < j) {
            char temp = strCharArray[i];
            strCharArray[i] = strCharArray[j];
            strCharArray[j] = temp;
            i++;
            j--;
        }
    }
}
