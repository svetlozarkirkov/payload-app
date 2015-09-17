package com.sve;

import java.math.BigDecimal;

public class Cylinder extends Item {

    public Cylinder(String name, double width, double depth, double height, BigDecimal price) {
        super(name, width, depth, height, price);
    }

    @Override
    void Create() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}