package com.timtez.decagon;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Maskify {
    public static void main(String[] args) {
        System.out.println("Maskify -> " + maskify("122223333")); // expected answer: 12222####
        System.out.println("MaskifyUsingStreams -> " + maskifyUsingStreams("122223333"));
    }

    public static String maskify(String cc) {
        if (cc == null || cc.length() == 0) {
            return "";
        }

        char[] charArray = cc.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cc.length(); i++) {
            if (i < cc.length() - 4) {
                sb.append("#");
            } else {
                sb.append(charArray[i]);
            }
        }
        return new String(sb);
    }

    /* This solution uses the IntStream.range method to generate a stream of integers from 0 to the length of the input string.
    For each integer, it checks whether the index is less than the length of the string minus 4. If so, it returns the "#" character.
    Otherwise, it returns the character at that index in the input string converted to a string using String.valueOf.
    Finally, it collects the resulting strings into a single string using Collectors.joining. */
    public static String maskifyUsingStreams(String cc) {
        if (cc == null || cc.length() == 0) {
            return "";
        }
        int len = cc.length();
        return IntStream.range(0, len)
                .mapToObj(i -> i < len - 4 ? "#" : String.valueOf(cc.charAt(i)))
                .collect(Collectors.joining());
    }
}
