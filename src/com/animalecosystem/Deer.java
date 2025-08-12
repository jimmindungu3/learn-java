package com.animalecosystem;

public class Deer extends Animal implements Prey {
    Deer(String name) {
        super(name);
    }

    @Override
    public void flee() {
        System.out.println("Deer " + getName() + " flees swiftly");
    }
}
