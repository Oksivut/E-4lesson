package com.company;

public abstract class Figure {
    private String name ;
    private double perimeter;
    private double area;

    public Figure(String name) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract double perimeter();
    public abstract double area();

}
