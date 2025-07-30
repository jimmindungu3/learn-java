package com.leetcode;

public class Fibonacci {
    public static int[] fibonacciGenerator(int number) {
        int[] fibonacci = new int[number];

        if (number > 1) fibonacci[1] = 1;

        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
