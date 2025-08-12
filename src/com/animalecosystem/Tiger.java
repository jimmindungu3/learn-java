package com.animalecosystem;

public class Tiger extends Animal implements Predator {
    Tiger(String name) {
    super(name);
    }


    @Override
    public void hunt() {
        System.out.println("Tiger " + getName() + " hunts prey");
    }
}
