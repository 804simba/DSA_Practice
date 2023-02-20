package com.timtez.stringBuilder;

public class StringMethods {
    public static void main(String[] args) {
//        contains("()k");
        if (isValidParentheses("([])")) {
            System.out.println("yes");
        } else
            System.out.println("No");
    }

    public static void contains(String s) {
        if (s.contains("()")) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

        public static boolean isValid(String braces) {
            int lengthOfBraces = braces.length();
            for(int i = 0; i < lengthOfBraces; i++){
                braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
            }
            return braces.isEmpty();
        }

        public static boolean isValidParentheses(String braces) {
            String prev = "";
            while (!prev.equals(braces)) {
                prev = braces;
                braces = braces.replace("()", "");
                braces = braces.replace("[]", "");
                braces = braces.replace("{}", "");
            }
            return braces.isEmpty();
        }
}
