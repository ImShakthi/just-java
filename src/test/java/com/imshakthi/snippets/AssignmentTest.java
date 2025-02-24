package com.imshakthi.snippets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssignmentTest {

  private Assignment assignment;

  @BeforeEach
  void setUp() {
    assignment = new Assignment();
  }

  @Test
  void getCounter() {
    assertEquals(1, assignment.getCounter("input 1"));
    assertEquals(2, assignment.getCounter("input 1"));
    assertEquals(3, assignment.getCounter("input 1"));
    assertEquals(4, assignment.getCounter("input 1"));

    assertEquals(1, assignment.getCounter("input 2"));
  }
}
