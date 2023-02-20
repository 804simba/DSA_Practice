package com.timtez.codewars;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class deleteMaxOccurrences {
    public static void main(String[] args) {
        int[] res = deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int element : elements) {
            int occurrences = map.getOrDefault(element, 0);
            if (occurrences < maxOccurrences) {
                list.add(element);
                map.put(element, occurrences + 1);
            }
        }

        int[] resArray = new int[list.size()];
        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = list.get(i);
        }
        return resArray;
    }

    public static int[] deleteNthOccur(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(element -> map.merge(element, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }

}
