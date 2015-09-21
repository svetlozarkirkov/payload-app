package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;

public abstract class Item extends Init {

    private static final double MAX_ITEM_NAME_LENGTH = 25;

    private String name;
    private BigDecimal width;
    private BigDecimal depth;
    private BigDecimal height;
    private BigDecimal price;

    protected Item(String name, String width, String depth, String height, String price) {
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
        return this.width;
    }

    public BigDecimal getDepth() {
        return this.depth;
    }

    public BigDecimal getHeight() {
        return this.height;
    }

    public BigDecimal getPrice() { return this.price; }

    private void setName(String name) {
        if (name.length() > 0 && name.length() < MAX_ITEM_NAME_LENGTH) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid item name!");
        }
    }

    private void setWidth(String width) {
        if (this.errorHandling.checkNumberParsing(width) > 0) {
            this.width = new BigDecimal(width, MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item width!");
        }
    }

    private void setDepth(String depth) {
        if (this.errorHandling.checkNumberParsing(depth) > 0) {
            this.depth = new BigDecimal(depth, MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item depth!");
        }
    }

    private void setHeight(String height) {
        if (this.errorHandling.checkNumberParsing(height) > 0) {
            this.height = new BigDecimal(height, MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item height!");
        }
    }

    private void setPrice(String price) {
        if (this.errorHandling.checkNumberParsing(price) >= 0) {
            this.price = new BigDecimal(price, MathContext.DECIMAL128);
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