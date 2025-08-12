package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumNestedLoops(int[] numbs, int target) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static int[] twoSumHashMap(int[] numbs, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbs.length; i++) {
            int complement = target - numbs[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] {numToIndex.get(complement), i};
            } else {
                numToIndex.put(numbs[i], i);
            }
        }
        return new int[] {};
    }
}
