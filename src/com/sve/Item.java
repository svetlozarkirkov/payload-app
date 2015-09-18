package com.sve;

import java.math.BigDecimal;

public abstract class Item {

    private static final double MAX_NAME_LENGTH = 25;

    private String name;
    private double width;
    private double depth;
    private double height;
    private BigDecimal price;

    protected Item(String name, double width, double depth, double height, BigDecimal price) {
        this.setName(name);
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
        this.setPrice(price);
        this.Create();
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
            this.width = width;
        }
        else {
            throw new IllegalArgumentException("Invalid item width!");
        }
    }

    private void setDepth(double depth) {
        if (depth > 0) {
            this.depth = depth;
        }
        else {
            throw new IllegalArgumentException("Invalid item depth!");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
        else {
            throw new IllegalArgumentException("Invalid item height!");
        }
    }

    private void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) >= 0) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException("Invalid item price!");
        }
    }

    abstract void Create();

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