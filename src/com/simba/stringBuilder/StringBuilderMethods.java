package com.simba.stringBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringBuilderMethods {
    public static void main(String[] args) {
        List<List<String>> res = getGroceries();
        System.out.println(res);
        String item = res.get(0).get(0);
        System.out.println(item);
    }

    public static List<List<String>> getGroceries() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pawpaw");

        List<String> drinks = new ArrayList<>();
        drinks.add("Beer");
        drinks.add("Apple Juice");
        drinks.add("Mountain Dew");
        drinks.add("Origin Bitters");

        List<String> snacks = new LinkedList<>();
        snacks.add("Cheese Balls");
        snacks.add("Doritos");
        snacks.add("Biscuits");
        snacks.add("Peanuts");

        List<List<String>> groceryList = new LinkedList<>();
        groceryList.add(fruits);
        groceryList.add(drinks);
        groceryList.add(snacks);

        return groceryList;

    }

    public static void stringBuilderMethods() {
        StringBuilder str = new StringBuilder();
        str.append("Timo");
        str.insert(1, "Abc");
        str.replace(1, 4, "dog");
        str.delete(1, 4);
        str.reverse();
        System.out.println(str);
        int res = str.capacity();
        System.out.println(res);
        str.append("Yathsbdbibdubjkdbjbdkj");
        System.out.println(str.capacity());
    }
}
