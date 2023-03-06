package com.timtez.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    static String reverseString(String word) {
        StringBuilder sb = new StringBuilder(word);
        String rs = sb.reverse().toString();
        return rs;
    }
    static String reverseStringUsingJavaStream(String word) {
        String result = Arrays.asList(word.split(" "))
                .stream().map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Reversed string: " + reverseString("Geeks for Geeks"));
        String name = "timothy Ngonadi Olisaeloka";
        System.out.println("Reversed String using Java Stream API: " + reverseStringUsingJavaStream(name));
        List<String> nameArray = new ArrayList<>(List.of(name.split(" ")));
        System.out.println("Splitted word: " + nameArray);
    }
}
