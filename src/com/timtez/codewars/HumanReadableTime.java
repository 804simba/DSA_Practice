package com.timtez.codewars;

public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println("Result: " + humanReadableTime(86399));
    }
    public static String humanReadableTime(int seconds) {
        int hours = seconds / 3600;
        int min = seconds % 3600 / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, min, secs);
    }
}
