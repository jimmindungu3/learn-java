package com.james;

public class Rabbit implements Prey {

    @Override
    public void runAway() {
        System.out.println("Run away or get eaten");
    }

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.runAway();
    }
}
