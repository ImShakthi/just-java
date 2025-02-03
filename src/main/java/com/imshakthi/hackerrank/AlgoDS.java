package com.imshakthi.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class AlgoDS {

  // https://www.hackerrank.com/challenges/sparse-arrays
  public List<Integer> sparseArrays(final List<String> stringList, final List<String> queries) {
    Map<String, Integer> counter = new HashMap<>();

    stringList.forEach(s -> counter.put(s, counter.getOrDefault(s, 0) + 1));

    return queries.stream().map(n -> counter.getOrDefault(n, 0)).toList();
  }

  // https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
  public boolean isCyclic(final SinglyLinkedListNode head) {
    List<SinglyLinkedListNode> counter = new ArrayList<>();
    SinglyLinkedListNode current = head;
    while (current != null) {
      if (counter.contains(current)) {
        return true;
      }
      counter.add(current);
      current = current.getNext();
    }
    return false;
  }

  public int findMergeNode(final SinglyLinkedListNode head1, final SinglyLinkedListNode head2) {
    Map<SinglyLinkedListNode, Boolean> visitIndex = new HashMap<>();

    SinglyLinkedListNode current = head1;
    while (current != null) {
      visitIndex.put(current, true);
      current = current.getNext();
    }

    current = head2;
    while (current != null) {
      if (visitIndex.get(current) != null && visitIndex.get(current)) {
        return current.getData();
      }
      current = current.getNext();
    }
    return 0;
  }

  // https://www.hackerrank.com/challenges/tag-content-extractor/
  public List<String> extractTagContent(final List<String> input) {
    return input.stream().map(this::extractTagContent).flatMap(List::stream).collect(Collectors.toList());
  }

  private List<String> extractTagContent(final String input) {
    final var result = new ArrayList<String>();
    final Stack<String> tags = new Stack<>();

    int contentStartIndex = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '<') {
        final String tagName = getTagName(input, i + 1);
        if (tagName.contains("/")) {
          final var tagWithoutClosing = tagName.replace("/", "");
          if (tags.pop().equals(tagWithoutClosing)) {
            final var content = input.substring(contentStartIndex, i);
            if (!content.contains("</")) {
              result.add(content);
            }
          } else {
            result.add("None");
          }
        } else {
          contentStartIndex = i + tagName.length() + 2;
          tags.push(tagName);
        }

        i += tagName.length();
      }
    }

    return result;
  }

  private String getTagName(final String input, final int i) {
    final StringBuilder builder = new StringBuilder();
    IntStream.range(i, input.length())
        .mapToObj(input::charAt)
        .takeWhile(ch -> ch != '>')
        .forEach(builder::append);
    return builder.toString();
  }
}

@Getter
@Setter
@AllArgsConstructor
class SinglyLinkedListNode {
  int data;
  SinglyLinkedListNode next;
}
