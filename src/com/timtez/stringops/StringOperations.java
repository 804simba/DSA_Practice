package com.timtez.stringops;

public class StringOperations {
    public static void main(String[] args) {
        charArrayToString();
    }

    public static void charArrayToString() {
        // character array to string
        char[] charArray = {'g', 'a', 'b', 'r', 'i', 'e', 'l'};
        String s = new String(charArray);
        System.out.println("s: " + s);

        // allocate string from character array
        String s1 = new String(charArray, 1, 3);
        System.out.println("s1: " + s1);

        // create new string from stringbuilder
        StringBuilder sb = new StringBuilder("Timothy");
        String newString = new String(sb);
        System.out.println("newString: " + newString);

        // get string length
        int length = "Geeks4Geeks".length();
        System.out.println("length: " + length);

        // get substring from a string
        String myName = "Olisaeloka";
        System.out.println("substring: " + myName.substring(1, 5));

        // concatenation
        String fName = "Timothty";
        String lName = "Ngonadi";
        String output = fName.concat(lName);
        System.out.println("Concatenation of two names: " + output);

        // index of String
        System.out.println("indexOf character: " + fName.indexOf('t'));
        System.out.println("lastIndexOf character: " + fName.lastIndexOf('t'));
        String checkIndex = "last time i saw her";
        System.out.println("Index of substring: " + checkIndex.indexOf("time"));

        // compare string to specified object
        System.out.println("Geeks".equals("Geeks"));
        System.out.println("Geeks".equalsIgnoreCase("GEeks"));

        // convert string to lowercase
        String cartoonName = "JeRRy";
        System.out.println("lowercase: " + cartoonName.toLowerCase());
        System.out.println("uppercase: " + cartoonName.toUpperCase());

        // trim whitespaces at beginning and end of string
        String stringToTrim = " Harry Potter ";
        System.out.println("Trimmed string: " + stringToTrim.trim());

        // replace
        String s2 = "feeks4feeks";
        String newS2 = s2.replace('f', 'g');
        System.out.println("replaced string: " + newS2);

        String email = "timothy703olisaeloka804@gmail.com";
        System.out.println(email.replaceAll("[0-9]", ""));

        // check if a given string contains s sequence of characters.
        String word = "software";
        System.out.println("Does it contain word? " + word.contains("soft"));
    }
}
