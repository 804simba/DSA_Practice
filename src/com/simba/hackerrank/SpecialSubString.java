package com.simba.hackerrank;
/*
* There are two types of characters in a particular language: special and normal. A character is special if its value is 1 and normal if its value is 0. Given string s, return the longest substring of s that contains at most k normal characters. Whether a character is normal is determined by a 26-digit bit string named charValue. Each digit in charValue corresponds to a lowercase letter in the English alphabet.
Example:
s = 'abcde'
alphabet = abcdefghijklmnopqrstuvwxyz
charValue = 10101111111111111111111111
For clarity, the alphabet is aligned with charValue below:
alphabet abcdefghijklmnopqrstuvwxyz
charValue = 10101111111111111111111111
The only normal characters in the language (according to charValue) are b and d. The string s contains both of these characters. For k = 2, the longest substring of s that contains at most k = 2 normal characters is 5 characters long, abcde, so the return value is 5. If k = 1 instead, then the possible substrings are ['b', 'd', 'ab', 'bc', 'cd', 'de',abc', 'cde']. The longest substrings are 3 characters long, which would mean a return value of 3.
Function Description
Lar
Complete the function getSpecialSubstring in the editor below.
getSpecialSubstring has the following parameter(s):
string s: the input string
int k: the maximum number of normal characters allowed in a substring
string charValue: a string representing special or normal for each letter of the alphabet, ascii[a-z]
Return:
int: an integer that denotes the length of the longest substring of s with at most k normal characters
Constraints
1 ≤ length of s ≤ 10^5
1 ≤ length of k ≤ the length of s
The length of charValue = 26
All values in charValue will be either 0 or 1
* */
public class SpecialSubString {
    public static int getSpecialSubstring(String s, int k, String charValue) {
        int[] charCount = new int[26];
        int maxSubstringLength = 0;
        int normalCount = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            int charIndex = currentChar - 'a';
            if (charValue.charAt(charIndex) == '0') {
                normalCount++;
            }
            charCount[charIndex]++;
            while (normalCount > k) {
                char leftChar = s.charAt(left);
                int leftCharIndex = leftChar - 'a';
                if (charValue.charAt(leftCharIndex) == '0') {
                    normalCount--;
                }
                charCount[leftCharIndex]--;
                left++;
            }
            maxSubstringLength = Math.max(maxSubstringLength, right - left + 1);
        }
        return maxSubstringLength;
    }
    public static void main(String[] args) {
        String s = "abcde";
        int k = 2;
        String charValue = "10101111111111111111111111";
        int result = getSpecialSubstring(s, k, charValue);
        System.out.println("Length of the longest substring: " + result);
    }
}
