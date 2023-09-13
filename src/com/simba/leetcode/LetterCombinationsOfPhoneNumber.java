package com.simba.leetcode;

import java.util.*;

public class LetterCombinationsOfPhoneNumber {

    // www.leetcode.com/problems/letter-combinations-of-a-phone-number
    public static void main(String[] args) {
        System.out.println(letterCombinations("32"));
    }

    public static List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> listOfPermutations = new ArrayList<>();

        if (digits.isEmpty() || Objects.isNull(digits)) {
            return listOfPermutations;
        }

        generateCombinations(digits, 0, "", listOfPermutations, map);

        return listOfPermutations;
    }

    private static void generateCombinations(String digits, int idx, String currentPermutationString, List<String> listOfPermutations, Map<Character, String> map) {
        if (idx == digits.length()) {
            listOfPermutations.add(currentPermutationString);
            return;
        }

        char digit = digits.charAt(idx);
        String mappedLetters = map.get(digit);

        for (int i = 0; i < mappedLetters.length(); i++) {
            generateCombinations(digits, idx + 1, currentPermutationString + mappedLetters.charAt(i), listOfPermutations, map);
        }
    }
}
