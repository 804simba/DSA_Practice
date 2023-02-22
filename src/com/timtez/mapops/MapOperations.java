package com.timtez.mapops;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class MapOperations {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tim");
        map.put(2, "Naomi");
        map.put(3, "Ruth");

        map.computeIfAbsent(5, k -> "Hannah");
        System.out.println(map);
        map.computeIfPresent(1, (key, value) -> "Young Thug");
        System.out.println(map);

        Random rnd = new Random();
        System.out.println("Random int: " + rnd.nextInt(300));

        Random random = new Random();
        IntStream ints = random.ints(5, 1, 200);
        System.out.print("Random integers stream: ");
        ints.forEach(System.out::println);
    }
}
