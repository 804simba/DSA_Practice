package com.timtez.leetcode;

public class ReverseWordsInString {
    // https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println("Result: " + reverseWords(s));
//        Output: "s'teL ekat edoCteeL tsetnoc"
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splittedString = s.split(" ");

        for (String each : splittedString) {
            StringBuilder temp = new StringBuilder(each);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
