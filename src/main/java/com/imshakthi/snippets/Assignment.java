package com.imshakthi.snippets;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment {

  private final Map<String, Integer> counter = new ConcurrentHashMap<>();

  // Write a word counter component which can accept words in English and can give you the number of
  // times a given word was accepted.
  public int getCounter(final String input) {

    counter.put(input, counter.getOrDefault(input, 0) + 1);

    return counter.get(input);
  }
}
