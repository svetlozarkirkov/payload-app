package com.sve;

public abstract class Container {

    private double width;
    private double depth;
    private double height;

    protected Container(double width, double depth, double height) {
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
        else {
            throw new IllegalArgumentException("Invalid container width!");
        }
    }

    private void setDepth(double depth) {
        if (depth > 0) {
            this.depth = depth;
        }
        else {
            throw new IllegalArgumentException("Invalid container depth!");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
        else {
            throw new IllegalArgumentException("Invalid container height!");
        }
    }

    abstract void Create();

    abstract void Fill();

    @Override
    public String toString() {
        String containerString =
                "Width: " + this.width + "\n" +
                "Depth: " + this.depth + "\n" +
                "Height: " + this.height;

        return containerString;
    }
}