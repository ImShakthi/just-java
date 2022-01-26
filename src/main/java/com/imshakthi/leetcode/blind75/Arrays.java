package com.imshakthi.leetcode.blind75;

import java.math.BigDecimal;
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

    public int maxProfit(int[] prices) {
        int valley, peak;
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; ) {

            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];

            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];

            maxprofit += peak - valley;
        }
        return maxprofit;
    }

    public int[] plusOne(int[] digits) {
        BigDecimal input = BigDecimal.ZERO;
        for (int i = 0; i < digits.length; i++) {
            BigDecimal power = new BigDecimal(String.valueOf(Math.pow(10, i)));
            BigDecimal individualNum = BigDecimal.valueOf(digits[digits.length - i - 1]).multiply(power);
            input = input.add(individualNum);
        }
        input = input.add(BigDecimal.ONE);



        String onePlus = String.valueOf(input);
        int[] result = new int[onePlus.length()];
        for (int i = 0; i < onePlus.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(onePlus.charAt(i)));
        }
        return result;
    }
}