package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;

public abstract class Item {

    private static final int MAX_ITEM_NAME_LENGTH = 25;

    private String name;
    private BigDecimal volume;
    private BigDecimal price;

    protected Item(String name, BigDecimal volume, BigDecimal price) {
        this.setName(name);
        this.setVolume(volume);
        this.setPrice(price);
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getVolume() {
        return new BigDecimal(this.volume.toString());
    }

    public BigDecimal getPrice() {
        return new BigDecimal(this.price.toString());
    }

    private void setName(String name) {
        if (name.length() > 0 && name.length() < MAX_ITEM_NAME_LENGTH) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid item name!");
        }
    }

    private void setVolume(BigDecimal volume) {
        if (volume.compareTo(BigDecimal.ZERO) > 0) {
            this.volume = new BigDecimal(volume.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item volume!");
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

    @Override
    public String toString() {
        String itemString =
                "Name: " + this.getName() + "\n" +
                "Volume: " + this.getVolume() + "\n" +
                "Price: " + this.getPrice();

        return itemString;
    }
}