package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

public class Container {

    private BigDecimal width;
    private BigDecimal depth;
    private BigDecimal height;
    private ArrayList<Item> cargoItems = new ArrayList<>();

    protected Container(BigDecimal width, BigDecimal depth, BigDecimal height) {
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
    }

    public BigDecimal getWidth() {
        return this.width.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public BigDecimal getDepth() {
        return this.depth.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public BigDecimal getHeight() {
        return this.height.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public BigDecimal getTotalCargoPrice() {
        return this.getCargoItems()
                .stream().map(Item::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public ArrayList<Item> getCargoItems() {
        return new ArrayList<>(this.cargoItems);
    }

    public BigDecimal getCargoItemsTotalVolume() {
        return this.getCargoItems()
                .stream().map(Item::getVolume)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public void addItemToContainer(Item item) {
        this.cargoItems.add(item);
    }

    private void setWidth(BigDecimal width) {
        if (width.compareTo(BigDecimal.ZERO) > 0) {
            this.width = new BigDecimal(width.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container width!");
        }
    }

    private void setDepth(BigDecimal depth) {
        if (depth.compareTo(BigDecimal.ZERO) > 0) {
            this.depth = new BigDecimal(depth.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container depth!");
        }
    }

    private void setHeight(BigDecimal height) {
        if (height.compareTo(BigDecimal.ZERO) > 0) {
            this.height = new BigDecimal(height.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container height!");
        }
    }

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