package com.imshakthi.justjava.generics;

public class Printer<T> {

    private final T data;

    public Printer(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println(this.data);
    }
}
