package com.imshakthi.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Arrays {

    // https://leetcode.com/problems/two-sum/
    public int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int balance = target - nums[i];
            if (map.containsKey(balance) && map.get(balance) != i) {
                return new int[]{i, map.get(balance)};
            }
        }
        return null;
    }

    // https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, true);
        }
        return false;
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], true);
                nums[counter] = nums[i];
                counter++;
            }
        }
        return map.size();
    }

}
