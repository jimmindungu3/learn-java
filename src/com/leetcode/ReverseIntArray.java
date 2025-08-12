package com.leetcode;

public class ReverseIntArray {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void reverseArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }

        // Optional: print result
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(numbs);
    }
}
