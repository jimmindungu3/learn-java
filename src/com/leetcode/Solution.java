package com.leetcode;

public class Solution {
    public static int arrangeCoins(int n) {
        int rowsCounter = 0;
        int lastRowSize = 0;
        int remainingCoins = n;

        while (remainingCoins > lastRowSize) {
            remainingCoins -= lastRowSize + 1;
            lastRowSize++;
            rowsCounter++;
        }

        return rowsCounter;
    }
}
