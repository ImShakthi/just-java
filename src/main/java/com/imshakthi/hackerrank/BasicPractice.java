package com.imshakthi.hackerrank;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BasicPractice {
    public void stdInAndOut() {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        ;
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n);
    }

    public void printDataTypeRange() {
        List<String> input = List.of("-150", "150000", "1500000000", "213333333333333333333333333333333333", "-100000000000000");

        input.forEach(in -> {
            try {
                long n = Long.parseLong(in);
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(in + " can't be fitted anywhere.");
            }
        });
    }

    public void printEOF() {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        while (scan.hasNext()) {
            System.out.println(counter + scan.nextLine());
            counter++;
        }
    }

    public void printAreaOfParallelogram() {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        int breadth = Integer.parseInt(scan.nextLine());

        if (height >= 0 && breadth >= 0) {
            System.out.println(height * breadth);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public void convertIntToString() {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.println("Good job");

        } catch (InputMismatchException e) {
            System.out.println("Wrong answer");
        }
    }


    public void printAllCurrency() {
        Scanner scan = new Scanner(System.in);
        double amount = scan.nextDouble();
        System.out.println("US: $" + printCurrency(Locale.US, amount));
        System.out.println("India: Rs." + NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(12324.134).substring(1));
        System.out.println("China: " + printCurrency(Locale.CHINA, amount));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(12324.134));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh", "TW")).format(12324.134));
        System.out.println("France: " + printCurrency(Locale.FRANCE, amount) + "€");
    }

    private String printCurrency(Locale type, double amount) {
        return NumberFormat.getCurrencyInstance(type).format(amount).intern();
    }

    public boolean isAnagram(String s1, String s2) {
        return getAnagramSignature(s1).equals(getAnagramSignature(s2));
    }

    private String getAnagramSignature(String input) {
        int[] counter = new int[26];

        char[] c = input.toLowerCase().toCharArray();
        for (char value : c) {
            counter[value - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                sb.append(String.format("%c%d:", ('a' + i), counter[i]));
            }
        }
        return sb.toString();
    }

    public List<String> getSingleTokens(String input) {
        char[] ch = input.toCharArray();
        List<String> output = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            if (isTokenSeparator(c)) {
                if (!sb.isEmpty()) {
                    output.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }
        if (!sb.isEmpty()) {
            output.add(sb.toString());
        }
        ;

        System.out.println(output.size());
        output.forEach(System.out::println);
        return output;
    }

    private boolean isTokenSeparator(char ch) {
        return ch == '!' || ch == ',' || ch == '?' || ch == '.' || ch == '_' || ch == '\'' || ch == '@' || ch == ' ';
    }

}
