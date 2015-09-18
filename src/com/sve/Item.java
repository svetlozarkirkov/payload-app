package com.sve;

import java.math.BigDecimal;

public abstract class Item {

    private static final double MAX_NAME_LENGTH = 25;

    private String name;
    private BigDecimal width;
    private BigDecimal depth;
    private BigDecimal height;
    private BigDecimal price;

    protected Item(String name, double width, double depth, double height, double price) {
        this.setName(name);
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
        this.setPrice(price);
        this.create();
    }

    private void setName(String name) {
        if (name.length() > 0 && name.length() < MAX_NAME_LENGTH) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid item name!");
        }
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = BigDecimal.valueOf(width);
        }
        else {
            throw new IllegalArgumentException("Invalid item width!");
        }
    }

    private void setDepth(double depth) {
        if (depth > 0) {
            this.depth = BigDecimal.valueOf(depth);
        }
        else {
            throw new IllegalArgumentException("Invalid item depth!");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = BigDecimal.valueOf(height);
        }
        else {
            throw new IllegalArgumentException("Invalid item height!");
        }
    }

    private void setPrice(double price) {
        if (price >= 0) {
            this.price = BigDecimal.valueOf(price);
        }
        else {
            throw new IllegalArgumentException("Invalid item price!");
        }
    }

    protected abstract void create();

    @Override
    public String toString() {
        String itemString =
                "Name: " + this.name + "\n" +
                "Width: " + this.width + "\n" +
                "Depth: " + this.depth + "\n" +
                "Height: " + this.height + "\n" +
                "Price: " + this.price;

        return itemString;
    }
}