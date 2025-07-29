package com.dsa;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        // Add elements
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");

        // Print all members
        System.out.println("All cars: " + cars);

        // Access element
        System.out.println("First car: " + cars.get(0));

        Collections.sort(cars);
        System.out.println("Sorted cars: " + cars);

        // Change element
        cars.set(1, "BMW");
        System.out.println("After update: " + cars);

        // Remove element
        cars.remove("Mazda");
        System.out.println("After removing Mazda: " + cars);

        // Check size
        System.out.println("Size: " + cars.size());

        // Check if contains
        System.out.println("Has Toyota? " + cars.contains("Toyota"));

        // Loop through
        System.out.print("Looped: ");
        for (String car : cars) {
            System.out.print(car + " ");
        }

        // Clear all
        cars.clear();
        System.out.println("\nAfter clear: " + cars);
    }
}
