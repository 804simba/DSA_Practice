package com.timtez.dcg;

import javax.naming.InsufficientResourcesException;

public class NumberToOrdinal {
    // https://stackoverflow.com/questions/6810336/is-there-a-way-in-java-to-convert-an-integer-to-its-ordinal-name

    public static void main(String[] args) {
//        String res = numberToOrdinal(25);
//        String res2 = nToOrdinal(233);
//        System.out.println(res2);
    }

    public static String numberToOrdinal(int n) {
        String[] suffixes = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
        switch(n % 100) {
            case 11:
            case 12:
            case 13:
                return n + "th";
            default:
                return n + suffixes[n % 10];
        }
    }

    public static  String nToOrdinal(int n) {
        int lastNumber = n%10;
        int lastTwoNumbers = n%100;
        StringBuilder suffix = new StringBuilder();

        if (lastNumber == 1 && lastTwoNumbers == 11) {
            suffix.append("st");
        } else if (lastNumber == 2 && lastTwoNumbers == 22) {
            suffix.append("nd");
        } else if (lastNumber == 3 && lastTwoNumbers == 33) {
            suffix.append("rd");
        } else {
            suffix.append("th");
        }
        return n + "" + suffix;
    }
}
