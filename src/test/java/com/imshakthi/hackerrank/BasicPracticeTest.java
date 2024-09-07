package com.imshakthi.hackerrank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BasicPracticeTest {

    BasicPractice testClass;

    @BeforeEach
    public void setUp() {
        testClass = new BasicPractice();
    }

    @Test
    public void shouldPrintFemaleNames() {
        testClass.printDataTypeRange();
    }

    @Test
    public void shouldReturnTrueWhenInputIsAnagram() {
        assertTrue(testClass.isAnagram("hello", "olleh"), "Given input is valid anagram.");
    }

    @Test
    public void shouldReturnJavaTokens() {
//        List<String> expected = testClass.getSingleTokens("He is a very very good boy, isn't he?");
        List<String> expected = testClass.getSingleTokens("           YES      leading spaces        are valid,    problemsetters are         evillllll?");

        assertNotNull(expected);
        assertEquals(8, expected.size());
    }
}