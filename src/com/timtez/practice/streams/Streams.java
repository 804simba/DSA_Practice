package com.timtez.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people = getPeople();
        List<Person> women = new ArrayList<>();

        // imperative approach.
//        for (Person person : people) {
//            if (person.getGender().equals(Gender.FEMALE))
//                women.add(person);
//        }
//        System.out.println(women);

        // declarative approach
        // FILTER

//        List<Person> females = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
//                .collect(Collectors.toList());
//
//        females.forEach(System.out::println);

        // SORTED
//        List<Person> sortedPeople = people.stream().sorted(Comparator.comparing(Person::getAge).reversed())
//                .collect(Collectors.toList());
//        sortedPeople.forEach(System.out::println);

        // ALL MATCH
//        boolean allMatch = people.stream().allMatch(person -> person.getAge() > 9);
//        System.out.println(allMatch);
//
//        // ANY MATCH
//        boolean anyMatch = people.stream().allMatch(person -> person.getAge() > 100);
//        System.out.println(anyMatch);
//
//        // NONE MATCH
//        boolean noneMatch = people.stream().noneMatch(person -> person.getName().equals("Jack Rob"));
//        System.out.println("Does this name exist ?" + noneMatch);

//        System.out.print("The oldest person is : ");
//        people.stream().max(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);
//
//        System.out.print("The youngest person is : ");
//        people.stream().min(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);

        // GROUP PEOPLE BY AGE
//        Map<Gender, List<Person>> groupedMap = people.stream().collect(Collectors.groupingBy(Person::getGender));
//        groupedMap.forEach((gender, people1) -> {
//            System.out.println("Gender:");
//            people1.forEach(System.out::println);
//            System.out.println();
//        });

        // GET THE NAME OF THE OLDEST FEMALE USING METHOD CHAINING.
        // Optional is a container object which may or may not contain a non-null value.
        // if a value is present, isValue() will return true, and get() will return the value.
        Optional<String> oldestFemale = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemale.ifPresent(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
            new Person("John Doe", 20, Gender.MALE),
            new Person("Jane Doe", 10, Gender.FEMALE),
            new Person("Angela Yu", 40, Gender.FEMALE),
            new Person("John Cena", 92, Gender.MALE),
            new Person("Jack Rob", 102, Gender.MALE),
            new Person("Tim Tez", 32, Gender.MALE)
        );
    }
}