package com.dsa;

import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<String>();
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Toyota");

        System.out.println(cars); // [BMW, Mazda, Toyota, Volvo] // Automatically sorted
        System.out.println(cars.contains("Suzuki")); // false
        System.out.println(cars.size()); // 4
        System.out.println(cars.last()); // Volvo
    }
}
