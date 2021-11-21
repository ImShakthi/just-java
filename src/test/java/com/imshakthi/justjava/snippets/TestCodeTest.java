package com.imshakthi.justjava.snippets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestCodeTest {

    TestCode testCode;

    @BeforeEach
    void setUp() {
        testCode = new TestCode();
    }

    @Test
    void sayHelloShouldReturnHello() {
        String expected = "hello";
        String actual = testCode.sayHello();

        Assertions.assertSame(expected, actual);
    }
}
