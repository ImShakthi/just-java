package com.imshakthi.snippets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonParserTest {

    JsonParser testParser;

    @BeforeEach
    void setUp() {
        testParser = new JsonParser();
    }

    @Test
    void parseShouldReturnValidResponse() {
        testParser.parse("{\"name\":\"sakthi\",\"age\":30,\"gender\":\"male\"}");
    }
}