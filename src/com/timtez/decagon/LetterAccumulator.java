package com.timtez.decagon;

public class LetterAccumulator {
    // given "abcd" return "A-Bb-Ccc-Dddd";
    // given "rgkWlg" return "G-Gb-Kkk-Wwww-Lllll-Gggggg";
    public static void main(String[] args) {
        System.out.println(accumulator("cwAt"));
        System.out.println(accumulator2("cwAt"));
    }

    public static String accumulator(String str) {
        char[] characterArray = str.toCharArray();
        char[] uppercaseChar = str.toUpperCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        int pointer = 0;
        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length()) {
                sb.append(uppercaseChar[pointer++]);
                sb.append(String.valueOf(characterArray[i - 1]).toLowerCase().repeat(i));
                sb.append("-");
            } else {
                sb.append(uppercaseChar[pointer++]);
                sb.append(String.valueOf(characterArray[i - 1]).toLowerCase().repeat(i - 1));
                sb.append("-");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public static String accumulator2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i > 0) {
                sb.append('-');
            }
            sb.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
