package com.simba.leetcode;

public class PalindromicSubstring {

    public static void main(String[] args) {
        int count = countSubstrings("aabaa");
        System.out.println(count);
    }
    public static int countSubstrings(String str) {
        if(str == null || str.length() < 1) return 0;
        int count = 0;
        for(int i=0;i<str.length();i++){
            count += countPalindromes(str, i, i); //Count even sized
            count += countPalindromes(str, i, i+1); //Count odd sized
        }
        return count;
    }

    private static int countPalindromes(String str, int start, int end){
        int count = 0;
        while(start>=0 && end<str.length() && str.charAt(start) == str.charAt(end)){
            start--;
            end++;
            count++;
        }
        return count;
    }
}
