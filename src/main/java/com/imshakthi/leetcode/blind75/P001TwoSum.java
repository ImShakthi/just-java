package com.imshakthi.leetcode.blind75;

import java.util.HashMap;
import java.util.Map;

public class P001TwoSum {
    public int[] getSumIndices(int[] input, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            valueIndexMap.put(input[i], i);
        }

        int[] targetIndices = new int[2];
        for (int i = 0; i < input.length; i++) {
            int diff = target - input[i];
            if (valueIndexMap.containsKey(diff) && i != valueIndexMap.get(diff)) {
                targetIndices[0] = i;
                targetIndices[1] = valueIndexMap.get(diff);
                break;
            }
        }
        return targetIndices;
    }
}
