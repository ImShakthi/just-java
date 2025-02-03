package com.imshakthi.snippets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoctoLibAssignmentTest {

    private DoctoLibAssignment testObj;

    @BeforeEach
    void setUp() {
        testObj = new DoctoLibAssignment();
    }

    @Test
    void getAvailableSlotsMustReturn() {
        final var expected = Map.of(
            "2025-01-14", List.of(),
            "2025-01-15", List.of(),
            "2025-01-16", List.of(),
            "2025-01-17", List.of(),
            "2025-01-18", List.of(),
            "2025-01-19", List.of()
        );

        final var actual = testObj.getAvailableSlots(ZonedDateTime.parse("2025-01-14T00:00:00Z"));

        assertEquals(expected, actual);
    }
}