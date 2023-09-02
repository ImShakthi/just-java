package com.imshakthi.justjava.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void shouldPrintStringValue() {
        Printer<String> printer = new Printer<>("String");
        printer.print();
    }

    @Test
    void shouldPrintIntegerValue() {
        Printer<Integer> printer = new Printer<>(1);
        printer.print();
    }

    @Test
    void shouldPrintDoubleValue() {
        Printer<Double> printer = new Printer<>(1.0);
        printer.print();
    }
}