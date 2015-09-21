package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

public abstract class Container extends Init {

    private BigDecimal width;
    private BigDecimal depth;
    private BigDecimal height;
    private ArrayList<Item> cargoItems = new ArrayList<>();

    protected Container(String width, String depth, String height) {
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
        this.create();
    }

    public BigDecimal getWidth() { return new BigDecimal(this.width.toString()); }

    public BigDecimal getDepth() {
        return new BigDecimal(this.depth.toString());
    }

    public BigDecimal getHeight() { return new BigDecimal(this.height.toString()); }

    public ArrayList<Item> getCargoItems() { return new ArrayList<>(cargoItems); }

    public BigDecimal getTotalCargoPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Item item : this.cargoItems) {
            totalPrice = totalPrice.add(item.getPrice());
        }

        return totalPrice;
    }

    private void setWidth(String width) {
        if (this.errorHandling.stringToDoubleHandle(width) > 0) {
            this.width = new BigDecimal(width, MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container width!");
        }
    }

    private void setDepth(String depth) {
        if (this.errorHandling.stringToDoubleHandle(depth) > 0) {
            this.depth = new BigDecimal(depth, MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container depth!");
        }
    }

    private void setHeight(String height) {
        if (this.errorHandling.stringToDoubleHandle(height) > 0) {
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