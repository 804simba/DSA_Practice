package com.timtez.dcg;
import java.util.Arrays;
public class ReverseOrder {
    public static void main(String[] args) {
        int result = descendingOrder(74251882);
        System.out.println(result);
    }
    public static int descendingOrder(int num) {
        if (num < 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        String s = new String(Integer.toString(num));
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        char[] cArray = sb.toString().toCharArray();
        Arrays.sort(cArray);
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < cArray.length; i++) {
            sb2.append(cArray[i]);
        }
        return Integer.parseInt(sb2.reverse().toString());
    }
}
