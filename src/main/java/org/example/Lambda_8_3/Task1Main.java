package org.example.Lambda_8_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task1Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "New York"));
        people.add(new Person("Bob", 30, "London"));
        people.add(new Person("Charlie", 22, "New York"));
        people.add(new Person("Diana", 28, "Paris"));
        people.add(new Person("Eve", 35, "New York"));
        people.add(new Person("Frank", 19, "Berlin"));

        System.out.println("Original list:");
        people.forEach(System.out::println);

        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("\nSorted by age (ascending):");
        people.forEach(System.out::println);

        List<Person> newYorkers = new ArrayList<>(people);
        newYorkers.removeIf(p -> !p.getCity().equals("New York"));
        System.out.println("\nPeople from New York:");
        newYorkers.forEach(System.out::println);
    }
}