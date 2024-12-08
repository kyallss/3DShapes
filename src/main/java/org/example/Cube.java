package org.example;

public class Cube implements Shape3DInterface {
    private double side;

    public Cube(double side) {
        this.side = Math.round(side * 100.0) / 100.0; // Round to 2 decimal places
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("Cube (side: %.2f)", side);
    }
}

