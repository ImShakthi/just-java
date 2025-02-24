package com.imshakthi.codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SnippetsTest {

  private Snippets snippet;

  @BeforeEach
  void setUp() {
    snippet = new Snippets();
  }

  @Nested
  class FloodDepth {
    @Test
    void givenValidRockFloor_whenHasNoLake_thenReturnZero() {
      final int[] input = new int[] {5, 8};

      final var actual = snippet.getDeepestWaterBlock(input);

      assertEquals(0, actual);
    }

    @Test
    void givenValidRockFloor_whenHasLake_thenReturnDeepestWaterBlock() {
      final int[] input = new int[] {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};

      final var actual = snippet.getDeepestWaterBlock(input);

      assertEquals(2, actual);
    }
  }
}
