package com.company;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return String.format("Name:  %s, Radius: %d", this.getName(), this.radius);
    }
}

