package com.imshakthi.leetcode.blind75;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayAndHashing {

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

            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) i++;
            valley = prices[i];

            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) i++;
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

    //https://leetcode.com/problems/product-of-array-except-self/
    public int[] getProductOfArrayExceptSelf(int[] input) {
        int length = input.length;
        int[] answer = new int[length];

        answer[0] = 1;
        for (int i = 1; i < length; i++) {
            answer[i] = answer[i - 1] * input[i - 1];
        }

        int suffixProd = 1;
        int size = length - 1;
        for (int i = size; i >= 0; i--) {
            if (i != size) {
                answer[i] = answer[i] * suffixProd;
            }
            suffixProd = input[i] * suffixProd;
        }
        return answer;
    }

    public List<List<String>> groupAnagrams(final String[] input) {
        Map<String, List<String>> data = new HashMap<>();
        Arrays.stream(input).forEach(i -> data.computeIfAbsent(getSignature(i), s -> new ArrayList<>()).add(i));
        return new ArrayList<>(data.values());
    }

    private static String getSignature(String input) {
        int[] counter = new int[26];
        for (char c : input.toCharArray()) {
            counter[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (counter[i] != 0) {
                sb.append((char) (i + 'a')).append(counter[i]);
            }
        }
        return sb.toString();
    }

    // https://leetcode.com/problems/top-k-frequent-elements/
    public List<Integer> getTopKFrequentElements(int noOfOccurrence, List<Integer> nums) {
        Map<Integer, Integer> counter = new HashMap<>();

        nums.forEach(num -> counter.compute(num, (k, v) -> v == null ? 1 : v + 1));

        System.out.println(counter);

        return counter.keySet().stream().sorted((k1, k2) -> counter.get(k2).compareTo(counter.get(k1))).limit(noOfOccurrence).toList();
    }


    //    https://leetcode.com/problems/encode-and-decode-strings/description/
    public String encodeString(List<String> input) {
        StringBuilder sb = new StringBuilder();

        input.forEach(i -> sb.append((char) i.length()).append(i));

        return sb.toString();
    }

    public List<String> decodeString(String input) {
        List<String> result = new ArrayList<>();

        int index = 0;
        int length = input.length();
        while (index < length) {
            int size = input.charAt(index++);
            result.add(input.substring(index, index + size));
            index += size;
        }
        return result;
    }
}
