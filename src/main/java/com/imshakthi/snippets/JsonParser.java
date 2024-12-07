package com.imshakthi.snippets;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

    public void parse(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Person person = mapper.readValue(json, Person.class);
            System.out.println(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

record Person(String name, int age, String gender) {
}
