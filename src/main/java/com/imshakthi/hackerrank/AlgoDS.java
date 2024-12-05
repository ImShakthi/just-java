package com.imshakthi.hackerrank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
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
}


@Getter
@Setter
@AllArgsConstructor
class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
}