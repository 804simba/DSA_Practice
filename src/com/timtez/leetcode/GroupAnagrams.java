package com.timtez.leetcode;

import java.util.*;
/***
 * First we looped through the input string array, then converted each string to a character array, then sorted it.
 * and created a new sortedString from the character array. If the map contains the sorted string as a key, we just
 * retrieve the list mapping to that key and add the string, else we create a new list and map it with the sorted String
 * and put it into the map.
 * we had a List of Lists of Strings which we are returning as per the question.
 * Lastly, we looped through each keySet in the map and created a new ArrayList containing the values of each key
 * in the map, and added each one to the List of Lists.
 */


public class GroupAnagrams {
    // https://leetcode.com/problems/group-anagrams/
    public static void main(String[] args) {
        String[] stringsArray = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Result: " + groupAnagrams(stringsArray));
        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    }
    public static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> listsOfAnagram = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strings) {
            char[] chArray = s.toCharArray();
            // sorted strings with the same characters will be the same.
            Arrays.sort(chArray);
            String sorted_string = new String(chArray);
            if (map.containsKey(sorted_string)) {
                List<String> currentList = map.get(sorted_string);
                currentList.add(s);
                map.put(sorted_string, currentList);
            } else {
                List<String> listOfAnagram = new ArrayList<>();
                listOfAnagram.add(s);
                map.put(sorted_string, listOfAnagram);
            }
        }
        for (String s : map.keySet()) {
            listsOfAnagram.add(new ArrayList<>(map.get(s)));
        }
        return listsOfAnagram;
    }
}
