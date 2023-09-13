package com.simba.codewars;

public class GreetMe {
    public static String greetBF(String name) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                sb.append(Character.toUpperCase(name.charAt(0)));
            } else {
                sb2.append(name.charAt(i));
            }
        }
        sb2.append("!");
        String result = new String(sb);
        String result2 = new String(sb2);
        return "Hello " + result.concat(result2.toLowerCase());
    }
    public static String greet(String name) {
        return String.format("Hello %s%s!", name.substring(0, 1).toUpperCase(), name.substring(1).toLowerCase());
    }
    public static void main(String[] args) {
        String name = "TIMOTHY";
        System.out.println(greet(name));
        System.out.println(greetBF(name));
    }
}
