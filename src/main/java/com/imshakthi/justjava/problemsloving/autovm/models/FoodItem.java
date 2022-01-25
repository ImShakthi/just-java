package com.imshakthi.justjava.problemsloving.autovm.models;

public class FoodItem {
    private String name;
    private int price;
    private ItemType type;

    public FoodItem(String name, int price, ItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s[%s] = %d", name, type, price);
    }
}
