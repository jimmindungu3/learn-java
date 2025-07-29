package com.dsa;

import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add key-value pairs
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Print full map
        System.out.println("All entries: " + capitalCities);

        // Get a value by key
        System.out.println("Capital of Germany: " + capitalCities.get("Germany"));

        // Remove a key
        capitalCities.remove("Norway");
        System.out.println("After removing Norway: " + capitalCities);

        // Check if key exists
        System.out.println("Contains USA? " + capitalCities.containsKey("USA"));

        // Check if value exists
        System.out.println("Contains London? " + capitalCities.containsValue("London"));

        // Get size
        System.out.println("Map size: " + capitalCities.size());

        // Loop through keys
        System.out.print("Countries: ");
        for (String country : capitalCities.keySet()) {
            System.out.print(country + ", ");
        }

        // Loop through values
        System.out.print("\nCapitals: ");
        for (String city : capitalCities.values()) {
            System.out.print(city + ", ");
        }

        // Loop through key-value pairs
        System.out.println("\nKey-Value pairs:");
        for (String country : capitalCities.keySet()) {
            System.out.println(country + " -> " + capitalCities.get(country));
        }

        // Clear all
        capitalCities.clear();
        System.out.println("After clear: " + capitalCities);

        // Check if empty
        System.out.println("Is empty? " + capitalCities.isEmpty());
    }
}
