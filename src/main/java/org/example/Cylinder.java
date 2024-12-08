package org.example;

public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = Math.round(radius * 100.0) / 100.0; // Round to 2 decimal places
        this.height = Math.round(height * 100.0) / 100.0;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder (radius: %.2f, height: %.2f)", radius, height);
    }
}
