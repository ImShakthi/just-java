package com.imshakthi.justjava.problemsloving.autovm.models;

import com.google.common.collect.ImmutableList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.imshakthi.justjava.problemsloving.autovm.models.ItemType.DRINKS;
import static com.imshakthi.justjava.problemsloving.autovm.models.ItemType.SNACKS;

public final class Menu {

    private static Menu instance;

    private Menu() {
    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    List<FoodItem> initData() {
        return getFoodItems();
    }

    public static List<FoodItem> getFoodItems() {
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
