package com.imshakthi.leetcode.blind75;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P001TwoSumTest {

    private P001TwoSum testClass;

    @BeforeEach
    void setUp() {
        testClass = new P001TwoSum();
    }

    @Test
    void shouldReturnTwoSumsCase1() {
        int[] input = {2, 7, 11, 15};
        int[] expected = new int[]{0, 1};

        int[] actual = testClass.getSumIndices(input, 9);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnTwoSumsCase2() {
        int[] input = {3, 2, 4};
        int[] expected = new int[]{1, 2};

        int[] actual = testClass.getSumIndices(input, 6);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnTwoSumsCase3() {
        int[] input = {3, 3};
        int[] expected = new int[]{0, 1};

        int[] actual = testClass.getSumIndices(input, 6);

        Assertions.assertArrayEquals(expected, actual);
    }
}