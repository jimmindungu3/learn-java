package com.leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 6, 12, 24, 15, 16};
        System.out.println(Arrays.toString(Fibonacci.fibonacciGenerator(1)));
        System.out.println(Arrays.toString(TwoSum.twoSumNestedLoops(testArray, 21)));
        System.out.println(Arrays.toString(TwoSum.twoSumHashMap(testArray, 21)));
        System.out.println(Solution.arrangeCoins(19));
    }
}
