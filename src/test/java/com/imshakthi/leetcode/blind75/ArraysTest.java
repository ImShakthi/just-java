package com.imshakthi.leetcode.blind75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    Arrays testClass;

    @BeforeEach
    void setUp() {
        testClass = new Arrays();
    }

    @Test
    void twoSumsShouldReturnSumIndices() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};

        int[] actual = testClass.twoSums(nums, target);

        assertArrayEquals(actual, expected);
    }

    @Test
    void containsDuplicateShouldReturnTrue() {
        int[] nums = new int[]{1, 2, 3, 1};

        boolean actual = testClass.containsDuplicate(nums);

        assertTrue(actual);
    }

    @Test
    void containsDuplicateShouldReturnFalse() {
        int[] nums = new int[]{1, 2, 3, 4};

        boolean actual = testClass.containsDuplicate(nums);

        assertFalse(actual);
    }

    @Test
    void removeDuplicatesShouldUniqueMethod() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expected = new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4};

        int nofDuplicates = testClass.removeDuplicates(nums);

        assertEquals(5, nofDuplicates);
        assertArrayEquals(expected, nums);
    }

    @Test
    void maxProfitShouldReturnProfitOfTwoDays() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        int profit = testClass.maxProfit(prices);

        assertEquals(7, profit);
    }

    @Test
    void maxProfitShouldReturnProfitWhen() {
        int[] prices = new int[]{1, 2, 3, 4, 5};

        int profit = testClass.maxProfit(prices);

        assertEquals(4, profit);
    }

    @Test
    void maxProfitShouldReturnZeroWhenProfitIsNotPossible() {
        int[] prices = new int[]{7, 6, 4, 3, 1};

        int profit = testClass.maxProfit(prices);

        assertEquals(0, profit);
    }

    @Test
    void plusOneReturnOneIncrValue() {
        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        int[] expected = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7};

        int[] actual = testClass.plusOne(digits);

        assertArrayEquals(expected, actual);
    }

    @Test
    void plusOneReturnTenForNine() {
        int[] digits = {9};
        int[] expected = {1, 0};

        int[] actual = testClass.plusOne(digits);

        assertArrayEquals(expected, actual);
    }
}