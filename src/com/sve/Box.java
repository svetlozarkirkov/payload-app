package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;

public abstract class Box extends Item {

    private BigDecimal width;
    private BigDecimal depth;
    private BigDecimal height;

    public Box(String name, BigDecimal width, BigDecimal depth, BigDecimal height, BigDecimal price) {
        super(name, width.multiply(depth).multiply(height), price);
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
    }

    public BigDecimal getWidth() {
        return new BigDecimal(this.width.toString());
    }

    public BigDecimal getDepth() {
        return new BigDecimal(this.depth.toString());
    }

    public BigDecimal getHeight() {
        return new BigDecimal(this.height.toString());
    }

    private void setWidth(BigDecimal width) {
        if (width.compareTo(BigDecimal.ZERO) > 0) {
            this.width = new BigDecimal(width.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item width!");
        }
    }

    private void setDepth(BigDecimal depth) {
        if (depth.compareTo(BigDecimal.ZERO) > 0) {
            this.depth = new BigDecimal(depth.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item depth!");
        }
    }

    private void setHeight(BigDecimal height) {
        if (height.compareTo(BigDecimal.ZERO) > 0) {
            this.height = new BigDecimal(height.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item height!");
        }
    }

    @Override
    public String toString() {
        String boxString = super.toString() + "\n" +
                "Width: " + this.getWidth() + "\n" +
                "Height: " + this.getHeight() + "\n" +
                "Depth: " + this.getDepth();

        return boxString;
    }
}
