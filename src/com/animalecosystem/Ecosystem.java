package com.animalecosystem;

public class Ecosystem {
    public static void main(String[] args) {
        Chameleon chameleon = new Chameleon("Color Master");
        Tiger tiger = new Tiger("Jungle Master");
        Deer deer = new Deer("Savanna Master");

        Animal tigress  = new Tiger("Tigress");
        ((Predator) tigress).hunt();

        deer.flee();
        tiger.hunt();
        chameleon.hide();
        chameleon.flee();
    }
}
