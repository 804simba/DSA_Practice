package com.timtez.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/submissions/889420569/

public class evaluateTheBracketPairsOfAString {
    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        List<String> nameList = new LinkedList<>();
        nameList.add("name");
        nameList.add("Bob");
        List<String> ageList = new LinkedList<>();
        ageList.add("age");
        ageList.add("two");
        List<List<String>> listOfLists = new LinkedList<>();
        listOfLists.add(nameList);
        listOfLists.add(ageList);

        String res = evaluate(listOfLists, s);
        System.out.println(res);
    }

    /*
    * First create a Map and map the elements of each of the lists as key value pairs, so we can compare them with the contents inside the brackets inside the string
    * Create a new StringBuilder object which is populated with characters of the given string input, only if they are not preceded by "(".
    * If there is a "(", we use increment the current value of i and store in a variable start.
    * then increment i long as i is less than the length of the given input string and the particular character we are indexing is not ")".
    * if it is, we use the start and current value of the iteration and get the substring from the string, which is the used to map the value, if the value does not
    * exist in the map, return "?".
    * return the stringBuilder object as a string.
    * */

    public static String evaluate(List<List<String>> knowledge, String s) {
        // (name)is(age)yearsold
        Map<String, String> map = new TreeMap<>();

        for (List<String> list : knowledge)
            map.put(list.get(0), list.get(1));

        StringBuilder newSentence = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(')
                newSentence.append(s.charAt(i));
            else {
                int start = i + 1;
                while (i < s.length() && s.charAt(i) != ')')
                    i++;
                newSentence.append(map.getOrDefault(s.substring(start, i), "?"));
            }
        }
        return newSentence.toString();
    }
}
