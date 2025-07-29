package com.dsa;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars.getFirst()); // Volvo
        System.out.println(cars.getLast()); // Ford
        System.out.println(cars); // [Volvo, BMW, Ford]
        cars.addFirst("Mazda");
        System.out.println(cars); // [Mazda, Volvo, BMW, Ford]
        cars.addLast("Suzuki");
        System.out.println(cars); // [Mazda, Volvo, BMW, Ford, Suzuki]
        cars.removeLast();
        System.out.println(cars); // [Mazda, Volvo, BMW, Ford]
        cars.removeFirst();
        System.out.println(cars); // [Volvo, BMW, Ford]
        cars.clear();
        System.out.println(cars); // []
    }
}
