package com.timtez.leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/unique-morse-code-words/description/

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        final String[] morseCodes = {
                ".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--.."
        };

        final Set<String> codes = new HashSet<>();
        /* Since we are looking for unique transformations of morsecode for each word in the input.
        * loop through each word, then loop through each character and store the morsecode equivalent
        * in a StringBuilder object, after each loop, we add it to the Set.
        * Then we return the size of the Set.
        * */

        for (String word : words) {
            final StringBuilder morseCode = new StringBuilder();
            for (int i = 0, n = word.length(); i < n; i++) {
                morseCode.append(morseCodes[word.charAt(i) - 'a']);
            }
            codes.add(morseCode.toString());
        }

        return codes.size();
    }
}
