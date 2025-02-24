package com.imshakthi.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasicPracticeTest {

  BasicPractice testClass;

  @BeforeEach
  public void setUp() {
    testClass = new BasicPractice();
  }

  @Test
  public void shouldPrintFemaleNames() {
    testClass.printDataTypeRange();
  }

  @Test
  public void shouldReturnTrueWhenInputIsAnagram() {
    assertTrue(testClass.isAnagram("hello", "olleh"), "Given input is valid anagram.");
  }

  @Test
  public void shouldReturnJavaTokens() {
    //        List<String> expected = testClass.getSingleTokens("He is a very very good boy, isn't
    // he?");
    List<String> expected =
        testClass.getSingleTokens(
            "           YES      leading spaces        are valid,    problemsetters are         evillllll?");

    assertNotNull(expected);
    assertEquals(8, expected.size());
  }

  @Test
  public void isStringBalanced_shouldReturnTrueWhenStringIsBalanced() {
    final var actual =
        testClass.isStringBalanced(List.of("{}()", "{()}", "({()})", "{}(", "({)}", "((", "}{"));
    final var expected = List.of(true, true, true, false, false, false, false);

    assertEquals(expected, actual);
  }

  @Test
  void printAllCurrency() {
    testClass.printAllCurrency();
  }

  @Test
  void testBigDecimal() {

    final List<String> input =
        List.of("9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000");
    final List<String> expected =
        List.of("90", "56.6", "50", "02.34", "0.12", ".12", "0", "000.000", "-100");

    final var actual = testClass.testBigDecimal(input);

    assertEquals(expected, actual);
  }
}
