package org.example;

public class Sphere implements Shape3DInterface {
    private double radius;

    public Sphere(double radius) {
        this.radius = Math.round(radius * 100.0) / 100.0; // Round to 2 decimal places
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return String.format("Sphere (radius: %.2f)", radius);
    }
}
