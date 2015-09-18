package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;

public abstract class Container {

    private BigDecimal width;
    private BigDecimal depth;
    private BigDecimal height;
    private BigDecimal totalCargoPrice;

    protected Container(double width, double depth, double height) {
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
        this.create();
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = new BigDecimal(String.valueOf(width), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container width!");
        }
    }

    private void setDepth(double depth) {
        if (depth > 0) {
            this.depth = new BigDecimal(String.valueOf(depth), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container depth!");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = new BigDecimal(String.valueOf(height), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid container height!");
        }
    }

    protected abstract void create();

    protected abstract void fill();

    @Override
    public String toString() {
        String containerString =
                "Width: " + Formatting.TWO_DECIMAL_PLACES_FORMAT.format(this.width) + "\n" +
                "Depth: " + Formatting.TWO_DECIMAL_PLACES_FORMAT.format(this.depth) + "\n" +
                "Height: " + Formatting.TWO_DECIMAL_PLACES_FORMAT.format(this.height) + "\n" +
                "Total cargo price: " + Formatting.TWO_DECIMAL_PLACES_FORMAT.format(this.totalCargoPrice);

        return containerString;
    }
}