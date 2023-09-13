package com.simba.practice;

import java.util.HashMap;
import java.util.Map;

public class TrackCriminals {
    public static void main(String[] args) {
        String[][] routes = {{"USA", "BRA"}, {"JPN", "PHL"}, {"BRA", "UAE"}, {"UAE", "JPN"}};
        findRoute(routes);
    }

    static void findRoute(String[][] locations) {
        Map<String, String> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        // store each route in the array as key value pairs
        for (String[] route : locations) {
            String from = route[0];
            String to = route[1];
            map.put(from, to);
        }

        StringBuilder firstLocation = new StringBuilder();

        // the first visited location that is not a value in the map.
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!map.containsValue(entry.getKey())) { firstLocation.append(entry.getKey()); }
        }

        // add the first location to the StringBuilder
        result.append(firstLocation);
        int mapSize = map.size();
        // while the mapsize > 0; search for the next visited country and decrement the counter.
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
