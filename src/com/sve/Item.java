package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;

public abstract class Item {

    private static final int MAX_ITEM_NAME_LENGTH = 25;

    private String name;
    private BigDecimal price;

    protected Item(String name, BigDecimal price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    private void setName(String name) {
        if (name.length() > 0 && name.length() < MAX_ITEM_NAME_LENGTH) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid item name!");
        }
    }

    private void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) >= 0) {
            this.price = new BigDecimal(price.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item price!");
        }
    }

    public abstract BigDecimal getVolume();

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" +
                "Volume: " + this.getVolume() + "\n" +
                "Price: " + this.getPrice();
    }
}