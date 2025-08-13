package com.dsa;

import java.util.LinkedList;

public class Stack {
    static LinkedList<String> cars = new LinkedList<String>();
    public static void main(String[] args) {
    cars.push("Mazda");
    cars.push("Toyota");
    cars.pop();
    cars.peek();
    cars.isEmpty();
    }

    public void push(String car) {
        cars.add(car);
    }
    public void pop() {
        cars.removeLast();
    }
    public String peek(int index) {
        return cars.get(index);
    }
    public boolean isEmpty(LinkedList linkedList) {
        return (linkedList.isEmpty());
    }
}
