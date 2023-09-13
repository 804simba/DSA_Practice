package com.simba;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[][] routes = {{"USA", "BRA"}, {"JPN", "PHL"}, {"BRA", "UAE"}, {"UAE", "JPN"}};
        findRoute(routes);
    }

    static void findRoute(String[][] locations) {
        Map<String, String> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String[] route : locations) {
            map.put(route[0], route[1]);
        }

        StringBuilder firstLocation = new StringBuilder();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!map.containsValue(entry.getKey())) { firstLocation.append(entry.getKey()); }
        }

        result.append(firstLocation);
        int mapSize = map.size();
        while (mapSize > 0) {
            String nextLocation = map.get(firstLocation.toString());
            result.append(", ");
            result.append(nextLocation);
            firstLocation = new StringBuilder(nextLocation);
            mapSize--;
        }
        System.out.println("Final routes: " + result);
    }
}
