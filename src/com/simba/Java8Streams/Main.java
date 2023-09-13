package com.simba.Java8Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product(1, "Macbook", 2000f),
                new Product(2, "Dell", 25000f),
                new Product(3, "Samsung", 35000f),
                new Product(4, "Lenovo", 10000f),
                new Product(5, "Nokia", 51000f),
                new Product(6, "Nokia", 52000f),
                new Product(7, "Nokia", 54000f),
                new Product(8, "Nokia", 55000f),
                new Product(9, "HP Laptop", 75000f)));

        // printing product prices of products greater than 10k
        List<Float> prices = products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10000f).toList();
        System.out.println("Prices: " + prices);

        Product laptop = new Product(100, "HY", 244f);
        Function<Product, String> func = Product::getName;
        System.out.println("Name: " + func.apply(laptop));

        // printing product lists of items that their prices are less 35k and greater than 50k
        products.stream()
                .filter(product -> product.getPrice() < 35000f)
                .forEach(System.out::println);

        products.stream()
                .filter(product -> product.getPrice() > 50000f)
                .forEach(System.out::println);
        // calculating the sum of all product prices.
        Float totalCostOfProducts = products.stream()
                .map(Product::getPrice) // product.getPrice()
                .reduce(0.0f, Float::sum); // .reduce(0.0f, (sum, price) -> sum + price)
        System.out.println("Total: $" + totalCostOfProducts);

        // sum of all product prices as double.
        double totalCostAsDouble = products.stream()
                .mapToDouble(Product::getPrice).sum();
        System.out.println("Total cost as double: " + totalCostAsDouble);
        System.out.println("Total sum of ids: " + products.stream()
                .mapToInt(Product::getId).sum());

        // Get the maximum product with max price.
        Product productWithMaxPrice = products.stream()
                .max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);
        System.out.println("Max price: $" + productWithMaxPrice.getPrice());

        Product productWithMaxPrice2 = products.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
        System.out.println("Max price: $" + productWithMaxPrice2.getPrice());

        // find product with minimum price
        Product productWithMinPrice = products.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
        System.out.println("Min price: $" + productWithMinPrice.getPrice());

        // count of products with the name "Nokia"
        int count = (int) products.stream()
                .filter(product -> product.getName().equals("Nokia"))
                .count();
        System.out.println(count + " items are named Nokia...");

        // get products with distinct names.
        List<Product> distinctProduct = products.stream()
                .distinct().toList();
        System.out.println("Distinct products: " + distinctProduct);
        distinctProduct.forEach(product -> System.out.println(product.getName()));

        // converting product list into Set
        Set<Product> productSet = products.stream()
                .filter(product -> product.getPrice() > 10000f)
                .collect(Collectors.toSet());
        System.out.println("Set of products: " + productSet);

        // converting product list into a Map
        Map<Integer, String> map = products.stream()
                .collect(Collectors.toMap(Product::getId, Product::getName));
        System.out.println("Product map: " + map);

        System.out.println("Count example: " + Arrays.asList(-1, 30, 50, 49, 12, 0)
                .stream()
                .filter(n -> n % 2 == 0)
                        .reduce(Integer::sum)
                        .get());

        System.out.println("FlatMap example: " + List.of(Arrays.asList("Timothy", "Dauda", "Kehinde", "Taiwo"))
                .stream().flatMap(array -> array.stream())
                                .collect(Collectors.joining(", ")));

    }
}
