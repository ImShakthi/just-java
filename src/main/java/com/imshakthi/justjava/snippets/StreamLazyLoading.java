package com.imshakthi.justjava.snippets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLazyLoading {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Without terminal method STARTS....");
        System.out.println(numbers.stream()
                .filter(StreamLazyLoading::lesserThan3)
                .filter(StreamLazyLoading::isEven)
                .collect(Collectors.toList()));
        System.out.println("Without terminal method ENDS......");


        System.out.println("With terminal method STARTS....");
        System.out.println(numbers.stream()
                .filter(StreamLazyLoading::lesserThan3)
                .map(StreamLazyLoading::mul2)
                .filter(StreamLazyLoading::isEven)
                .collect(Collectors.toList()));
        System.out.println("With terminal method");
    }

    private static boolean isEven(int number) {
        System.out.println("In even");
        return number % 2 == 0;
    }

    private static boolean lesserThan3(int number) {
        System.out.println("lesser than 3");
        return number < 3;
    }

    private static int mul2(int number) {
        return number * 2;
    }
}
