package com.imshakthi.justjava.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTest {
    @Test
    public void shouldPrintFemaleNames() {
        Simple simple = new Simple();

        simple.generate();
    }

    @Test
    public void shouldReturnIncrementValue(){
        Simple simple = new Simple();

        int actual = simple.incrBy(10, 3);

        assertEquals(actual, 13, "increment doesn't works");
    }
}