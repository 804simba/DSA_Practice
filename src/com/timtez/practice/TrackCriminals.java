package com.timtez.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackCriminals {
    public static void main(String[] args) {
        String[][] array = {{"USA", "BRA"}, {"JPN", "PHL"}, {"BRA", "UAE"}, {"UAE", "JPN"}};
        findRoutes(array);
    }

    public static String findRoutes(String[][] routes) {
        // TODO: You code here
        Map<String, String> mapRoutes = new HashMap<>();
        String result = "";

        for (String[] each : routes) {
            mapRoutes.put(each[0], each[1]);
        }
        String first = "";
        for (Map.Entry<String, String> each : mapRoutes.entrySet()) {
            if (!mapRoutes.containsValue(each.getKey())) {
                first += each.getKey();
            }
        }
        result += first;
        int i = mapRoutes.size();
        while (i > 0) {
            String next = mapRoutes.get(first);
            result += ", " + next;
            first = next;
            i--;
        }
        return result;
    }
}

