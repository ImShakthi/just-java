package com.imshakthi.leetcode.blind75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTest {
    private Binary testClass;

    @BeforeEach
    void setUp() {
        testClass = new Binary();
    }

    @Nested
    @DisplayName("Sum of two integers")
    class TestSumOfTwoInteger {
        @Test
        void shouldReturnSum() {
            int actual = testClass.sumOfTwoIntegers(10, 18);

            assertEquals(28, actual);
        }
    }

}