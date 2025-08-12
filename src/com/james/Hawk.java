package com.james;

public class Hawk implements Predator {

    @Override
    public void hunt() {
        System.out.println("Hunt or die of hunger");
    }

    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        hawk.hunt();
    }
}

