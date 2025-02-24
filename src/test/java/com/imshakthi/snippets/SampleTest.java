package com.imshakthi.snippets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {
  private Sample sample;

  @BeforeEach
  void setUp() {
    sample = new Sample();
  }

  @Test
  void getMax() {
    final int actual = sample.getMax();

    assertEquals(10, actual);
  }
}
