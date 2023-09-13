package com.simba.codewars;

import java.util.HashMap;
import java.util.Map;

public class UnexpectedParsing {
    public static void main(String[] args) {
        Map<String, String> map = getStatus(true);
        System.out.println("Map: " + map);
    }
    public static Map<String, String> getStatus(boolean isBusy) {
        Map<String, String> map = new HashMap<>();
        String status = isBusy ? "busy" : "available";
        map.put("status", status);
        return map;
    }
}
