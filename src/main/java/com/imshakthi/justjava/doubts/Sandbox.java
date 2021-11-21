package com.imshakthi.justjava.doubts;

import com.imshakthi.justjava.doubts.impl.OperationEvent;
import com.imshakthi.justjava.doubts.interfaces.Event;

public class Sandbox {
    public static void main(String[] args) {
        Event event = new OperationEvent();
        System.out.println(event.getUsername());
    }
}
