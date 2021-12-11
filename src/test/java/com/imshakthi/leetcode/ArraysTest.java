package com.imshakthi.leetcode;

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
        assertArrayEquals(nums, expected);
    }
}