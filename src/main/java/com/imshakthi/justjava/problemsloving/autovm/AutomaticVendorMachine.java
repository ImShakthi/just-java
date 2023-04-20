package com.imshakthi.justjava.problemsloving.autovm;

import com.imshakthi.justjava.problemsloving.autovm.models.FoodItem;

import java.util.List;

import static com.imshakthi.justjava.problemsloving.autovm.models.Menu.getFoodItems;

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
        return getFoodItems();
    }
}
