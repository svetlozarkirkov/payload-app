package com.sve;

import java.math.BigDecimal;
import java.math.MathContext;

public class Cylinder extends Item {

    private BigDecimal radius;
    private BigDecimal width;

    public Cylinder(String name, BigDecimal radius, BigDecimal width, BigDecimal price) {
        super(name, width.multiply(new BigDecimal(Math.PI)).multiply(radius).multiply(radius), price);
        this.setRadius(radius);
        this.setWidth(width);
    }

    public BigDecimal getRadius() {
        return new BigDecimal(this.radius.toString());
    }

    public BigDecimal getWidth() {
        return new BigDecimal(this.width.toString());
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
    public String toString() {
        String cylinderString = super.toString() + "\n" +
                "Radius: " + this.getRadius() + "\n" +
                "Width: " + this.getWidth();

        return cylinderString;
    }
}