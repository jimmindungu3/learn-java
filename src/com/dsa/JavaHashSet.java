package com.dsa;

import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("BMW"); // Duplicates not allowed. No error raised tho'
        boolean hasToyota = cars.contains("Toyota");
        System.out.println(hasToyota);
        cars.remove("BMW");
        System.out.println(cars);

        HashSet<Integer> numbs = new HashSet<>();
        numbs.add(10);
        numbs.add(20);
        numbs.add(30);
        numbs.add(40);
        numbs.add(50);

        for (int numb : numbs){
            System.out.println(numb); // Order of numbers lost
        }
    }
}
