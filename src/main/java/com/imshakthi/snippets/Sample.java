package com.imshakthi.snippets;

import java.util.LinkedList;
import java.util.List;

public class Sample {
  public int getMax() {

    List<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(10);

    return list.stream().max(Integer::compare).orElse(0);
  }
}
