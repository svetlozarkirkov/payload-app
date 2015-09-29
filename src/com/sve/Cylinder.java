package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;

public class Cylinder extends Item {

    private BigDecimal radius;
    private BigDecimal width;

    public Cylinder(String name, BigDecimal radius, BigDecimal width, BigDecimal price) {
        super(name, price);
        this.setRadius(radius);
        this.setWidth(width);
    }

    public BigDecimal getRadius() {
        return this.radius.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public BigDecimal getWidth() {
        return this.width.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    private void setRadius(BigDecimal radius) {
        if (radius.compareTo(BigDecimal.ZERO) > 0) {
            this.radius = new BigDecimal(radius.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item radius!");
        }
    }

    private void setWidth(BigDecimal width) {
        if (width.compareTo(BigDecimal.ZERO) > 0) {
            this.width = new BigDecimal(width.toString(), MathContext.DECIMAL128);
        }
        else {
            throw new IllegalArgumentException("Invalid item width!");
        }
    }

    @Override
    public BigDecimal getVolume() {
        return this.getWidth()
                .multiply(new BigDecimal(Math.PI))
                .multiply(this.getRadius())
                .multiply(this.getRadius())
                .setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    public String toString() {
        String cylinderString = super.toString() + "\n" +
                "Radius: " + this.getRadius() + "\n" +
                "Width: " + this.getWidth();

        return cylinderString;
    }
}