package com.imshakthi.hackerrank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AlgoDSTest {

    private AlgoDS algoDS;

    @BeforeEach
    void setUp() {
        algoDS = new AlgoDS();
    }

    @Test
    void sparseArraysShouldReturnWhen() {
        List<String> stringList =
//            List.of("ab", "ab", "abc");
//            List.of("def", "de", "fgh");
            List.of("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf");
        List<String> queries =
//            List.of("ab", "abc", "bc");
//            List.of("de", "lmn", "fgh");
            List.of("abcde", "sdaklfj", "asdjf", "na", "basdn");
        List<Integer> expected =
//            List.of(2, 1, 0);
//            List.of(1, 0, 1);
            List.of(1, 3, 4, 3, 2);

        var actual = algoDS.sparseArrays(stringList, queries);

        assertEquals(expected, actual);
    }

    @Test
    void isCyclicShouldReturnFalseWhenListIsNotCyclic() {
        SinglyLinkedListNode input = new SinglyLinkedListNode(1, null);
        SinglyLinkedListNode second = new SinglyLinkedListNode(2, null);
        input.setNext(second);
        SinglyLinkedListNode third = new SinglyLinkedListNode(3, null);
        second.setNext(third);

        assertFalse(algoDS.isCyclic(input));
    }

    @Test
    void isCyclicShouldReturnTrueWhenListIsCyclic() {
        SinglyLinkedListNode input = new SinglyLinkedListNode(1, null);
        SinglyLinkedListNode second = new SinglyLinkedListNode(2, null);
        input.setNext(second);
        SinglyLinkedListNode third = new SinglyLinkedListNode(3, null);
        second.setNext(input);

        assertTrue(algoDS.isCyclic(input));
    }

    @Test
    void findMergeNodeShouldReturn() {
        SinglyLinkedListNode h1 = new SinglyLinkedListNode(1, null);
        SinglyLinkedListNode h2 = new SinglyLinkedListNode(1, null);
        SinglyLinkedListNode l2 = new SinglyLinkedListNode(2, null);
        SinglyLinkedListNode l3 = new SinglyLinkedListNode(3, null);

        h1.setNext(l2);
        h2.setNext(l2);
        l2.setNext(l3);
        assertEquals(2, algoDS.findMergeNode(h1, h2));

        h1.setNext(l2);
        h2.setNext(l3);
        l2.setNext(l3);
        assertEquals(3, algoDS.findMergeNode(h1, h2));
    }
}