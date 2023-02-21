package com.timtez.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
    // https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
    private static final Map<String, Character> MORSE_CODE_MAP = new HashMap<String, Character>() {{
        put(".-", 'A');
        put("-...", 'B');
        put("-.-.", 'C');
        put("-..", 'D');
        put(".", 'E');
        put("..-.", 'F');
        put("--.", 'G');
        put("....", 'H');
        put("..", 'I');
        put(".---", 'J');
        put("-.-", 'K');
        put(".-..", 'L');
        put("--", 'M');
        put("-.", 'N');
        put("---", 'O');
        put(".--.", 'P');
        put("--.-", 'Q');
        put(".-.", 'R');
        put("...", 'S');
        put("-", 'T');
        put("..-", 'U');
        put("...-", 'V');
        put(".--", 'W');
        put("-..-", 'X');
        put("-.--", 'Y');
        put("--..", 'Z');
        put("-----", '0');
        put(".----", '1');
        put("..---", '2');
        put("...--", '3');
        put("....-", '4');
        put(".....", '5');
        put("-....", '6');
        put("--...", '7');
        put("---..", '8');
        put("----.", '9');
    }};

    public static String decode(String morseCode) {
        String[] words = morseCode.trim().split("\\s{3}");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split("\\s+");
            for (String letter : letters) {
                sb.append(MORSE_CODE_MAP.get(letter));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String morseCode = ".... . -.--   .--- ..- -.. .";
        String decodedString = MorseCodeDecoder.decode(morseCode);
        System.out.println(decodedString); // Output: "HEY
    }
}
