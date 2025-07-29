package com.dsa;

import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        // Add elements
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Volvo"); // Duplicate will be ignored
        cars.add("Mazda");

        // Print all
        System.out.println("Cars: " + cars);

        // Check if contains
        System.out.println("Has Toyota? " + cars.contains("Toyota"));

        // Remove an item
        cars.remove("Mazda");
        System.out.println("After removing Mazda: " + cars);

        // Size
        System.out.println("Size: " + cars.size());

        // Loop through
        System.out.print("Looped: ");
        for (String car : cars) {
            System.out.print(car + " ");
        }

        // Clear all
        cars.clear();
        System.out.println("\nAfter clear: " + cars);

        // Check if empty
        System.out.println("Is empty? " + cars.isEmpty());
    }
}
