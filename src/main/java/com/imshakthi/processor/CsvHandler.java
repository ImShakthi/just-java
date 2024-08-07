package com.imshakthi.processor;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvHandler {
    public void generate() {
        int index = 0;
        try (Reader reader = Files.newBufferedReader(Paths.get("src/main/java/com/imshakthi/processor/quotes.csv"))) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                String[] line;
                while ((line = csvReader.readNext()) != null) {
                    index++;
                    if (index < 2000) {
                        continue;
                    }
                    String data = String.format("INSERT INTO QUOTES(index, data, author, tags) VALUES(%s,'%s','%s','%s');",
                        index,
                        replaceDouble(line[0]),
                        replaceDouble(line[1]),
                        replaceDouble(line[2]));
                    System.out.println(data);
                    if (index == 4000) {
                        break;
                    }
                }
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String replaceDouble(final String input) {
        return input.replaceAll("'", "''");
    }
}
