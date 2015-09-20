package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Container {

    private BigDecimal width;
    private BigDecimal depth;
    private BigDecimal height;
    private Collection<Item> cargoItems = new ArrayList<>();
    private BigDecimal totalCargoPrice;

    protected Container(String width, String depth, String height) {
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
        this.create();
    }

    public BigDecimal getWidth() { return this.width; }

    public BigDecimal getDepth() {
        return this.depth;
    }

    public BigDecimal getHeight() { return this.height; }

    public BigDecimal getTotalCargoPrice() {
        return this.totalCargoPrice;
    }

    private void setWidth(String width) {
        if (Double.parseDouble(width) > 0) {
            this.width = new BigDecimal(width, MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container width!");
        }
    }

    private void setDepth(String depth) {
        if (Double.parseDouble(depth) > 0) {
            this.depth = new BigDecimal(depth, MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container depth!");
        }
    }

    private void setHeight(String height) {
        if (Double.parseDouble(height) > 0) {
            this.height = new BigDecimal(height, MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container height!");
        }
    }

    public void addItemToContainer(Item item) {
        this.cargoItems.add(item);
    }

    protected abstract void create();

    protected abstract void fill();

    @Override
    public String toString() {
        String containerString =
                "Width: " + this.getWidth() + "\n" +
                "Depth: " + this.getDepth() + "\n" +
                "Height: " + this.getHeight() + "\n" +
                "Total cargo price: " + this.getTotalCargoPrice();

        return containerString;
    }
}