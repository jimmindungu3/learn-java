package com.james;

public class Fish implements Prey, Predator {
    @Override
    public void hunt() {
        System.out.println("Hunt smaller fish");
    }

    @Override
    public void runAway() {
        System.out.println("Run away from big fish");
    }

    public static void main(String[] args) {
        Fish bigFish = new Fish();
        bigFish.hunt();

        Fish smallFish = new Fish();
        smallFish.runAway();
    }
}
