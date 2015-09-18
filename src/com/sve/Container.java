package com.sve;

import java.math.BigDecimal;

public abstract class Container {

    private BigDecimal width;
    private BigDecimal depth;
    private BigDecimal height;

    protected Container(double width, double depth, double height) {
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
        this.create();
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = BigDecimal.valueOf(width);
        }
        else {
            throw new IllegalArgumentException("Invalid container width!");
        }
    }

    private void setDepth(double depth) {
        if (depth > 0) {
            this.depth = BigDecimal.valueOf(depth);
        }
        else {
            throw new IllegalArgumentException("Invalid container depth!");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = BigDecimal.valueOf(height);
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
                "Width: " + this.width + "\n" +
                "Depth: " + this.depth + "\n" +
                "Height: " + this.height;

        return containerString;
    }
}