package com.james;

public class Vehicle {
    int wheels = 4;
    String make;
    String model;
    String yearOfManufacture;

    // Constructor
    Vehicle(String make, String model, String yearOfManufacture) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void drive() {
        System.out.println("Vroom");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", "2016");
        car.drive();      // Inherited from Vehicle
        Car.squeel();     // Static method in Car
        System.out.println(car.wheels);
    }
}

class Car extends Vehicle {
    // Constructor must call superclass constructor
    Car(String make, String model, String yearOfManufacture) {
        super(make, model, yearOfManufacture);
    }

    static void squeel() {
        System.out.println("Squeel");
    }
}
