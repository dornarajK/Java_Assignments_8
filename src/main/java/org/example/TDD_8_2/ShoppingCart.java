package org.example.TDD_8_2;

import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {

    // Map: item name -> its price (assuming unique names for simplicity)
    private final Map<String, Double> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }


    public void addItem(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        items.put(name, price);
    }


    public boolean removeItem(String name) {
        return items.remove(name) != null;
    }


    public int getItemCount() {
        return items.size();
    }


    public double calculateTotal() {
        double total = 0.0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }
}