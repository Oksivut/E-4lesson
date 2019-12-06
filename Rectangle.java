package com.company;

import com.company.Figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return (length * width);
    }

    @Override
    public double perimeter() {
        return ((length * 2) + (width * 2));
    }

    @Override
    public String toString() {
        return String.format("Name:  %s, Length: %d, Width: %d ", this.getName(), this.length, this.width);
    }
}


