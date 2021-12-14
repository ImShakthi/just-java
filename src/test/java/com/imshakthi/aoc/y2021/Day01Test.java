package com.imshakthi.aoc.y2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day01Test {

    Day01 testObj;

    @BeforeEach
    void setUp() {
        testObj = new Day01();
    }

    @Test
    void printDepthIncr() {
        testObj.printDepthIncr();
    }

    @Test
    void getDepthIncrShouldReturnValid() {
        Integer[] input = new Integer[]{199, 200, 208, 210, 200, 207, 240, 269, 260, 263};

        int actual = testObj.getDepthIncr(input);

        assertEquals(7, actual);
    }

    @Test
    void getDepthTripleIncrShouldReturnValid() {
        Integer[] input = new Integer[]{199, 200, 208, 210, 200, 207, 240, 269, 260, 263};

        int actual = testObj.getDepthTripleIncr(input);

        assertEquals(5, actual);
    }
}
