package com.simba.algos;

public class Recursion {
    public static void main(String[] args) {
        int result = lengthOfString("hello");
        System.out.println(result);
    }

    static int fibonacciNumber(int n) {
        // for numbers less than 2, return them as they are.
        if (n < 2)
            return n;
            // otherwise apply the recursive occurrence formula.
        else
            return fibonacciNumber(n - 2) + fibonacciNumber(n - 1);
    }

    static int sumNumbers(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n % 10) + (sumNumbers(n / 10));
    }

    static int multiplyDigits(int n) {
        if (n <= 0)
            return n;
        return (n % 10) * (sumNumbers(n / 10));
    }

//    static void reverseNumber(int n, int start, int end) {
//        if (n <= 0)
//            return;
//        int[] resultArray = new int[]
//        int lastNumber = n % 10;
//        return las
//    }

    public static boolean isPowerOfFour(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        if (n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);
    }

    public static boolean isOdd(int n, int index) {
        // a prime number is a number greater than one and only divisible by one and itself
        if (n <= 2)
            return (n == 2) ? true: false;
        if (n % index == 0)
            return false;
        if (index * index > n)
            return true;

        return isOdd(n, index + 1);
    }

    public static int productOfTwoNums(int x, int y) {
        // if x is less than y, swap values.
        if (x < y)
            return productOfTwoNums(y, x);
        // long as y is not zero, recursively reduce y;
        else if (y != 0)
            return (x + productOfTwoNums(x, y - 1));
        // BASE CASE
        // if either of the values are zero, return 0;
        // then sum x with the return value of each previous recursive call.
        else
            return 0;
    }

    public static int sumOfDigitsOfNumber (int n) {
        if (n == 0)
            return 0;
        int lastNumber = n % 10;
        return lastNumber + sumOfDigitsOfNumber(n - 1);
    }

    public static int lengthOfString(String str) {
        // returns 5;
        // "hello" 1 + 4 = 5
        // "ello" 1 + 3 = 4
        // "llo" 1 + 2 = 3
        // "lo" 1 + 1 = 2
        // "o" 1 + 0 = 1
        // 0
        if (str.equals(""))
            return 0;
        return lengthOfString(str.substring(1)) + 1;
    }

    public static int sumOfNaturaLNums(int n) {
        if (n == 1)
            return 1;
        return n + sumOfNaturaLNums(n - 1);
    }

    public static int digitalRootOfNumber(int n) {
        // sum the number until it returns a single digit.
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digitalRootOfNumber(sum);
    }
}
