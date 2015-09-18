package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

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

    public String getName() {
        return this.name;
    }

    public BigDecimal getWidth() {
        return this.width.setScale(2);
    }

    public BigDecimal getDepth() {
        return this.depth.setScale(2);
    }

    public BigDecimal getHeight() {
        return this.height.setScale(2);
    }

    public BigDecimal getPrice() {
        return this.price.setScale(2);
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
            this.width = new BigDecimal(String.valueOf(width), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item width!");
        }
    }

    private void setDepth(double depth) {
        if (depth > 0) {
            this.depth = new BigDecimal(String.valueOf(depth), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item depth!");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = new BigDecimal(String.valueOf(height), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item height!");
        }
    }

    private void setPrice(double price) {
        if (price >= 0) {
            this.price = new BigDecimal(String.valueOf(price), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item price!");
        }
    }

    protected abstract void create();

    @Override
    public String toString() {
        String itemString =
                "Name: " + this.getName() + "\n" +
                "Width: " + this.getWidth() + "\n" +
                "Depth: " + this.getDepth() + "\n" +
                "Height: " + this.getHeight() + "\n" +
                "Price: " + this.getPrice();

        return itemString;
    }
}