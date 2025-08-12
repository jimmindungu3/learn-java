package com.animalecosystem;

public class Chameleon extends Animal implements Prey, Camouflage{

    Chameleon(String name) {
        super(name);
    }

    @Override
    public void hide() {
        System.out.println("Chameleon " + getName() + " blends into the environment");
    }

    @Override
    public void flee() {
        System.out.println("Chameleon " + getName() + " cannot run fast");
    }
}
