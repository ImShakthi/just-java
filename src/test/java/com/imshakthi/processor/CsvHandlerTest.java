package com.imshakthi.processor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvHandlerTest {

    private CsvHandler handler;

    @BeforeEach
    void setUp() {
        handler = new CsvHandler();
    }

    @Test
    void generate() {
        handler.generate();
    }

}