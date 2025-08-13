package com.dsa;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main (String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("BMW");
        cars.set(2, "Jeep");

        cars.add(3, "Mercedes");
        cars.add(4, "Audi");

        String japaneseCar = cars.get(0);
        System.out.println("Japanese car: " + japaneseCar);
        System.out.println(cars.size());

        System.out.println(cars);

        Collections.sort(cars);

        for (String car : cars) {
            System.out.println(car);
        }

    }
}

