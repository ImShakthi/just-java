package com.imshakthi.justjava.problemsloving.autovm;

import com.google.common.collect.ImmutableList;
import com.imshakthi.justjava.problemsloving.autovm.models.FoodItem;
import com.imshakthi.justjava.problemsloving.autovm.models.Menu;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.imshakthi.justjava.problemsloving.autovm.models.ItemType.DRINKS;
import static com.imshakthi.justjava.problemsloving.autovm.models.ItemType.SNACKS;

public class AutomaticVendorMachine {
    public static void main(String[] args) {
        System.out.println("Automatic vendor machine");
        AutomaticVendorMachine machine = new AutomaticVendorMachine();

//        List<FoodItem> foodItems = Menu.g.initData();
//
//        foodItems.forEach(System.out::println);
//
//
//        try (Scanner scanner = new Scanner(System.in)) {
//
//            System.out.println("Enter the amount=");
//            int amount = scanner.nextInt();
//
//        } catch (Exception e) {
//            System.out.println("Exception due to " + e);
//        }
    }

    private List<FoodItem> initData() {
        return ImmutableList.<FoodItem>builder().add(new FoodItem("Coke", 7, DRINKS))
                .add(new FoodItem("Lemonade", 10, DRINKS))
                .add(new FoodItem("Orange juice", 11, DRINKS))
                .add(new FoodItem("Milkshake", 15, DRINKS))
                .add(new FoodItem("Potato Chips", 10, SNACKS))
                .add(new FoodItem("Cracker", 12, SNACKS))
                .add(new FoodItem("Popcorn", 5, SNACKS))
                .add(new FoodItem("Cashew", 15, SNACKS))
                .build().stream().sorted(Comparator.comparing(FoodItem::getPrice).reversed()).collect(Collectors.toList());
    }
}
