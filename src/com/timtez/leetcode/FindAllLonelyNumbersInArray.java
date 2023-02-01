package com.timtez.leetcode;

import java.util.*;

public class FindAllLonelyNumbersInArray {
    /*
    * You are given an integer array nums.
    * A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.
    * Return all lonely numbers in nums. You may return the answer in any order.
    * */

    public static void main(String[] args) {
        findLonely(new int[]{10, 6, 5, 8});
    }

    public static List<Integer> findLonely(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();
        /*
        * 1. Create a new HashMap, and a new Linkedlist because the questions expects you to returh a List
        * 2. Populate the hashmap with each value of the given array.
        * 3. HashMaps do not allow duplicate keys, so it will handle any duplicate values in the array.
        * 4. Set the default key values of each key to 1, by using the getOrDefault() method.
        * 5. loop through the array and check if there are no keys of x-1 and x+1 for each keys in the hashmap.
        *    then add that integer to the list. return the list after the iteration.
        * */

        for (int number : arr)
            map.put(number, map.getOrDefault(number, 0) + 1);
        for (int number : arr)
            if (map.get(number) == 1 && !map.containsKey(number - 1) && !map.containsKey(number + 1))
                list.add(number);
        return list;
    }
}
