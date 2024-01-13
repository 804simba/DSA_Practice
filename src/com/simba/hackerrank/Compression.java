package com.simba.hackerrank;
/*
* Different compression techniques are used in order to reduce the size of the messages sent over the web. An algorithm is designed to compress a given string by describing the total number of consecutive occurrences of each character next to it. For example, consider the string "abaasass". Group the consecutive occurrence of each character:
'a'occurs one time.
'b'occurs one time.
'a' occurs two times consecutively.
's'occurs one time.
'a'occurs one time.
's'occurs two times consecutively.
If a character only occurs once, it is added to the compressed string. If it occurs consecutive times, the character is added to the string followed by an integer representing the number of consecutive occurrences. Thus the compressed form of the string is "aba2sas2".
Function Description Complete the function compressedString in the editor below. The function must return the compressed form of message.
compressedString has the following parameter(s):
string message: a string
Returns:
string: the compressed message
Constraints
• message[i] e ascii[a-z)
|message| ≤ 10^5
* */
public class Compression {
    public static String compressedString(String message) {
        if (message == null || message.length() == 0) {
            return "";
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < message.length(); i++) {
            if (message.charAt(i) == message.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(message.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        // Append the last character and its count
        compressed.append(message.charAt(message.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }
        return compressed.toString();
    }
    public static void main(String[] args) {
        String message = "abaasass";
        String compressedMessage = compressedString(message);
        System.out.println("Original String: " + message);
        System.out.println("Compressed String: " + compressedMessage);
    }
}
