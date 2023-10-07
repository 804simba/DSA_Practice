package com.simba.leetcode;

import java.math.BigDecimal;

// https://leetcode.com/problems/multiply-strings/
public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        BigDecimal numberOne = new BigDecimal(num1);
        BigDecimal numberTwo = new BigDecimal(num2);
        return numberOne.multiply(numberTwo).toString();
    }
    public static void main(String[] args) {
        System.out.println("Answer: " + multiply("123", "456"));
    }
}
