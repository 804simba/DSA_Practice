package com.simba.algos;

public class FirstUpperCase {
    public static void main(String[] args) {
        int pointer = 0;
        String s = "geeKs";
        char result = firstUpperCase(s, pointer);
        if (result == 0)
            System.out.println("No uppercase character.");
        else
            System.out.println(result);
    }

    public static char firstUpperCase(String s, int pointer) {
        if (s.charAt(pointer) == '\0')
            return 0;

        char currentCharacter = s.charAt(pointer);
        if (Character.isUpperCase(currentCharacter)) {
            return currentCharacter;
        }
        // made the recursive call in a try catch block;
        try {
            return firstUpperCase(s, pointer + 1);
        } catch (Exception e) {
            System.out.println("Exception occurs");
        }
        return 0;
    }
}
