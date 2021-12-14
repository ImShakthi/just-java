package com.imshakthi.aoc.y2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Day01 {

    public void printDepthIncr() {
        try {
            Path path = Paths.get("src/main/java/com/imshakthi/aoc/y2021/inputs/day01_1.txt");

            List<String> inputs = Files.readAllLines(path);

            Integer[] i = inputs.stream().map(Integer::valueOf).collect(Collectors.toList()).toArray(Integer[]::new);
            System.out.println(getDepthIncr(i));

            System.out.println(getDepthTripleIncr(i));

        } catch (IOException ioe) {
            System.err.println("error in " + ioe);
        }
    }

    public int getDepthIncr(final Integer[] input) {
        int counter = 0;

        int currentDepth = input[0];
        for (int i = 1; i < input.length; i++) {
            if (currentDepth < input[i]) {
                counter++;
            }
            currentDepth = input[i];
        }
        return counter;
    }

    public int getDepthTripleIncr(final Integer[] input) {
        int counter = 0;

        int currentDepth = input[0] + input[1] + input[2];
        for (int i = 2; i < input.length - 1; i++) {
            int sum = input[i - 1] + input[i] + input[i + 1];
            if (currentDepth < sum) {
                counter++;
            }
            currentDepth = sum;
        }
        return counter;
    }

}
