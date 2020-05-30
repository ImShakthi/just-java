package com.imshakthi.justjava.doubts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imshakthi.justjava.doubts.impl.OperationEvent;
import com.imshakthi.justjava.doubts.interfaces.Event;

public class Sandbox {
    public static void main(String[] args) {
        Event event = new OperationEvent();
        System.out.println(event.getUsername());

        dummy(event);
    }

    private static void dummy(Object event) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(objectMapper.writeValueAsString(event));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
